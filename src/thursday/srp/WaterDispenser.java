package thursday.srp;

public class WaterDispenser {
    private final HotWaterDispenser hotWaterDispenser;
    private final ColdWaterDispenser coldWaterDispenser;

    public WaterDispenser(HotWaterDispenser hotWaterDispenser, ColdWaterDispenser coldWaterDispenser) {
        this.hotWaterDispenser = hotWaterDispenser;
        this.coldWaterDispenser = coldWaterDispenser;
    }

    public HotWaterDispenser getHotWaterDispenser() {
        return hotWaterDispenser;
    }

    public ColdWaterDispenser getColdWaterDispenser() {
        return coldWaterDispenser;
    }

    public String dispenseHotWater() {
        return hotWaterDispenser.dispense();
    }

    public String dispenseColdWater() {
        return coldWaterDispenser.dispense();
    }
}
