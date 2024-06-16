class Student{
    String name;
    int id;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

    Student(){
        
    }

    Student(Student s2){
        this.name = s2.name;
        this.id = s2.id;
    }

}

public class copyConstr {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "sowmya";
        s1.id = 318;

        Student s2 = new Student(s1);

        s2.printinfo();
    }
}
