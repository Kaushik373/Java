
import java.util.Scanner;

public class Bike{
    private String name;
    private Double price;
    private Double mileage;
    //tostring:
    public String toString(){
        return "Name: "+name+" price: "+price+" Mileage: "+mileage;
    }
    
    //getter and setter:
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public Double getPrice(){
        return price;
    }
    public void setMileage(Double mileage){
        this.mileage=mileage;
    }
    public Double getMileage(){
        return mileage;
    }
    
    
    //constructors:
    public Bike(){
        this.name="Yamaha";
        this.price=123000.0;
        this.mileage=20.0;
    }	 	  	 	 	 	 		   	  	    	 	
    
    public Bike(String name){
        this.name=name;
    }
    
    public Bike(String name,Double price,Double mileage){
        this.name=name;
        this.price=price;
        this.mileage=mileage;
    }
    
    public Bike(Bike b){
        //this.name=b.name;
        this.price=b.price;
        this.mileage=b.mileage;
    }
    
    public static void main(String[] args){
        Bike bikeOne=new Bike();
        Bike bikeTwo=new Bike("Apache",110000.0,35.0);
        Bike bikeThree=new Bike(bikeTwo);
        bikeThree.setName("Pulsar");
        System.out.println(bikeOne.toString());
        System.out.println(bikeTwo.toString());
        System.out.println(bikeThree.toString());
    
    }
}	 	  	 	 	 	 		   	  	    	 	
