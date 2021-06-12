package com.designpattern.lsp.solution;

public class LiskovSubstitutionPrincipleSolution {

    public static void main(String[] args) {
        Machine coffee = new CoffeeMachine();
        coffee.prepareDrink();
        Machine tea = new TeaMachine();
        tea.addMilk();
        tea.prepareDrink();
        Machine milkShake = new MilkShake();
        milkShake.addMilk();
        milkShake.prepareDrink();
    }
}

abstract class Machine {

    public abstract void prepareDrink();

    public void addMilk() {
        System.out.println("Mild Added");
    }
}

class CoffeeMachine extends Machine {

    @Override
    public void prepareDrink() {
        System.out.println("Coffee has been prepared.");
    }
}

class TeaMachine extends Machine {

    @Override
    public void addMilk() {
        System.out.println("Milk Added");
    }

    @Override
    public void prepareDrink() {
        System.out.println("Tea has been prepared with Milk.");
    }
}

class MilkShake extends Machine {
    @Override
    public void addMilk() {
        System.out.println("Milk Added in Shake");
    }

    @Override
    public void prepareDrink() {
        System.out.println("MilkShake has been prepared with Milk");
    }
}
