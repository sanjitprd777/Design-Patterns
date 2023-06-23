package StructuralDesignPatterns.Bridge.Example2.Devices;

public class Radio implements Device {
    boolean enabled = false;
    int volume = 0;
    int channel = 1;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 100) {
            this.volume = 100;
        }
        else if (volume < 0) {
            this.volume = 0;
        }
        else {
            this.volume = volume;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "enabled=" + enabled +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
