package org.example;

public class User {
    private String username;
    private String password;
    private int counter = 0;
    private static int STATIC_COUNTER = 0;

    public int getCounterAndIncrement() {
        counter += 1;
        return counter;
    }

    public int getStaticCounterAndIncrement() {
        STATIC_COUNTER += 1;
        return STATIC_COUNTER;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        this.counter = 0;
    }
}


