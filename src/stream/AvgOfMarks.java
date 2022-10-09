package stream;
import java.util.Arrays;

class Student {
    int roll;
    int marks;
    String name;

    public Student(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }
}

public class AvgOfMarks {

    public static void main(String[] args) {
        
        Student arr[] = {new Student(110, 70, "abc"),
                        new Student(101, 80, "bcd"),
                        new Student(120, 60, "xyz")
        };
        
        double avg = Arrays.stream(arr)
                        .mapToInt(x -> x.getMarks())
                        .average()
                        .getAsDouble();
        System.out.println(avg);

        // Map<Integer, String> m = Arrays.stream(arr)
        //                                .collect(Collector.toMap(Student :: getMarks, Student :: getName));


        // Grouping objects according to particular field
        // Map<Integer, List<Student>> m = Arrays.stream(arr)
        //                                       .collect(Collectors.groupingBy(Student :: getMarks));

    }
}
