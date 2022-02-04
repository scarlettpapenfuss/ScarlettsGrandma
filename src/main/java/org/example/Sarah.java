package org.example;

public class Sarah extends Grandma {
    public Sarah() {
        super("Sarah");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.charAt(0) == 's') {
            return true;
        }
        else {
            return false;
        }
    }
}
