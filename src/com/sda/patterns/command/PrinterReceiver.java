package com.sda.patterns.command;

/**
 */
public class PrinterReceiver implements Receiver{
    @Override
    public void print(String file) {
        System.out.println("File is printing: " + file);
    }

    @Override
    public void scan(String file) {
        System.out.println("File is scanning: " + file);
    }
}
