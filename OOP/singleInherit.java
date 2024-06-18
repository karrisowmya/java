class Shape{
    String color;
}

class Triangle extends Shape{
    int b;
    int h;
    void area(){
        System.out.println(color);
        System.out.println(0.5*b*h);
    }
}

public class singleInherit {
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.b = 4;
        t.h = 6;
        t.color = "pink";

        t.area();
    }
    
}
