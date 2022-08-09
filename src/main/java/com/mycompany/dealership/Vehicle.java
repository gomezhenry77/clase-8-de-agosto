package com.mycompany.dealership;

public class Vehicle {
    private String plate;
    // Atributos
    private String brand;
    private boolean available;
    private int coste;
    // Métodos constructores
    public Vehicle(){
    }

    public Vehicle(String plate, String brand, boolean available, int coste) {
        this.plate = plate;
        this.brand = brand;
        this.available = available;
        this.coste = coste;
    }

    public Vehicle(String plate, String brand) {
        this.plate = plate;
        this.brand = brand;
    }
    
   // Propiedades (GETs y SETs)

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    //public void buy(String plate, int coste){
      //      System.out.println(coste <= 300000000 ? "El vehículo con placa "+plate+" se ha comprado al costo "+coste :"El vehículo con placa "+plate+" NO se puede comprar al costo "+coste);
       // }
    public String sale(String plate, int price, boolean available){
        return available ? "Se puede vender el vehículo":"No se puede vender el vehículo..."};
}

