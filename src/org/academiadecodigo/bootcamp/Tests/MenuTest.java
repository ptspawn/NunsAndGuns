package org.academiadecodigo.bootcamp.Tests;

import org.academiadecodigo.bootcamp.GameEngine.InputManager;
import org.academiadecodigo.bootcamp.MenuScreens.MainMenu;

/**
 * Created by codecadet on 04/06/2018.
 */
public class MenuTest {

    public static void main(String[] args) {


        InputManager input = new InputManager();
        MainMenu mainMenu = new MainMenu();
        double[] mousePosition=input.getMousePos();

        while (true){

            if (input.getDirections()[0]==true){

                //se estiver a ir para cima
            }

        }
    }
}