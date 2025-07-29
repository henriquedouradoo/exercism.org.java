package exercism.lasagna;

public class Lasagna {

    private final int minutesToCook = 40;
    private final int resultLayers = 2;

    public int getMinutesToCook() {
        return minutesToCook;
    }

    public int getResultLayers() {
        return resultLayers;
    }

    public int expectedMinutesInOven() {
            return minutesToCook;
        }

        public int remainingMinutesInOven(int minutes) {
            return minutesToCook - minutes;
        }

        public int preparationTimeInMinutes(int layers) {
            return layers * resultLayers;
        }

        public int totalTimeInMinutes(int layers, int minutes) {
            return preparationTimeInMinutes(layers) + remainingMinutesInOven(minutes);
        }
    }


