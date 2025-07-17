import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    /*
      4) Система заказа:
         Создайте класс Order с полями:
           orderId (read-only, генерируется автоматически).
           items (список товаров, private).
           totalPrice (private, вычисляется при добавлении товара).
         Добавьте методы для добавления товара и получения информации о заказе.
     */
    // Загуглил что так безопаснее с точки зрения многопоточности)
    private static final AtomicInteger count = new AtomicInteger();

    private int orderId;
    private int totalPrice = 0;
    private List<Item> items;

    /**
     * пустой заказ.
     */
    Order() {
        this.items = new ArrayList<>();
        this.orderId = count.incrementAndGet();
    }

    /**
     * заказ с товарами
     * @param items
     */
    Order(List<Item> items) {
        this.orderId = count.incrementAndGet();
        this.items = items;
        for (Item goods : items) {
            this.totalPrice += goods.getItemPrice();
        }
    }

    /**
     * добавляем товар
     * @param product
     */
    public void addItem(Item product) {
        if (product.getItemName() != null) {
            this.items.add(product);
            this.totalPrice += product.getItemPrice();
        }
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
