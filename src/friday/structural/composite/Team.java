package friday.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team extends Employee {
    private List<Employee> employeeList;

    public Team() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void work() {
        for (Employee e :
                employeeList) {
            e.work();
        }
    }
}
