package com.sda.patterns.command;

/**
 */
public class ScanCommand implements Command {
    private Receiver receiver;

    ScanCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String file) {
        receiver.scan(file);
    }
}
