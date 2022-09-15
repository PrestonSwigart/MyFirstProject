import java.util.Scanner;

/**
 * simple ask-a-question, only main
 * @author PrestonSwigart
 * @version 9.13.22
 */
public class WhatIsYourFavorite {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your favorite movie? ");
        String movie = in.nextLine();
        System.out.println(movie + " is terrible, how do you like it?");
        System.out.println("I'm just messing with you, " + movie + " is pretty good");
    }
}
