package exercism.ch001_Basic;

public class Lasagna {
    private static final int expectedMinutesIn = 40;
    private static final int timeOnLayer = 2;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return expectedMinutesIn;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int realTimeInOven) {
        return expectedMinutesInOven() - realTimeInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer) {
        return layer * timeOnLayer;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int realTimeInOven) {
        return expectedMinutesInOven() - (preparationTimeInMinutes(layer) + realTimeInOven);
    }
}
