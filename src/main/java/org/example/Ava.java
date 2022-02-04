package org.example;

public class Ava extends Grandma {
    public Ava() {super("Ava");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() == 3) {
            return true;
        } else {
            return false;
        }

    }
}