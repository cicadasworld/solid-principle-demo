package com.designpattern.dip.problem;

public class DependencyInversionPrincipleProblem {

    public static void main(String[] args) {
        NotifyCustomer mail = new NotifyCustomer(new MailService());
        mail.notifyCustomerByMail();
        NotifyCustomer sms = new NotifyCustomer(new SmsService());
        sms.notifyCustomerBySms();
    }
}

class MailService {
    public void sendEmail() {
        System.out.println("Email sent to the customer.");
    }
}

class SmsService {
    public void sendSms() {
        System.out.println("SMS sent to the customer.");
    }
}

class NotifyCustomer {
    private MailService mailService;
    private SmsService smsService;

    NotifyCustomer(MailService mailService) {
        this.mailService = mailService;
    }

    NotifyCustomer(SmsService smsService) {
        this.smsService = smsService;
    }

    public void notifyCustomerByMail() {
        mailService.sendEmail();
    }

    public void notifyCustomerBySms() {
        smsService.sendSms();
    }
}
