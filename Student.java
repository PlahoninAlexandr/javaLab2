import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Student {
    String second_name;
    static int id = 0;
    public static int num_students;
    public static Map<String, String> hash_map = new HashMap<>();

    Student(){
        num_students++;
        id += 1;
        String str = String.format("%04d", id);
        second_name = "some student";
        hash_map.put(str, second_name);

    }

    Student(String sname){
        num_students++;
        id += 1;
        String str = String.format("%04d", id);
        second_name = sname;
        hash_map.put(str, second_name);

    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Petrov");
        Student student3 = new Student();
        Student student4 = new Student("Ivanov");
        Student student5 = new Student();
        Student student6 = new Student("Nikolaev");
        Student student7 = new Student();
        Student student8 = new Student("Petrishin");
        Student student9 = new Student();
        Student student10 = new Student("Levadnii");

        for (Map.Entry entry: hash_map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("");
        System.out.print("number of students: ");
        System.out.print(num_students);
    }
}
