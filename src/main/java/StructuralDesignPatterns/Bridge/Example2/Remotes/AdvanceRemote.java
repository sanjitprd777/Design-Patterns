package StructuralDesignPatterns.Bridge.Example2.Remotes;

import StructuralDesignPatterns.Bridge.Example2.Devices.Device;

public class AdvanceRemote extends BasicRemote {

    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
