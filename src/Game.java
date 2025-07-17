import java.util.Random;

public class Game {
    /*
    2) Игра «Угадай число»:
       Создайте класс Game с полем secretNumber (private, случайное число от 1 до 100).
       Добавьте метод checkGuess(int guess), возвращающий "Больше", "Меньше" или "Угадал".
     */
    private int secretNumber;

    /**
     * Создание игры
     */
    Game() {
        Random random = new Random();
        this.secretNumber = random.nextInt(100);
    }

    /**
     * Попытка угадать
     * @param guess
     * @return
     */
    public String checkGuess(int guess) {
        if (guess > this.secretNumber) {
            return "Больше";
        } else if (guess < this.secretNumber) {
            return "Меньше";
        } else {
            return "Попал";
        }
    }

    /**
     * Завершаем игру, возвращем число, и рандомим новое.
     * @return
     */
    public String finishGame() {
        String answer = "Число было: " + this.secretNumber;
        Random random = new Random();
        this.secretNumber = random.nextInt(100);
        return answer;
    }
}
