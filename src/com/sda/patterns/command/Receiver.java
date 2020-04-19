package com.sda.patterns.command;

/**
 */
public interface Receiver {
    void print(String file);

    void scan(String file);
}
