package com.company;

public class Necklace extends Jewelry {
    public Necklace(Master creation1, Master creation2, Master creation3) {
        super(creation1, creation2, creation3);
    }
    @Override
    public void manufacture() {
        System.out.println("You chose the necklace. ");
        creation1.sale();
        creation2.sale();
        creation3.sale();
    }
}

