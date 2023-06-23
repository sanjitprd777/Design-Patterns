package StructuralDesignPatterns.Bridge.Example2;

import StructuralDesignPatterns.Bridge.Example2.Devices.Device;
import StructuralDesignPatterns.Bridge.Example2.Devices.Radio;
import StructuralDesignPatterns.Bridge.Example2.Devices.Television;
import StructuralDesignPatterns.Bridge.Example2.Remotes.AdvanceRemote;
import StructuralDesignPatterns.Bridge.Example2.Remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Television());
        System.out.println();
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Testing device with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        System.out.println(device);
        basicRemote.power();
        basicRemote.volumeInc();
        basicRemote.channelUp();
        System.out.println(device);

        System.out.println("Testing device with Advance remote");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        System.out.println(device);
        advanceRemote.power();
        advanceRemote.mute();
        advanceRemote.channelUp();
        System.out.println(device);
    }
}
