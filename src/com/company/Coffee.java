package com.company;

public class Coffee extends Drinks {
    private Sort sort;
    public void makeCoffee (int milkMl, int coffeeMl){
        System.out.println(" Coffee " + coffeeMl+ " Milk "+ milkMl + " ");
    }
    final private void makeCoffee (int coffeeMl){
        System.out.println(" Coffee "+ coffeeMl + " ") ;

    }

    public Sort getSort() {
        return sort;
    }

    public Coffee(String name, int ml, Sort sort) {
        super(name, ml);
        this.sort = sort;
    }
}
