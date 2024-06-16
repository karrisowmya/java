class Student{
    String name;
    int id;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

    Student(String name, int id){
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.id = id;
    }
}


public class paramConstr {
    public static void main(String args[]){
        
        Student s1 = new Student("sowmya",318);
        s1.printinfo();
    }
    
}
