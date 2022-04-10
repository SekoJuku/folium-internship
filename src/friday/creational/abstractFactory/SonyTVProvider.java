package friday.creational.abstractFactory;

import friday.creational.abstractFactory.models.SonyTV;
import friday.creational.abstractFactory.models.TV;

public class SonyTVProvider extends TVProvider{
    @Override
    public TV createTV() {
        return new SonyTV();
    }
}
