public class Student {
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() { //Added toString because it was not printing in a readable format
        return "Student{" + "rollno=" + rollno + ", name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}