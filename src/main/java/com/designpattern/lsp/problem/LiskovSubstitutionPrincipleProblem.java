package com.designpattern.lsp.problem;

public class LiskovSubstitutionPrincipleProblem {

    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachine();
        coffee.prepareDrink();
//        coffee.addMilk();
        TeaMachine tea = new TeaMachine();
        tea.prepareDrink();
        tea.addMilk();
    }

}

abstract class Machine {
    public void prepareDrink() {
        System.out.println("Drink Prepared");
    }

    public abstract void addMilk();
}

class CoffeeMachine extends Machine {

    @Override
    public void addMilk() {
        try {
            throw new Exception("Not Supported Operation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void prepareDrink() {
        System.out.println("Coffee has been prepared.");
    }
}

class TeaMachine extends Machine {

    @Override
    public void addMilk() {
        System.out.println("Milk Added.");
    }

    @Override
    public void prepareDrink() {
        System.out.println("Tea has been prepared with Milk.");
    }
}
