package com.company;

final public class Latte extends Coffee {
    private String type;
    private Decor decor;

    public Latte(String name, int ml, Sort sort, String type, Decor decor) {
        super(name, ml, sort);
        this.type = type;
        this.decor = decor;
    }

    public String getType() {
        return type;
    }

    public Decor getDecor() {
        return decor;
    }

    @Override
    public void makeCoffee(int milkMl, int coffeeMl) {
        super.makeCoffee(milkMl, coffeeMl);
        System.out.println(" " + decor.getHoney() + decor.getMilk() + decor.getSyrup());
    }
    public void copy (Latte latte2 ){
        this.type = latte2.getType();

    }
}
