package friday.behavioral;

import friday.behavioral.chainOfResponsibility.EmailFilter;
import friday.behavioral.chainOfResponsibility.Filter;
import friday.behavioral.chainOfResponsibility.PasswordFilter;
import friday.behavioral.chainOfResponsibility.Request;

public class Main extends friday.structural.Main {
    public static void main(String[] args) {
        // Chain of Responsibility
        divider("Chain of Responsibility");
        Request request = new Request("seko@gmail.com", "12345678"); // It should come from somewhere
        Filter filter = new EmailFilter(request);
        filter.setNext(new PasswordFilter(request));
        try {
            filter.filter();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Command
        divider("Command");

    }
}
