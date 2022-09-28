package sem3.basics;
import java.util.Scanner;

/* @author: Kaushik Tellakula
 * @topic: taking input from user.
 * @data: 24-07-2022
 */

public class percentagecal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks");
        System.out.println("enter first subject marks");
        float sub1= sc.nextFloat();
        System.out.println("enter second subject marks");
        float sub2= sc.nextFloat();
        System.out.println("enter third subject marks");
        float sub3= sc.nextFloat();

        //similarly nextInt() inputs int and so on.

        float percentage=(sub1+sub2+sub3)/3; 

        System.out.println("the percentage is "+percentage);
        System.out.println();
        //for strings
        System.out.println("remark:");
        String remark= sc.nextLine(); //nextline will print the whole statement which is inputed
        //whereas sc.next() will only input the first word of the statement
        System.out.println(remark);

        //for boolean
        boolean b=sc.hasNextInt(); //this checks whether the given number in the input is number or not.
        System.out.println(b);
    }
    
}
