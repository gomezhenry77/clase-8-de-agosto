package com.mycompany.dealership;

public class Van extends Vehicle {
    private boolean overturn;
    private boolean snorkel;

    public Van(boolean overturn, boolean snorkel, String plate, String brand, boolean available, int coste) {
        super(plate, brand, available, coste);
        this.overturn = overturn;
        this.snorkel = snorkel;
    }

    public boolean getOverturn() {
        return overturn;
    }

    public void setOverturn(boolean overturn) {
        this.overturn = overturn;
    }

    public boolean getSnorkel() {
        return snorkel;
    }

    public void setSnorkel(boolean snorkel) {
        this.snorkel = snorkel;
    }
    public void Carry(String plate, float weight){
        System.out.println("El peso máximo es "+weight);
    }
}
