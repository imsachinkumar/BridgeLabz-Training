package com.sachin;

import com.sachin.config.HikariConnectionPool;
import com.sachin.ui.ConsoleMenu;

public class Main {
    public static void main(String[] args) {
        try {
            new ConsoleMenu().start();
        } finally {
            HikariConnectionPool.shutdown();
        }
    }
}