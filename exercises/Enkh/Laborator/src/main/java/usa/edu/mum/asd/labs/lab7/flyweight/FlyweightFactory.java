package usa.edu.mum.asd.labs.lab7.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<String, Flyweight> flyweightHashMap = new HashMap<>();

    static {
        LocationMap lm1 = new LocationMap("Fairfield, Iowa", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        LocationMap lm2 = new LocationMap("Des moines, Iowa", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        LocationMap lm3 = new LocationMap("Sacramento, California", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        LocationMap lm4 = new LocationMap("Mount, Iowa", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        LocationMap lm5 = new LocationMap("Seattle, Washington", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        flyweightHashMap.put(lm1.getAreaName(), new ConcreteFlyweight(lm1));
        flyweightHashMap.put(lm2.getAreaName(), new ConcreteFlyweight(lm2));
        flyweightHashMap.put(lm3.getAreaName(), new ConcreteFlyweight(lm3));
        flyweightHashMap.put(lm4.getAreaName(), new ConcreteFlyweight(lm4));
        flyweightHashMap.put(lm5.getAreaName(), new ConcreteFlyweight(lm5));
    }

    public static Flyweight getInstance(String areaName) {
        return flyweightHashMap.get(areaName);
    }
}
