package com.sda.patterns.command;

/**
 */
public class CommandClient {
    public static void main(String[] args) {
        Receiver printer = new PrinterReceiver();

        PrintCommand printCommand = new PrintCommand(printer);
        ScanCommand scanCommand = new ScanCommand(printer);

        Program program = new Program();
        program.invokeCommand(printCommand, "File to print");
        program.invokeCommand(scanCommand, "File to scan");
    }
}
