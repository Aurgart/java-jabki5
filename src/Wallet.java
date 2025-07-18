/**
 * Класс «Кошелек»: для хранения суммы денег у человека
 *
 * @author ilemeshev
 */
public class Wallet {
    /**
     * владелец
     */
    private String owner;
    /**
     * деньги у владельца
     */
    private int money;

    /**
     * Создаем богатея
     *
     * @param owner
     * @param money
     */
    public Wallet(String owner, int money) {
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
     * @return имя владельца
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Получить сумму на кармане
     *
     * @return возвращает деньги
     */
    public int getMoney() {
        return this.money;
    }

    /**
     * установить богатея
     *
     * @param owner - кто владелец кошелька
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Установить бабло
     *
     * @param money - сумма на кармане.
     */
    public void setMoney(int money) {
        if (money > 0) {
            this.money = money;
        } else {
            System.out.println("Бабло не может быть отрицательным!");
        }
    }

    /**
     * Потратиться
     *
     * @param summ
     * @return - скока есть.
     */
    public int spendMoney(int summ) {
        if (summ < 0) {
            System.out.println("Нельзя потратить отрицательную сумму.");
            return this.money;
        }
        if (this.money > summ) {
            this.money -= summ;
        } else {
            System.out.println("У тебя стока нету!");
        }
        return this.money;
    }
}
