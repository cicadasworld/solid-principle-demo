package com.designpattern.ocp.solution;

public class OpenClosePrincipleSolution {

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotificationImpl();
        emailNotification.notifyCustomer("Your application has been received");
        Notification smsNotification = new SmsNotificationImpl();
        smsNotification.notifyCustomer("Your application has been received");
        Notification pushNotification = new PushNotificationImpl();
        pushNotification.notifyCustomer("Your application has been received");
    }
}

abstract class Notification {
    public abstract void notifyCustomer(String messageBody);
}

class EmailNotificationImpl extends Notification {

    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("Email sent. Content is " + messageBody);
    }
}

class SmsNotificationImpl extends Notification {

    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("Sms sent. Content is " + messageBody);
    }
}

class PushNotificationImpl extends Notification {

    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("Push sent. Content is " + messageBody);
    }
}


