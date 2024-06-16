class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("color: "+color+"\ntype: "+type);
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}


public class classobj {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";

        pen1.write();

        pen1.printcolor();
        pen2.printcolor();
    }
    
}
