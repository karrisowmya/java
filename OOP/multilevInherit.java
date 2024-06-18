class Shape{
    String color;
}
class Triangle extends Shape{
    void side(){
        System.out.println("Diff types of triangles based on size");
    }
}
class EquiTriangle extends Triangle{
    int a;
    void area(){
        System.out.println(color);
        System.out.println("all sides equal");
        System.out.println(0.25*1.732*a*a);
    }
}

public class multilevInherit {
    public static void main(String args[]){
        EquiTriangle e = new EquiTriangle();
        e.a = 4;
        e.side();
        e.color = "red";
        e.area();
    }
}
