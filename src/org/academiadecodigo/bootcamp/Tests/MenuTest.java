package org.academiadecodigo.bootcamp.Tests;

import org.academiadecodigo.bootcamp.GameEngine.InputManager;
import org.academiadecodigo.bootcamp.MenuScreens.MainMenu;
import org.academiadecodigo.notsosimplegraphics.graphics.*;
import org.academiadecodigo.notsosimplegraphics.graphics.Canvas;

import java.awt.*;

/**
 * Created by codecadet on 04/06/2018.
 */
public class MenuTest {

    public static void main(String[] args) throws InterruptedException {

        InputManager input = new InputManager();
        MainMenu mainMenu = new MainMenu();
        double[] mousePosition;

        /*while (true) {

            mousePosition = input.getMousePos();

            mainMenu.checkButton(mousePosition);
            mainMenu.instructionsSlide(mousePosition);
            mainMenu.quiting(mousePosition);
            Canvas.getInstance().repaint();

            Thread.sleep(50);


        }*/


    }
}
