package ch9;

/**
 * @author jimmy xu
 * @date 2020/9/2 17:15
 */
public class Tv {

    private int channel;
    private int volumeLevel;
    private boolean on;

    public Tv() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        volumeLevel = volume;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        volumeLevel--;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
