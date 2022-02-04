package org.example;

public class Anabelle extends Grandma {
    public Anabelle() { super("Anabelle");
    }

    @Override
    public boolean likesWord(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }


}
