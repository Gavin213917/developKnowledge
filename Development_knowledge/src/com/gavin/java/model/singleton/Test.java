package com.gavin.java.model.singleton;

import static com.gavin.java.model.singleton.EnumSingleton.INSTANCE;

public class Test {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = INSTANCE;
        enumSingleton.whateverMethod();
    }
}
