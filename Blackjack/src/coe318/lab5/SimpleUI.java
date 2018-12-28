/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab5;

/**
 *
 * @author Kalp
 */
import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("Casino : " + game.getHouseCards());
        System.out.println("Player : " + game.getYourCards());
        //FIXED
    }

  @Override
    public boolean hitMe() {
        String a;
        System.out.println("");
        System.out.println("Would you like another card yes or no? :  ");
        System.out.println("");
        a = user.next();
        String y = "y";
        if(a.equals(y))
            return true;
        return false;        
        //FIXED
    }

  @Override
    public void gameOver() {
        System.out.println("");
        System.out.println("Casino : "+game.getHouseCards());
        System.out.println("Player : "+game.getYourCards());
        System.out.println("");
        System.out.println("Casino score is : "
                + game.score(game.getHouseCards()));
        System.out.println("Player score is   : " 
                + game.score(game.getYourCards()));
        System.out.println("");
        
       
        
        int h = game.score(game.getHouseCards());
        int y = game.score(game.getYourCards());
        
        if (y <= h && h < 21)
            System.out.println("~~~~~~~ YOU LOST ~~~~~~~");
        else if (h < y && y < 21)
            System.out.println("~~~~~ YOU WON ~~~~~~");
        else if(h > 21 && y < 21)
            System.out.println("~~~~~ YOU WON ~~~~~~");
        else if (y > 21 && h < 21)
            System.out.println("~~~~~~~ YOU LOST ~~~~~~~");
        else
        System.out.println("~~~~~~~ YOU LOST ~~~~~~~");
        System.out.println("");
    }
    }


