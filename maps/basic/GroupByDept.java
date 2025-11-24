package maps.basic;
import java.util.*;

class Employee {
    String name;
    String dept;
    Employee(String n, String d) { name = n; dept = d; }
    public String toString(){ return name; }
}

public class GroupByDept {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : emp) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }

        System.out.println(map);
    }
}
