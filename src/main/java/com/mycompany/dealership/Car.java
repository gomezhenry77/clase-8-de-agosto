package com.mycompany.dealership;
//el extends es porque es una clase heredera de la superclase Vehicle
public class Car extends Vehicle{
    private boolean trunk;
    private boolean convertible;
    
    public Car(){}

    public Car(boolean trunk, boolean convertible, String plate, String brand, boolean available, int coste) {
        super(plate, brand, available, coste);
        this.trunk = trunk;
        this.convertible = convertible;
    }

    public boolean getTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    
    public void TestDrive(String plate, String idTest){
        System.out.println("El automóvil con placa "+plate+" está probandose...");
    }

    
    
    
    
    
}
