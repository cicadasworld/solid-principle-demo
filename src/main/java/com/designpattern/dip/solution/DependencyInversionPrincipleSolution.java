package com.designpattern.dip.solution;

public class DependencyInversionPrincipleSolution {

    public static void main(String[] args) {
        NotifyCustomer email = new NotifyCustomer(new EmailService());
        email.notifyCustomer();
        NotifyCustomer sms = new NotifyCustomer(new SmsService());
        sms.notifyCustomer();
    }
}

interface NotifyService {

    void notifyCustomer();
}

class EmailService implements NotifyService {

    @Override
    public void notifyCustomer() {
        System.out.println("Email sent to the customer.");
    }
}

class SmsService implements NotifyService {

    @Override
    public void notifyCustomer() {
        System.out.println("Sms sent to the customer.");
    }
}

class NotifyCustomer {

    NotifyService service;

    public NotifyCustomer(NotifyService service) {
        this.service = service;
    }

    public void notifyCustomer() {
        service.notifyCustomer();
    }
}
