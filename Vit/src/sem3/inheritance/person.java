package sem3.inheritance;

import java.time.LocalDate;

public class person {
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
