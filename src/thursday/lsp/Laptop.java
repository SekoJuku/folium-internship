package thursday.lsp;

import thursday.lsp.innards.*;

public class Laptop extends Computer {
    private Battery battery;

    public Laptop(CPU cpu, Display display, VideoCard videoCard, HardDrive hardDrive, Battery battery) {
        super(cpu, display, videoCard, hardDrive);
        this.battery = battery;
    }

    public Laptop() {

    }

    @Override
    public Integer computeMathematicalEquation() {
        return 2;
    }

    public Battery getBattery() {
        return battery;
    }
}
