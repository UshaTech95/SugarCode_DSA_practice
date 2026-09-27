package practice.linkedlists;

public class Student {
    int id;
    String name;
    long mobileNumber;
    String emailID;

//    public Student(int id, String name, long mobileNumber, String emailID) {
//
//        this.id = id;
//        this.name = name;
//        this.mobileNumber = mobileNumber;
//        this.emailID = emailID;
//    }
//
//    public static void main(String[] args) {
//        Student S1 = new Student(101, "rahul", 9876512345L, "rahul@example.com");
//        Student S2 = new Student(102, "usha", 9803690174L, "usha@gmail.com");
//
//        System.out.println(S1.id + " | " + S1.name + " | " + S1.emailID + " | " + S1.mobileNumber);
//
//    }

    public static void main(String[] args){
        Student S1 = new Student();
        S1.id=101;
        S1.name= "Rahul";
        S1.emailID="Rahul@example.com";
        S1.mobileNumber= 9181546273L;
        System.out.println(S1.id + " | " + S1.name + " | " + S1.emailID + " | " + S1.mobileNumber);
    }
}
