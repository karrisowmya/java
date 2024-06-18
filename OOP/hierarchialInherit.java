class Shape{
    String color;
}

class Triangle extends Shape{
    int b,h;
    void area(){
        System.out.println(this.color);
        System.out.println(0.5*b*h);
    }
}

class Rectangle extends Shape{
    int l,br;
    void area(){
        System.out.println(this.color);
        System.out.println(l*br);
    }
}

public class hierarchialInherit {
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.color = "red";
        t.b = 2;
        t.h = 5;
        t.area();
        Rectangle r = new Rectangle();
        r.color = "black";
        r.l = 3;
        r.br = 4;
        r.area();
    }
}
