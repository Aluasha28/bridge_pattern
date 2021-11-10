package com.company;

public abstract class Jewelry {
    protected Master creation1;
    protected Master creation2;
    protected Master creation3;

    protected Jewelry(Master creation1, Master creation2, Master creation3)
    {
        this.creation1 = creation1;
        this.creation2 = creation2;
        this.creation3 = creation3;
    }

    abstract public void manufacture();
}

