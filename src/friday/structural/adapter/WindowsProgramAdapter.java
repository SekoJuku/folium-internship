package friday.structural.adapter;

public class WindowsProgramAdapter extends LinuxProgram{
    private WindowsProgram windowsProgram;

    public WindowsProgramAdapter(WindowsProgram program) {
        this.windowsProgram = program;
    }

    @Override
    public int execute() {
        //some code
        return windowsProgram.getName().hashCode();
    }
}
