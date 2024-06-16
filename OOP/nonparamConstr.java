class Student{
    String name;
    int id;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

    Student(){  //constructor, if this constructor is not specified then java creates a default constructor
        System.out.println("Constructor called");
    }
}


public class nonparamConstr {
    public static void main(String arga[]){
        Student s1 = new Student();  //here Student() is a constructor. it is used to ceate an obj.
        s1.name = "sowmya";
        s1.id = 318;

        s1.printinfo();
    }
}
