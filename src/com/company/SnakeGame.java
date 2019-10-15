package com.company;


import com.company.gameObjects.Food;
import com.company.gameObjects.Screen;

import java.util.Random;

import static com.company.gameObjects.Screen.SCREEN_HEIGHT;
import static com.company.gameObjects.Screen.SCREEN_WIGHT;

public class SnakeGame {

   public static void main(String[] args) {
       Screen screen = new Screen();
       Food f = new Food();
       screen.setSymbol(
               getRandomPosOnScreen(SCREEN_HEIGHT),
               getRandomPosOnScreen(SCREEN_WIGHT),
               f.getSymbol());

       screen.printScreen();

   }

    private static Random rnd = new Random();
    private static final int getRandomPosOnScreen (int max)
    {
        return rnd.nextInt(max);
    }
}
