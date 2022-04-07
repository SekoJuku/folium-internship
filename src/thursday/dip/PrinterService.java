package thursday.dip;

public class PrinterService {
    private final Printer printer;

    public PrinterService(Printer printer) {
        this.printer = printer;
    }

    public String print() {
        return this.printer.print();
    }

    public Printer getPrinter() {
        return printer;
    }
}
