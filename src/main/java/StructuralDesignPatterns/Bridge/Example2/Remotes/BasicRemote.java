package StructuralDesignPatterns.Bridge.Example2.Remotes;

import StructuralDesignPatterns.Bridge.Example2.Devices.Device;

public class BasicRemote implements Remote {

    // Doesn't need to be a concrete device. An interface is fine.
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.disable();
        }
        else {
            device.enable();
        }
    }

    @Override
    public void volumeInc() {
        device.setVolume(device.getVolume()+1);
    }

    @Override
    public void volumeDec() {
        device.setVolume(device.getVolume()-1);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
}
