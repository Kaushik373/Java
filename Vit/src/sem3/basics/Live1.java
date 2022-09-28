package sem3.basics;

/*
*Reg.no:21BCE2022
*Date:4-8-2022
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;
public class Live1 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Console con=System.console();
        String itemName[]={"Dal","Rice","Pepper"};
        int itemPrice[]={50,60,20};
        int itemAvailability[]={5,5,5};
        ArrayList<Integer> cartInfo= new ArrayList<Integer>();
        
        
        while(true){
            System.out.print("Do you want to add items? (Yes/No):");
            String response=con.readline();
            sc.nextLine();
            
            if(response=="Yes"){
                displayGroceryItems();
                System.out.print("Choose an Item Code:");
                int itemCode= sc.nextInt();
                if(itemAvailability[itemCode]>0){
                    cartInfo.add(itemCode);
                    itemAvailabilty[itemCode]--;
                    displayCart();
                }
                else{
                    System.out.println("Sorry, the item is out of stock");
                }
                continue;
            }	 	  	 	 	 	 		   	  	    	 	
            else{
                break;
            }
            
        }
    }
    public static void displayGroceryItems(){
        System.out.println("**********************");
        System.out.println("Item code: Name");
        for(int i=0;i<3;i++){
            System.out.print(i);
            System.out.print(GroceryBasket.itemName[i]);
            System.out.print(" (");
            System.out.print(GroceryBasket.itemAvailability[i]);
            System.out.print(')');
            
            
        }
        System.out.println("**********************");
    }
    public static void displayCart(){
        System.out.println("items in your cart: ");
        for(Integer value: cartInfo){
            System.out.println("Item code: "+value+", Name: "+itemName[value]+", price:"+itemPrice[value]);
        }
        
    }
}