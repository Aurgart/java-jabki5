import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {

    void walletTest() {
        Wallet lopatnik = new Wallet("Bogach", 1000);
        System.out.println("Хозяин лопатника: " + lopatnik.getOwner() + " на кармане: " + lopatnik.getMoney());
        lopatnik.setMoney(-10);
        Assertions.assertEquals(1000, lopatnik.getMoney());
        System.out.println("Хозяин лопатника: " + lopatnik.getOwner() + " на кармане: " + lopatnik.getMoney());
        // подкинем бабла
        lopatnik.setMoney(lopatnik.getMoney() + 1500);
        // а теперь потратимся
        lopatnik.spendMoney(2000);
        System.out.println("Хозяин лопатника: " + lopatnik.getOwner() + " на кармане: " + lopatnik.getMoney());
        lopatnik.spendMoney(20);
        System.out.println("Хозяин лопатника: " + lopatnik.getOwner() + " на кармане: " + lopatnik.getMoney());
        lopatnik.spendMoney(700);
        System.out.println("Хозяин лопатника: " + lopatnik.getOwner() + " на кармане: " + lopatnik.getMoney());
    }

    void gameTest() {
        Game loservile = new Game();
        System.out.println("Попытка 1: число " + 42 + " .Ответ:" + loservile.checkGuess(42));
        System.out.println("Попытка 2: число " + 19 + " .Ответ:" + loservile.checkGuess(19));
        System.out.println("Попытка 3: число " + 83 + " .Ответ:" + loservile.checkGuess(83));
        System.out.println(loservile.finishGame());
    }

    @Test
    void tvTest() {
        Tv telik = new Tv();
        System.out.println("Канал " + telik.getCurrentChannel() + " громкость " + telik.getVolume());
        telik.setCurrentChannel(50);
        System.out.println("Канал " + telik.getCurrentChannel() + " громкость " + telik.getVolume());
        telik.nextChannel();
        Assertions.assertEquals(1, telik.getCurrentChannel());
        System.out.println("Канал " + telik.getCurrentChannel() + " громкость " + telik.getVolume());
        telik.setVolume(120);
        Assertions.assertEquals(10, telik.getVolume());
        System.out.println("Канал " + telik.getCurrentChannel() + " громкость " + telik.getVolume());
        telik.setVolume(80);
        Assertions.assertEquals(80, telik.getVolume());
        System.out.println("Канал " + telik.getCurrentChannel() + " громкость " + telik.getVolume());
    }

    @Test
    void orderTest() {
        Order zakaz1 = new Order();
        // Шузы
        Item tapok = new Item("Тапок", 100);
        Item botinok = new Item("Боты", 50);
        zakaz1.addItem(tapok);
        zakaz1.addItem(botinok);
        zakaz1.getOrderInfo();
        // Докинем подкрадули
        Item podkraduli = new Item("Подкрадули", 250);
        zakaz1.addItem(podkraduli);
        zakaz1.getOrderInfo();
        // Заказы на шмот
        List<Item> shmotki = new ArrayList<>();
        Item coat = new Item("Пальто", 1000);
        Item pants = new Item("Брюки", 500);
        shmotki.add(coat);
        shmotki.add(pants);
        Order zakaz2 = new Order(shmotki);
        Item govnodav = new Item("Говнодавы", -1000);
        zakaz2.addItem(govnodav);
        zakaz2.getOrderInfo();
        Assertions.assertEquals(1500, zakaz2.getTotalPrice());
    }
}