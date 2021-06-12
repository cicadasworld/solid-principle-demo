package com.designpattern.isp.problem;

public class InterfaceSegregationPrincipleProblem {

    public static void main(String[] args) {
        DrinkMachine coffee = new CoffeeMachine();
        coffee.prepareCoffee();
        DrinkMachine tea = new TeaMachine();
        tea.prepareTea();
    }
}

interface DrinkMachine {

    void prepareCoffee();

    void prepareTea();

}

class CoffeeMachine implements DrinkMachine {

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing Coffee.");
    }

    @Override
    public void prepareTea() {
        // Empty implementation
    }
}

class TeaMachine implements DrinkMachine {

    @Override
    public void prepareCoffee() {
        // Empty implementation
    }

    @Override
    public void prepareTea() {
        System.out.println("Preparing Tea.");
    }
}