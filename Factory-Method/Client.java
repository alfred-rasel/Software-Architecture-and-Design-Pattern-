/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Rasel
 */
public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        AsteroidsFactory asteroidsFactory;

        if(level == 1) asteroidsFactory = new Level1AsteroidsFactory();
        else asteroidsFactory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();
    }
}