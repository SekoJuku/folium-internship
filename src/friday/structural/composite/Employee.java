package friday.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String jobTitle;

    public Employee() {
    }

    public Employee(String name, String jobTitle) {
        this();
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void work() {
        System.out.println(name+ " " + jobTitle + " is working!");
    }
}
