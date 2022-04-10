package friday.structural;

import friday.structural.adapter.LinuxProgram;
import friday.structural.adapter.WindowsProgram;
import friday.structural.adapter.WindowsProgramAdapter;
import friday.structural.bridge.Door;
import friday.structural.bridge.LeftHandle;
import friday.structural.bridge.RightHandle;
import friday.structural.composite.Employee;
import friday.structural.composite.Team;

public class Main {
    public static void main(String[] args) {
        // Adapter
        LinuxProgram linuxProgram = new LinuxProgram("Hello");
        WindowsProgram windowsProgram = new WindowsProgram("Hello");
        System.out.println(linuxProgram.execute() == windowsProgram.execute());

        WindowsProgramAdapter windowsProgramAdapter = new WindowsProgramAdapter(windowsProgram);
        System.out.println(linuxProgram.execute() == windowsProgramAdapter.execute());
        // Bridge
        Door door = new Door();
        door.setHandle(new LeftHandle());
        door.open();
        door.setHandle(new RightHandle());
        door.open();
        // Composite
        Team team = new Team();
        team.addEmployee(new Employee("Serikzhan", "Backend"));
        team.addEmployee(new Employee("Amirzhan", "Frontend"));
        Team newTeam = new Team();
        newTeam.addEmployee(new Employee("Marzhan", "UI/UX designer"));
        newTeam.addEmployee(new Employee("Zhandos", "Backend"));
        team.addEmployee(newTeam);
        team.work();
        //
    }
}
