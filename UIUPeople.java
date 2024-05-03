import java.util.Scanner;

class UIUPeople{
    int id;
    String name;
    UIUPeople(int id,String name){
        this.id = id;
        this.name = name;
    }
}
class Student extends UIUPeople{
    double cgpa;
    Student(int id, String name,double cgpa) {
        super(id, name);
        this.cgpa = cgpa;
    }
    void print(){
        System.out.println(name +"Name : ");
        System.out.println(id +"ID   : ");
        System.out.println(cgpa +"CGPA : ");
    }
}
class TA {
    int numberOfCurse;
    TA(int numberOfCurse){
        this.numberOfCurse = numberOfCurse;
    }
    void salary(){
        System.out.println((8000*numberOfCurse)+ "Salary : " );
    }
}

class Main{
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        Student[] student = new Student[5];
        TA[] ta  = new TA[5];
        for (int j=0;j<5;j++){
            int id;
            String name;
            double cgpa;
            System.out.println("Enter id : ");
            id = jin.nextInt();
            System.out.println("Enter name : ");
            name = jin.next();
            System.out.println("Enter CGPA: ");
            cgpa = jin.nextDouble();
            student[j] = new Student(id,name,cgpa);
            if(cgpa>=3.80){
                System.out.println("Enter no of courses: ");
                int n;
                n = jin.nextInt();
                ta[j] = new TA(n);
            }
        }

        for(int i=0;i<5;i++){
            student[i].print();
            if(student[i].cgpa>=3.80){
                ta[i].salary();
            }
        }

    }
}