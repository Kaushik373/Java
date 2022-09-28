package sem3.inheritance;

import java.time.LocalDate;


public class student extends person{
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
