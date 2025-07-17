import java.sql.Struct;

public class Wallet {
    /*
    Класс «Кошелек»:
           Поля:
                owner (private),
                money (private).
           Конструктор с параметрами owner, money.
           Геттеры и сеттеры с валидацией:
                money не может быть отрицательным.
                Метод spend(int amount), уменьшающий money.
     */
    private String owner;
    private int money;

    /**
     * Создаем богатея
     *
     * @param owner
     * @param money
     */
    Wallet(String owner, int money) {
        this.owner = owner;
        if (money > 0) {
            this.money = money;
        } else {
            System.out.println("Бабло не может быть отрицательным!");
        }
    }

    /**
     * Узнать кто у нас богатый.
     *
     * @return
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Получить сумму на кармане
     *
     * @return
     */
    public int getMoney() {
        return this.money;
    }

    /**
     * установить богатея
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Установить бабло
     *
     * @param money
     */
    public void setMoney(int money) {
        if (money > 0) {
            this.money = money;
        } else {
            System.out.println("Бабло не может быть отрицательным!");
        }
    }

    /**
     * Потратится
     *
     * @param summ
     * @return
     */
    public int spendMoney(int summ) {
        if (this.money - summ > 0) {
            this.money = this.money - summ;
        } else {
            System.out.println("У тебя стока нету!");
        }
        return this.money;
    }
}
