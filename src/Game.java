import java.util.Random;

/**
 * Класс игра "Угадай число"
 */
public class Game {
    /**
     * число для угадывания.
     */
    private int secretNumber;

    /**
     * Создание игры
     */
    public Game() {
        this.secretNumber =  new Random().nextInt(100);
    }

    /**
     * Попытка угадать
     *
     * @param guess
     * @return возвращает угадал или нет.
     */
    public String checkGuess(int guess) {
        if (guess > this.secretNumber) {
            return "Больше";
        } else if (guess < this.secretNumber) {
            return "Меньше";
        }
        return "Попал";
    }

    /**
     * Завершаем игру, возвращем число, и рандомим новое.
     *
     * @return строка с ответом.
     */
    public String finishGame() {
        String answer = "Число было: " + this.secretNumber;
        this.secretNumber = new Random().nextInt(100);
        return answer;
    }
}
