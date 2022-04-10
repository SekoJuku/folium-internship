package friday.structural;

import friday.structural.adapter.LinuxProgram;
import friday.structural.adapter.WindowsProgram;
import friday.structural.adapter.WindowsProgramAdapter;
import friday.structural.bridge.Door;
import friday.structural.bridge.LeftHandle;
import friday.structural.bridge.RightHandle;
import friday.structural.composite.Employee;
import friday.structural.composite.Team;
import friday.structural.decorator.Reader;
import friday.structural.decorator.WordReader;
import friday.structural.decorator.WordReaderDecorator;
import friday.structural.decorator.model.UpperCaseWordDecorator;
import friday.structural.facade.SandwichFacade;

public class Main {
    public static void main(String[] args) {
        // Adapter
        System.out.println("--------------Adapter--------------");
        LinuxProgram linuxProgram = new LinuxProgram("Hello");
        WindowsProgram windowsProgram = new WindowsProgram("Hello");
        System.out.println(linuxProgram.execute() == windowsProgram.execute());

        WindowsProgramAdapter windowsProgramAdapter = new WindowsProgramAdapter(windowsProgram);
        System.out.println(linuxProgram.execute() == windowsProgramAdapter.execute());

        // Bridge
        System.out.println("--------------Bridge--------------");
        Door door = new Door();
        door.setHandle(new LeftHandle());
        door.open();
        door.setHandle(new RightHandle());
        door.open();

        // Composite
        System.out.println("--------------Composite--------------");
        Team team = new Team();
        team.addEmployee(new Employee("Serikzhan", "Backend"));
        team.addEmployee(new Employee("Amirzhan", "Frontend"));
        Team newTeam = new Team();
        newTeam.addEmployee(new Employee("Marzhan", "UI/UX designer"));
        newTeam.addEmployee(new Employee("Zhandos", "Backend"));
        team.addEmployee(newTeam);
        team.work();

        // Decorator
        System.out.println("--------------Decorator--------------");
        WordReaderDecorator decorator = new UpperCaseWordDecorator(
                new WordReader("Serikzhan")
        );
        System.out.println(decorator.read());

        // Facade
        System.out.println("--------------Facade--------------");
        SandwichFacade sandwichFacade = new SandwichFacade();
        System.out.println(sandwichFacade.getSandwich("Chicken", "Light"));

        // Flyweight
        System.out.println("--------------Flyweight--------------");


    }
}
