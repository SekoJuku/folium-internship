package friday.creational.abstractFactory;

import friday.creational.abstractFactory.models.LgTV;
import friday.creational.abstractFactory.models.TV;

public class LgTVProvider extends TVProvider{
    @Override
    public TV createTV() {
        return new LgTV();
    }
}
