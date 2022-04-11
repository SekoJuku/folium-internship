package friday.behavioral;

import friday.behavioral.chainOfResponsibility.EmailFilter;
import friday.behavioral.chainOfResponsibility.Filter;
import friday.behavioral.chainOfResponsibility.PasswordFilter;
import friday.behavioral.chainOfResponsibility.Request;
import friday.behavioral.observer.NewsListener;
import friday.behavioral.observer.NewsPublisher;
import friday.behavioral.state.Bottle;
import friday.behavioral.strategy.BiologicalStrategy;
import friday.behavioral.strategy.CapitalismStrategy;
import friday.behavioral.strategy.Pack;
import friday.behavioral.templateMethod.BallTemplate;
import friday.behavioral.templateMethod.BasketballBall;
import friday.behavioral.templateMethod.FootballBall;

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
        // Observer
        divider("Observer");
        NewsPublisher publisher = new NewsPublisher();
        publisher.subscribe(new NewsListener("Serik"));
        publisher.subscribe(new NewsListener("Berik"));
        publisher.notifySubscribers("Beware of wolves!");
        // State
        divider("State");
        Bottle bottle = new Bottle();
        System.out.println(bottle.getState().status());
        System.out.println(bottle.getState().drink());
        System.out.println(bottle.getState().fill());
        System.out.println(bottle.getState().status());
        System.out.println(bottle.getState().drink());
        System.out.println(bottle.getState().status());
        // Strategy
        divider("Strategy");
        Pack pack1 = new Pack();
        pack1.setStrategy(new BiologicalStrategy());// only difference is names (ideologically different)
        pack1.execute("Barry");
        pack1.execute("Berik");
        System.out.println(pack1.getAll());
        pack1.setStrategy(new CapitalismStrategy());// only difference is names (ideologically different)
        pack1.execute("Ulan");
        System.out.println(pack1.getAll());
        // Template Method
        divider("Template Method");
        BallTemplate ball = new BasketballBall();
        System.out.println(ball.getBouncinessValue());
        ball = new FootballBall(3);
        System.out.println(ball.getBouncinessValue());
        ball = new FootballBall(5);
        System.out.println(ball.getBouncinessValue());

    }
}
