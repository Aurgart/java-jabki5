/**
 * класс товар
 */
public class Item {
    /**
     * цена товара
     */
    private int price;
    /**
     * наименование товара
     */
    private String name;

    /**
     * создаем товар. сумма должна быть больше 0
     *
     * @param name  имя товара
     * @param price цена товар
     */
    public Item(String name, int price) {
        if (price > 0) {
            this.price = price;
            this.name = name;
        }
    }

    /**
     * имя товара
     *
     * @return наименование товар
     */
    public String getItemName() {
        return this.name;
    }

    /**
     * цена товара.
     *
     * @return цену товара
     */
    public int getItemPrice() {
        return this.price;
    }
}