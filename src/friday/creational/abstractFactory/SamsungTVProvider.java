package friday.creational.abstractFactory;

import friday.creational.abstractFactory.models.SamsungTV;
import friday.creational.abstractFactory.models.TV;

public class SamsungTVProvider extends TVProvider {
    @Override
    public TV createTV() {
        return new SamsungTV();
    }
}
