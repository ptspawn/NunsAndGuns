package org.academiadecodigo.bootcamp.Projectiles;

import org.academiadecodigo.bootcamp.Interfaces.ProjectileType;
import org.academiadecodigo.bootcamp.Interfaces.Drawable;
import org.academiadecodigo.bootcamp.Interfaces.Movable;
import org.academiadecodigo.notsosimplegraphics.graphics.Canvas;
import org.academiadecodigo.notsosimplegraphics.pictures.Picture;

import static org.academiadecodigo.bootcamp.GameEngine.VectorMath.getRotationFromVector;


/**
 * Created by codecadet on 02/06/2018.
 */
public class Bullet extends Projectile implements Drawable, Movable {

    private double xPos;
    private double yPos;
    private Picture bullet;
    private double[] screenDim;
    private double[] orientation;

    public Bullet(double xPos, double yPos, double[] orientation) {
        super(orientation, ProjectileType.BULLET.getDamage(), ProjectileType.BULLET.getSpeed());
        this.xPos = xPos;
        this.yPos = yPos;
        this.orientation = orientation;
        this.screenDim = Canvas.getInstance().getScreenDimentions();
        this.bullet = new Picture(xPos, yPos, "Bullets/Bullet.png");
        bullet.rotate(getRotationFromVector(orientation, bullet, Math.PI / 2));
        draw();
        //Canvas.getInstance()
    }

    @Override
    public void move() {

        if (bullet.getX() < 0 - bullet.getWidth() || bullet.getX() > screenDim[0] || bullet.getY() < 0 || bullet.getY() > screenDim[1]) {
            bullet.delete();
            System.out.println("stop at " + bullet.getX() + " " + bullet.getY());
            return;
        }
        bullet.translate(orientation[0] * super.getSpeed(), orientation[1] * super.getSpeed());
    }

    @Override
    public void move(double[] vector) {

    }

    @Override
    public void move(boolean[] directions, double[] orientation) {

    }

    @Override
    public void draw() {
        bullet.draw();
    }


    @Override
    public String toString() {
        return "Bullet{ damage: " + getDamage() + " speed: " + getSpeed() + " }";
    }
}
