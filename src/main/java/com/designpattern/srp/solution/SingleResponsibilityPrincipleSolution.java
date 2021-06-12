package com.designpattern.srp.solution;

public class SingleResponsibilityPrincipleSolution {

    public static void main(String[] args) {
        ContentService service = new ContentServiceImpl();
        service.writeMessage("Hi, Welcome to Java Design Pattern");
        service.replaceMessageContent("Hi", "Hello");
    }
}

interface ContentService {

    void writeMessage(String msg);

    void replaceMessageContent(String source, String destination);
}

interface MessageService {

    void printMessage(String content);

    void sendMessage(String content);
}

class ContentServiceImpl implements ContentService {

    String content;
    MessageService service = new MessageServiceImpl();

    @Override
    public void writeMessage(String msg) {
        content = msg;
        service.printMessage(content);
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
        service.printMessage(content);
    }
}

class MessageServiceImpl implements MessageService {

    @Override
    public void printMessage(String content) {
        System.out.println("Message is \"" + content + "\"");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println("Message Sent and the content is \"" + content + "\"");
    }
}
