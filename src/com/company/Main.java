package com.company;

public class Main {

    public static void main(String[] args) {
        Decor decor = new Decor(true, true, true);
        Drinks drinks = new Drinks(" Beer ", 0.5);
        Coffee coffee = new Coffee(" Americano ", 120, Sort.Arabika);
        Latte latte = new Latte(" Caramel latte ", 220, Sort.Portugal, " Caramel latte ", decor);
        System.out.println(" " + drinks.getName() + drinks.getMl());
        System.out.println(" " + coffee.getName() + " " + coffee.getMl() + " " + coffee.getSort());
        System.out.println(" " + latte.getType() + latte.getName() + latte.getMl() + " "
                + latte.getSort() + " " + latte.getDecor().getSyrup() + " "
                + latte.getDecor().getMilk() + " " + latte.getDecor().getHoney());
        Latte latte2 = new Latte(" Pink latte ", 240, Sort.Turkish, "Raspberry", decor);
        latte.copy(latte2);
        System.out.println(" " + latte.getType() + latte.getName() + latte.getMl() + " "
                + latte.getSort() + " " + latte.getDecor().getSyrup() + " "
                + latte.getDecor().getMilk() + " " + latte.getDecor().getHoney());


    }
}
