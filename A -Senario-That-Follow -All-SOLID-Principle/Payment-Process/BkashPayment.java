/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineshopping;

/**
 *
 * @author Rasel
 */
public class BkashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Bkash payment processed.");
    }
}