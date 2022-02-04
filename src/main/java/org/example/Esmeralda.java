package org.example;

public class Esmeralda extends Grandma {
    public Esmeralda() { super("Esmeralda");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length() >= 8){
            return true;
        }else{
            return false;
        }
    }
}
