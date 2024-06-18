class Student{
    String name;
    int id;

    public void printinfo(String name){
        System.out.println(name);
    }
    
    public void printinfo(int id){
        System.out.println(id);
    }

    public void printinfo(String name, int id){
        System.out.println(name+" "+id);
    }
}

public class compiletimePolymorph {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "sowmya";
        s1.id = 318;

        //s1.printinfo(s1.name);        //sowmya
        //s1.printinfo(s1.id);          //318
        s1.printinfo(s1.name,s1.id);    // sowmya 318
    }
    
}
