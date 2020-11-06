package com.emilkowalczyk.usbdevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;


    public MemoryStick(String name){
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("MemoryStick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected) {
            System.out.println("Proszę wypnij najpierw kartę pamięci");
            return false;
        } else {
            System.out.println("MemoryStick disconnected");
            return true;
        }
    }

    public void eject(){
        System.out.println("Ejecting Memory Stick");
        ejected = true;
    }

    @Override
    public String getName() {
        return name;
    }
}
