package com.designpattern.ocp.problem;

public class OpenClosePrincipleProblem {

    public static void main(String[] args) {
        Notification.notifyCustomer(Notification.MessageType.EMAIL, "Your application has been received");
        Notification.notifyCustomer(Notification.MessageType.SMS, "Your application has been received");
    }
}

class Notification {

    static String messageBody;

    static void notifyCustomer(MessageType type, String message) {
        if (type.equals(MessageType.EMAIL)) {
            System.out.println("Email sent. Content is " + message);
        }
        if (type.equals(MessageType.SMS)) {
            System.out.println("Sms sent. Content is " + message);
        }
        if (type.equals(MessageType.PUSH)) {
            System.out.println("Push sent. Content is " + message);
        }
    }

    enum MessageType {
        SMS,
        EMAIL,
        PUSH,
    }
}
