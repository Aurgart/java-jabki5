public class Item {
    private int price;
    private String name;

    /**
     * создаем товар. сумма должна быть больше 0
     * @param name
     * @param price
     */
    Item(String name, int price) {
        if (price > 0) {
            this.price = price;
            this.name = name;
        }
    }

    /**
     * имя товара
     * @return
     */
    public String getItemName() {
        return this.name;
    }

    /**
     * цена товара.
     * @return
     */
    public int getItemPrice() {
        return this.price;
    }
}