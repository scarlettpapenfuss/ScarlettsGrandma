package org.example;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    static List<String> knownWords;

    public static void main(String[] args) {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while ((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scan = new Scanner(System.in);
        Grandma grandma = new Betty();
        System.out.println("Hello! Im grandma " + grandma.getName() + ".");

        int numTries = 5;
        while(numTries > 0) {
            System.out.println("Enter a word to see if I like it or not. ");
            String userGuess = scan.nextLine();
            if(grandma.likesWord(userGuess)){
                System.out.println("Yes! I like that word.");
            }
            if(!grandma.likesWord(userGuess)){
                System.out.println("I hate that word!");
                numTries--;
            }
            if(numTries > 1 || numTries == 0){
                System.out.println("You have " + numTries + " guesses left.");
            }else{
                System.out.println("You have " + numTries + " guess left.");
            }
            if(numTries <= 0){
                System.out.println("You lose! :( ");
            }
        }


    }

}






