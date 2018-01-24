package usa.edu.mum.asd.labs.lab7.flyweight;

public class LocationMap {

    private final String areaName;
    private final String mapURL;

    public LocationMap(String areaName, String mapURL) {
        this.areaName = areaName;
        this.mapURL = mapURL;
        try {
            //for test
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public String getAreaName() {
        return areaName;
    }

    public String getMapURL() {
        return mapURL;
    }

    @Override
    public String toString() {
        return "LocationMap{" +
                "areaName='" + areaName + '\'' +
                ", mapURL='" + mapURL + '\'' +
                '}';
    }
}
