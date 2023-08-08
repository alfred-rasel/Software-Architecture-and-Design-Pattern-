/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineshopping;

/**
 *
 * @author Rasel
 */
public class User {
    public static void main(String[] args) {
        Product product1 = new Product("Coffee", 2.5);
        Product product2 = new Product("Tea", 1.5);
        Product product3 = new Product("Chocolate", 3.0);

        Cart cart = new Cart();

        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);

        PaymentMethod paymentMethod = new BkashPayment();

        Order order = new Order(cart, paymentMethod);
        OrderProcessor orderProcessor = new OnlineOrderProcessor();

        order.processOrder(orderProcessor);


        GP user2 = new GP();

        
        user2.sendSMS();

        user2.sendSMS();

    }
}
