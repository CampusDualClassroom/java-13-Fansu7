package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int actualFuel) {
    if (actualFuel < 0){
      System.out.println("La capacidad del tanque de gasolina no puede ser negativa");
    } else{
      this.actualFuel = actualFuel;
    }
  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }
}
