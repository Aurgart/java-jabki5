import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Класс заказ
 */
public class Order {
    // Загуглил что так безопаснее с точки зрения многопоточности)
    /**
     * счетчик для получения ид
     */
    private static final AtomicInteger count = new AtomicInteger();

    /**
     * ид заказа его идентификатор
     */
    private int orderId;
    /**
     * общая сумма заказ
     */
    private int totalPrice = 0;
    /**
     * список товаров, (класс Item)
     */
    private List<Item> items = new ArrayList<>();

    /**
     * пустой заказ.
     */
    public Order() {
        this.orderId = count.incrementAndGet();
    }

    /**
     * заказ с товарами
     *
     * @param items
     */
    public Order(List<Item> items) {
        this.orderId = count.incrementAndGet();
        this.items = items;
        for (Item product : items) {
            this.totalPrice += product.getItemPrice();
        }
    }

    /**
     * добавляем товар
     *
     * @param product - товар, экземпляр класса Item
     */
    public void addItem(Item product) {
        if (product.getItemName() != null) {
            this.items.add(product);
            this.totalPrice += product.getItemPrice();
        }
    }

    /**
     * Возвращает сумму
     *
     * @return - общая сумма по заказу
     */
    public int getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * печатаем инфо по заказу.
     */
    public void getOrderInfo() {
        System.out.println("\nИнформация по заказу:");
        System.out.println("Кол-во товаров:" + this.items.size());
        System.out.println("Сумма по заказу:" + this.totalPrice);
        for (Item goods : this.items) {
            System.out.println("Наименование товара: " + goods.getItemName() + " Цена: " + goods.getItemPrice());
        }
    }

}
