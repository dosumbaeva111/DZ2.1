package com.company;

public class Decor {
    private boolean syrup;
    private boolean honey;
    private boolean milk;

    public Decor(boolean syrup, boolean honey, boolean milk) {
        this.syrup = syrup;
        this.honey = honey;
        this.milk = milk;
    }

    public String getSyrup() {
        return " syrup = " + syrup;
    }

    public String getHoney() {
        return " honey = " + honey;
    }

    public String getMilk() {
        return " milk = " + milk;
    }

}
