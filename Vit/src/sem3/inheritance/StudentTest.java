package sem3.inheritance;

import java.time.LocalDate;
/*
class person {
    private String name;
    private LocalDate dob;

    public person(){

    }
    public person(String name, LocalDate dob){
        this.name=name;
        this.dob=dob;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDob(LocalDate dob){
        this.dob=dob;
    }

    public String getName(){
        return this.name;
    }
    public LocalDate getDob(){
        return this.dob;
    }

    public String toString(){
        return "[Name: %s, Date of birth: %s]".formatted(this.getName(),this.getDob());
    }
}

class student extends person{
    private String regNo;
    private String degree;

    public student(){

    }
    public student(String name, LocalDate dob, String regNo, String degree){
        super(name, dob);
        this.regNo=regNo;
        this.degree=degree;
    }
    
    public void setRegNo(String regNo){
        this.regNo=regNo;
    }
    public void setDegree(String degree){
        this.degree=degree;
    }

    public String getRegNo(){
        return this.regNo;
    }
    public String getDegree(){
        return this.degree;
    }

    public String toString(){
        return "[name: %s ,dob: %s ,regno: %s ,degree: %s ]".formatted(super.getName(),super.getDob(),this.getRegNo(),this.getDegree());
    }
}
*/

public class StudentTest extends student {
    public static void main(String args[]){
        student stud[]=new student[3];
        stud[1]=new student("kaushik",LocalDate.of(2003,10,16),"21BCE2022","Btech");
        System.out.println(stud[1].toString());

    }
}
