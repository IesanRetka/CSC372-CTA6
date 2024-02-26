import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", "San Jose"));
        students.add(new Student(104, "Jake", "Frankfurt"));
        students.add(new Student(106, "Darren", "London"));
        students.add(new Student(105, "Grace", "Georgetown"));
        students.add(new Student(103, "Annie", "Houston"));
        students.add(new Student(109, "Nathan", "Salt Lake City"));
        students.add(new Student(102, "Luke", "New Jersey"));
        students.add(new Student(107, "Blake", "Miami"));
        students.add(new Student(108, "Stephanie", "San Fransisco"));
        students.add(new Student(100, "Quentin", "Seattle"));


        SelectionSort.sort(students, new SortByName());
        System.out.println("Sorted by name:");
        for (Student s : students) {
            System.out.println(s);
        }

        SelectionSort.sort(students, new SortByRoll());
        System.out.println("\nSorted by roll number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
