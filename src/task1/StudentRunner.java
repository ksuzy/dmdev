package task1;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Lara", "Kroft", 1, List.of (1,2,3,4)),
                new Student("Mara", "Ivanova", 2, List.of (5,5,5,5,5)),
                new Student("Sara", "Toff", 3, List.of (1,1)),
                new Student("Dora", "Ma", 4, List.of (2,2)),
                new Student("Kara", "Kum", 2, List.of (3,2,1)),
                new Student("Sam", "Ets", 2, List.of (3,2,4,3))
                );
  /**     Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
        Средняя оценка студентов этого курса, количество оценок у которых больше 3-х **/

        Map<Integer, Double> map = students.stream()
                .filter(Student -> Student.getMarks().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber, Collectors.averagingDouble(Student::averageElement)));
        System.out.println(map);
    }
}
