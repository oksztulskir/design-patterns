package com.sda.patterns.command;

/**
 */
public class PrintCommand implements Command {
    private Receiver receiver;

    PrintCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String file) {
        receiver.print(file);
    }
}
