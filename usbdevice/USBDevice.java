package com.emilkowalczyk.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
