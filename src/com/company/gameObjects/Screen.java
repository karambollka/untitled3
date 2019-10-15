package com.company.gameObjects;

public class Screen {

    public static final int SCREEN_HEIGHT=20;
    public static final int SCREEN_WIGHT=20;

    private char [][] screen;

    public Screen() {
        screen = new char[SCREEN_HEIGHT][SCREEN_WIGHT];
            for (int i = 0; i < SCREEN_HEIGHT; i++) {
                for (int j = 0; j < SCREEN_WIGHT; j++) {
                    screen[i][j] = ' ';
                }
            }
        setUpWall();
    }

    public void setScreen(char[][] screen) {
        this.screen = screen;
    }

    public char[][] getScreen() {
        return screen;
    }

    public void setSymbol (int x, int y, char symbol){
        screen [x][y] = symbol;
    }
    public void printScreen() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIGHT; j++) {
                System.out.print(screen[i][j]);
            }
            System.out.println();
        }
    }

    public void setVerticalRow(int row, char wallSymbol) {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            screen[i][row] = wallSymbol;
        }
    }
    public void setHorizontalRow(int row, char wallSymbol) {
        for (int i = 0; i < SCREEN_WIGHT; i++) {
            screen[row][i] = wallSymbol;
        }
    }

    private void setUpWall(){
        Wall w = new Wall();

        setVerticalRow(0, w.getSymbol());
        setVerticalRow(SCREEN_WIGHT-1, w.getSymbol());
        setHorizontalRow(0, w.getSymbol());
        setHorizontalRow(SCREEN_HEIGHT-1,w.getSymbol());
    }

}
