public class Tv {
    /*
    3) Класс «Телевизор»:
           Поля:
                currentChannel (private),
                volume (private).
           Геттеры и сеттеры:
                volume может быть от 0 до 100.currentChannel от 1 до 50.
           Метод nextChannel() увеличивает канал на 1.
    */
    private int currentChannel;
    private int volume;

    /**
     * Создаем телик, канал 1 грмокость 10
     */
    Tv() {
        this.currentChannel = 1;
        this.volume = 10;
    }

    /**
     * текущий канал
     * @return
     */
    public int getCurrentChannel() {
        return this.currentChannel;
    }

    /**
     * громкость
     * @return
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     * установить канал
     * @param currentChannel
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
     * @param volume
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
