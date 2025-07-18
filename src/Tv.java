/**
 * класс телек, с возможностью управления.
 */
public class Tv {
    /**
     * текущий канал
     */
    private int currentChannel;
    /**
     * громкость
     */
    private int volume;

    /**
     * Создаем телик, канал 1 грмокость 10
     */
    public Tv() {
        this.currentChannel = 1;
        this.volume = 10;
    }

    /**
     * текущий канал
     * @return канал
     */
    public int getCurrentChannel() {
        return this.currentChannel;
    }

    /**
     * громкость
     * @return громкость
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     * установить канал
     * @param currentChannel - какой канал установить
     */
    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 1 && currentChannel <= 50) {
            this.currentChannel = currentChannel;
        } else {
            System.out.println("У нас всего 50 каналов.");
        }
    }

    /**
     * установить громкость
     * @param volume - новая громкость
     */
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Ты так оглохнешь");
        }
    }

    /**
     * следующий канал
     */
    public void nextChannel() {
        if (this.currentChannel < 50) {
            this.currentChannel++;
        } else {
            this.currentChannel = 1;
        }
    }
}
