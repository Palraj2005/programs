class Vehicle
{
protected String brand;
public Vehicle(String brand)
{
this.brand=brand;
}
public void displayBrand()
{
System.out.println("Brand:"+brand);
}
}
class Car extends Vehicle
{
private int numOfDoors;
public Car(String brand,int numOfDoors)
{
super(brand);
this.numOfDoors=numOfDoors;
}
public void displayCarInfo()
{
displayBrand();
System.out.println("Number of doors:"+numOfDoors);
}
}
class ElectricCar extends Car
{
private int batteryCapacity;
public ElectricCar(String brand,int numOfDoors,int batteryCapacity)
{
super(brand,numOfDoors);
this.batteryCapacity=batteryCapacity;
}
public void displayElectricCarInfo()
{
displayCarInfo();
System.out.println("BatteryCapacity:"+batteryCapacity+"kwh");
}
}
class Bicycle extends Vehicle
{
private int numOfGears;
public Bicycle(String brand,int numOfGears)
{
super(brand);
this.numOfGears=numOfGears;
}
public void displayBicycleInfo()
{
displayBrand();
System.out.println("Number of gears:"+numOfGears);
}
}
public class InheritanceExample
{
public static void main(String[]args)
{
Car car=new Car("Toyota",4);
car.displayCarInfo();
System.out.println();
ElectricCar electricCar=new ElectricCar("Tesla",2,75);
electricCar.displayElectricCarInfo();
System.out.println();
Bicycle bicycle=new Bicycle("Giant",21);
bicycle.displayBicycleInfo();
}
}