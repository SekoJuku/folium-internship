package thursday.lsp;

public class Main {
    public static void main(String[] args) {// innards написаны для показа того что классы что-то имееют(нашару)
        Computer computer = new Computer();
        System.out.println(computer.computeMathematicalEquation());
        Computer computer1 = new DesktopComputer();
        System.out.println(computer1.computeMathematicalEquation());
        Computer computer2 = new Laptop();
        System.out.println(computer2.computeMathematicalEquation());
    }
}
