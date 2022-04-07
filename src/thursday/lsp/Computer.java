package thursday.lsp;

import thursday.lsp.innards.CPU;
import thursday.lsp.innards.Display;
import thursday.lsp.innards.HardDrive;
import thursday.lsp.innards.VideoCard;

public class Computer {
    private CPU cpu;
    private Display display;
    private VideoCard videoCard;
    private HardDrive hardDrive;

    public Computer(CPU cpu, Display display, VideoCard videoCard, HardDrive hardDrive) {
        this.cpu = cpu;
        this.display = display;
        this.videoCard = videoCard;
        this.hardDrive = hardDrive;
    }

    public Computer() {

    }


    public Integer computeMathematicalEquation() {
        return 0;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Display getDisplay() {
        return display;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }
}
