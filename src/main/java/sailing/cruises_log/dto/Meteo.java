package sailing.cruises_log.dto;

public class Meteo {
    private String windDirection;
    private float windSpeedKnt;
    private int windSpeedB;
    private int seaState;
    private int visibility;
    private float temperature;
    private int cloudiness;
    private String phenomena;
    private int pressure;

    public Meteo(String windDirection, float windSpeedKnt, int windSpeedB, int seaState,
                 int visibility, float temperature, int cloudiness, String phenomena, int pressure) {
        this.windDirection = windDirection;
        this.windSpeedKnt = windSpeedKnt;
        this.windSpeedB = windSpeedB;
        this.seaState = seaState;
        this.visibility = visibility;
        this.temperature = temperature;
        this.cloudiness = cloudiness;
        this.phenomena = phenomena;
        this.pressure = pressure;
    }

    public Meteo() {
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public float getWindSpeedKnt() {
        return windSpeedKnt;
    }

    public void setWindSpeedKnt(float windSpeedKnt) {
        this.windSpeedKnt = windSpeedKnt;
    }

    public int getWindSpeedB() {
        return windSpeedB;
    }

    public void setWindSpeedB(int windSpeedB) {
        this.windSpeedB = windSpeedB;
    }

    public int getSeaState() {
        return seaState;
    }

    public void setSeaState(int seaState) {
        this.seaState = seaState;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(int cloudiness) {
        this.cloudiness = cloudiness;
    }

    public String getPhenomena() {
        return phenomena;
    }

    public void setPhenomena(String phenomena) {
        this.phenomena = phenomena;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
