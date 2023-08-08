/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineshopping;

/**
 *
 * @author Rasel
 */

public class Order {
    private Cart cart;
    private PaymentMethod paymentMethod;

    public Order(Cart cart, PaymentMethod paymentMethod) {
        this.cart = cart;
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(OrderProcessor orderProcessor) {
        // Process order, calculate total, etc.

        orderProcessor.processOrder(this);

        System.out.println("Order processed!");
        paymentMethod.processPayment(cart.getTotalPrice());
    }
}
