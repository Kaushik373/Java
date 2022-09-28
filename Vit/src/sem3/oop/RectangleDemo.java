package sem3.oop;

class Rectangle{
    private double length;
    private double width;

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length =length;
    }
    public void setWidth(double width){
        this.width =width;
    }


    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double findArea(){
        return length*width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect1=new Rectangle(25,45);
        System.out.println(rect1.findArea()); 
        

    }

    
}
