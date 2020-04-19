package com.sda.patterns.command;

/**
 */
class Program {
    void invokeCommand(Command command, String file) {
        command.execute(file);
    }
}
