package sem3.basics;

/* @author: Kaushik Tellakula
 * @topic: checking the different data types available to store a given data in java
 * @data: 23-07-2022
 */

public class Variables {
    public static void main(String[] args) {
        System.out.println("Enter the values");
        byte val1=96;
        short val2=2435;
        int val3= 156345;
        long val4=1341343434L; //here it is necessary to mention L because it assumes the value as int
        float val5=334.54f;//here it is necessary to mention f because it assumes by default the value assinged is double
        double val6=4324343.45245234;
        char ch='a';
        String str="hello this kaushik";
        boolean val7= true;

        System.out.println(val1);


    }
    
}
