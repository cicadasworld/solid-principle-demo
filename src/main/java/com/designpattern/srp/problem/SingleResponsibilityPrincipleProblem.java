package com.designpattern.srp.problem;

public class SingleResponsibilityPrincipleProblem {

    public static void main(String[] args) {
        MessageService service = new MessageServiceImpl();
        service.writeMessage("Hi, Welcome to Java Design Patterns");
        service.printMessage();
        service.replaceMessageContent("Hi", "Hello");
        service.printMessage();
    }
}

interface MessageService {

    void writeMessage(String msg);

    void replaceMessageContent(String source, String destination);

    void printMessage();

    void sendMessage();
}

class MessageServiceImpl implements MessageService {

    String content;

    @Override
    public void writeMessage(String msg) {
        content = msg;
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
    }

    @Override
    public void printMessage() {
        System.out.println("Message is \"" + content + "\"");
    }

    @Override
    public void sendMessage() {
        System.out.println("Message Sent and the content is \"" + content + "\"");
    }
}
