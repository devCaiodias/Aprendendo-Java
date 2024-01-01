package Interfacess.Herdarvscumprircontrato.entities;

import Interfacess.Herdarvscumprircontrato.emun.Color;

public abstract class AbstratcShape implements Shape{
    private Color color;

    public AbstratcShape(){}

    public AbstratcShape(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }
}
