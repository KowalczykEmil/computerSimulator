package com.emilkowalczyk;

import com.emilkowalczyk.drive.HDDDrive;
import com.emilkowalczyk.drive.SSDDrive;
import com.emilkowalczyk.usbdevice.MemoryStick;
import com.emilkowalczyk.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        //HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();

        Computer computer = new Computer(monitor, drive);
        //drive.addFile(new File("Drugi.jpg"));
        //drive.listFiles();

        MemoryStick karta = new MemoryStick("Karta");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(karta);
        computer.addUSBDevice(mouse);
        karta.eject();
        computer.removeUSBDevice(karta);
        computer.removeUSBDevice(mouse);

    }
}
