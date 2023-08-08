/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Rasel
 */
public abstract class ColdDrink implements Item {

	public Packing packing() {
       return new Bottle();
	}

	public abstract float price();
}