package org.academiadecodigo.bootcamp.Field;

import org.academiadecodigo.bootcamp.Interfaces.Drawable;
import org.academiadecodigo.notsosimplegraphics.graphics.Canvas;
import org.academiadecodigo.notsosimplegraphics.graphics.Rectangle;
import org.academiadecodigo.notsosimplegraphics.mouse.Mouse;
import org.academiadecodigo.notsosimplegraphics.pictures.Picture;


/**
 * Created by codecadet on 02/06/2018.
 */
public class Field implements Drawable{

    private Picture bg;
    private Rectangle base;
    private Mouse mouse;

    public Field(String imageSource){

        double[] screenDimentions = Canvas.getInstance().getScreenDimentions();
        System.out.println(screenDimentions[0] + " " + screenDimentions[1]);
        bg=new Picture(0,0,"Bgs/bg.jpg");
        bg.grow((screenDimentions[0]-bg.getWidth())/4,(screenDimentions[1]-bg.getHeight())/4);
        bg.translate((screenDimentions[0]-bg.getWidth())/2,(screenDimentions[1]-bg.getHeight())/2);
        bg.draw();

    }

    public void draw(){

        bg.draw();

    }

    public void preLoadGraphics(){



    }



    public double getWidth(){
        return bg.getWidth();
    }

    public double getHeight(){
        return bg.getHeight();
    }

}
