package thursday.lsp;

import thursday.lsp.innards.*;

public class DesktopComputer extends Computer {
    private PSU powerSupplyUnit;

    public DesktopComputer(CPU cpu, Display display, VideoCard videoCard, HardDrive hardDrive, PSU powerSupplyUnit) {
        super(cpu, display, videoCard, hardDrive);
        this.powerSupplyUnit = powerSupplyUnit;
    }

    public DesktopComputer() {
        super();
    }


    @Override
    public Integer computeMathematicalEquation() {
        return 1;
    }

    public PSU getPowerSupplyUnit() {
        return powerSupplyUnit;
    }
}
