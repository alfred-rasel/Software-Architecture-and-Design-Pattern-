/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Rasel
 */
public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
