package friday.structural;

import friday.structural.adapter.LinuxProgram;
import friday.structural.adapter.WindowsProgram;
import friday.structural.adapter.WindowsProgramAdapter;
import friday.structural.bridge.Door;
import friday.structural.bridge.LeftHandle;
import friday.structural.bridge.RightHandle;

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
    }
}
