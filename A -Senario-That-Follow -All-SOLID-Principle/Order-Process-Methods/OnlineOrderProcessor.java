/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineshopping;

/**
 *
 * @author Rasel
 */
public class OnlineOrderProcessor implements OrderProcessor {

    @Override
    public void processOrder(Order order) {
        System.out.println("Online order processed.");
    }

}