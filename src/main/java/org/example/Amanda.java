package org.example;

public class Amanda extends Grandma {
    public Amanda() {super("Amanda");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.charAt(0) == 'a'|| str.charAt(0) == 'e'
        || str.charAt(0) == 'i' || str.charAt(0) == 'o'
        || str.charAt(0) == 'u' || str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I'
        || str.charAt(0) == 'O' || str.charAt(0) == 'U'){
            return true;
        }else{
            return false;
        }
    }
}
