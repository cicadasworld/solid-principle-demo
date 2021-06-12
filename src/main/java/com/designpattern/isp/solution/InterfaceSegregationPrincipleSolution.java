package com.designpattern.isp.solution;

public class InterfaceSegregationPrincipleSolution {

    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachineImpl();
        coffee.prepareCoffee();
        TeaMachine tea = new TeaMachineImpl();
        tea.prepareTea();
    }
}

interface CoffeeMachine {
    void prepareCoffee();
}

interface TeaMachine {
    void prepareTea();
}

class CoffeeMachineImpl implements CoffeeMachine {

    @Override
    public void prepareCoffee() {
        System.out.println("Coffee prepared.");
    }
}

class TeaMachineImpl implements TeaMachine {

    @Override
    public void prepareTea() {
        System.out.println("Tea prepared.");
    }
}

class TeaCoffeeMachineImpl implements CoffeeMachine, TeaMachine {

    @Override
    public void prepareCoffee() {
        System.out.println("Tea Coffee prepared.");
    }

    @Override
    public void prepareTea() {
        System.out.println("Tea prepared.");
    }
}
