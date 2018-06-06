package org.academiadecodigo.bootcamp.MenuScreens;

import javafx.scene.input.MouseDragEvent;
import org.academiadecodigo.bootcamp.GameEngine.InputManager;
import org.academiadecodigo.bootcamp.Sound.Sound;
import org.academiadecodigo.notsosimplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.notsosimplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.notsosimplegraphics.mouse.Mouse;
import org.academiadecodigo.notsosimplegraphics.mouse.MouseEvent;
import org.academiadecodigo.notsosimplegraphics.mouse.MouseEventType;
import org.academiadecodigo.notsosimplegraphics.mouse.MouseHandler;
import org.academiadecodigo.notsosimplegraphics.pictures.Picture;
import org.academiadecodigo.notsosimplegraphics.graphics.Canvas;

import java.awt.*;
import java.awt.event.MouseListener;

/**
 * Created by codecadet on 04/06/2018.
 */
public class MainMenu {

    private Picture startPopUp;
    private Picture quitButton;
    private Picture instrutionPanel;
    private Picture informationButton;
    private Picture startButton;
    private Picture menuBackGround;
    private Picture youSuck;
    private Picture title;

    public MainMenu() {

        double[] screenDimentions = Canvas.getInstance().getScreenDimentions();

        menuBackGround = new Picture(0, 0, "Bgs/SplashScreen2_1920.jpg");
        //menuBackGround.scaleToFit(screenDimentions[0],screenDimentions[1]);
        menuBackGround.draw();


        startButton = new Picture(1100, 350, "Bgs/video-play.png");
        startButton.load("Bgs/video-play.png");

        startPopUp = new Picture(1100, 350, "Bgs/2c_go.png");
        startPopUp.load("Bgs/2c_go.png");

        informationButton = new Picture(1805, 850, "Bgs/question.png");
        informationButton.load("Bgs/question.png");

        quitButton = new Picture(1805, 20, "Bgs/Door-Closed.png");
        quitButton.load("Bgs/Door-Closed.png");

        //title = new Picture(1100, 100, "Bgs/rosary.jpg");
        //title.draw();

        instrutionPanel = new Picture(1000, 35, "Bgs/instructions.png");
        instrutionPanel.load("Bgs/instructions.png");


        youSuck = new Picture(1808, 20, "Bgs/middlefinger.png");
        youSuck.load("Bgs/middlefinger.png");
    }

    public void checkButton(double[] mousePos) {

        if (mousePos[0] > startButton.getX()
                && mousePos[0] < startButton.getX() + startButton.getWidth()
                && mousePos[1] > startButton.getY()
                && mousePos[1] < startButton.getY() + startButton.getHeight()) {

            startPopUp.draw();
            Canvas.getInstance().repaint();

        } else {
            startButton.draw();
            Canvas.getInstance().repaint();

        }
    }

    public void instructionsSlide(double[] mousePos) {

        if (mousePos[0] > informationButton.getX()
                && mousePos[0] < informationButton.getX() + informationButton.getWidth()
                && mousePos[1] > informationButton.getY()
                && mousePos[1] < informationButton.getY() + informationButton.getHeight()) {

            quitButton.delete();
            startButton.delete();
            informationButton.delete();
            instrutionPanel.draw();
            Canvas.getInstance().repaint();

        } else {
            startButton.delete();
            quitButton.draw();
            instrutionPanel.delete();
            informationButton.draw();
            Canvas.getInstance().repaint();

        }
    }

    public void quiting(double[] mousePos) {

        if (mousePos[0] > quitButton.getX()
                && mousePos[0] < quitButton.getX() + quitButton.getWidth()
                && mousePos[1] > quitButton.getY()
                && mousePos[1] < quitButton.getY() + quitButton.getHeight()) {

            quitButton.delete();
            youSuck.draw();
            Canvas.getInstance().repaint();

        } else {
            youSuck.delete();
            quitButton.draw();
            Canvas.getInstance().repaint();

        }
    }
}




