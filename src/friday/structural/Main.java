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
import friday.structural.flyweight.JuiceConsumer;
import friday.structural.proxy.StringDBProxy;
import friday.structural.proxy.StringService;

public class Main {
    public static void divider(String name) {
        System.out.println("--------------" + name + "--------------");
    }

    public static void main(String[] args) {
        // Adapter
        divider("Adapter");
        LinuxProgram linuxProgram = new LinuxProgram("Hello");
        WindowsProgram windowsProgram = new WindowsProgram("Hello");
        System.out.println(linuxProgram.execute() == windowsProgram.execute());

        WindowsProgramAdapter windowsProgramAdapter = new WindowsProgramAdapter(windowsProgram);
        System.out.println(linuxProgram.execute() == windowsProgramAdapter.execute());

        // Bridge
        divider("Adapter");
        Door door = new Door();
        door.setHandle(new LeftHandle());
        door.open();
        door.setHandle(new RightHandle());
        door.open();

        // Composite
        divider("Composite");
        Team team = new Team();
        team.addEmployee(new Employee("Serikzhan", "Backend"));
        team.addEmployee(new Employee("Amirzhan", "Frontend"));
        Team newTeam = new Team();
        newTeam.addEmployee(new Employee("Marzhan", "UI/UX designer"));
        newTeam.addEmployee(new Employee("Zhandos", "Backend"));
        team.addEmployee(newTeam);
        team.work();

        // Decorator
        divider("Decorator");
        WordReaderDecorator decorator = new UpperCaseWordDecorator(
                new WordReader("Serikzhan")
        );
        System.out.println(decorator.read());

        // Facade
        divider("Facade");
        SandwichFacade sandwichFacade = new SandwichFacade();
        System.out.println(sandwichFacade.getSandwich("Chicken", "Light"));

        // Flyweight
        divider("Flyweight");
        JuiceConsumer juiceConsumer = new JuiceConsumer();
        juiceConsumer.addJuice(1.2, "Apple", "Piko");
        juiceConsumer.addJuice(1.2, "MultiFruit", "Piko");
        juiceConsumer.consumeAll();
        // Proxy
        divider("Proxy");
        StringService service = new StringService(new StringDBProxy());
        System.out.println(service.getAllWords());
    }
}
