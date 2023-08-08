/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineshopping;

/**
 *
 * @author Rasel
 */
public class GmailAndGP implements EmailNotifier, SMSNotifier {

    @Override
    public void sendSMS() {
        System.out.println("GP SMS sent.");
    }

    @Override
    public void sendEmail() {
        System.out.println("Gmail email sent.");
    }
}