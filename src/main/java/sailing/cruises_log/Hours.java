package sailing.cruises_log;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Hours {
    @Id
    @GeneratedValue
    private int id;
    private int timeLog;
    private LocalDate dateEntity;
    private String Watch;
    private String sails;
    private boolean engine;
    private int log;
    private int COG;
    private float speed;
    private String latitudeDegrees;
    private String latitudeMinutes;
    private char latitudeDirection;
    private String longitudeDegrees;
    private String longitudeMinutes;
    private char longitudeDirection;
    private String windDirection;
    private float windSpeedKnt;
    private int windSpeedB;
    private int seaState;
    private int visibility;
    private float temperature;
    private int cloudiness;
    private String phenomena;
    private int pressure;
    private String comments;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private SailingEvent sailingEvent;



    public Hours(int timeLog, LocalDate dateEntity, String watch, String sails, boolean engine, int log, int COG, float speed, String latitudeDegrees, String latitudeMinutes, char latitudeDirection, String longitudeDegrees, String longitudeMinutes, char longitudeDirection,
                 String windDirection, float windSpeedKnt, int windSpeedB, int seaState, int visibility, float temperature, int cloudiness, String phenomena, int pressure, String comments, SailingEvent sailingEvent) {
        this.timeLog = timeLog;
        this.dateEntity = dateEntity;
        Watch = watch;
        this.sails = sails;
        this.engine = engine;
        this.log = log;
        this.COG = COG;
        this.speed = speed;
        this.latitudeDegrees = latitudeDegrees;
        this.latitudeMinutes = latitudeMinutes;
        this.latitudeDirection = latitudeDirection;
        this.longitudeDegrees = longitudeDegrees;
        this.longitudeMinutes = longitudeMinutes;
        this.longitudeDirection = longitudeDirection;
        this.windDirection = windDirection;
        this.windSpeedKnt = windSpeedKnt;
        this.windSpeedB = windSpeedB;
        this.seaState = seaState;
        this.visibility = visibility;
        this.temperature = temperature;
        this.cloudiness = cloudiness;
        this.phenomena = phenomena;
        this.pressure = pressure;
        this.comments = comments;
        this.sailingEvent = sailingEvent;
    }

    public Hours() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeLog() {
        return timeLog;
    }

    public void setTimeLog(int timeLog) {
        this.timeLog = timeLog;
    }

    public LocalDate getDateEntity() {
        return dateEntity;
    }

    public void setDateEntity(LocalDate dateEntity) {
        this.dateEntity = dateEntity;
    }

    public String getWatch() {
        return Watch;
    }

    public void setWatch(String watch) {
        Watch = watch;
    }

    public String getSails() {
        return sails;
    }

    public void setSails(String sails) {
        this.sails = sails;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }

    public int getCOG() {
        return COG;
    }

    public void setCOG(int COG) {
        this.COG = COG;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getLatitudeDegrees() {
        return latitudeDegrees;
    }

    public void setLatitudeDegrees(String latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }

    public String getLatitudeMinutes() {
        return latitudeMinutes;
    }

    public void setLatitudeMinutes(String latitudeMinutes) {
        this.latitudeMinutes = latitudeMinutes;
    }

    public char getLatitudeDirection() {
        return latitudeDirection;
    }

    public void setLatitudeDirection(char latitudeDirection) {
        this.latitudeDirection = latitudeDirection;
    }

    public String getLongitudeDegrees() {
        return longitudeDegrees;
    }

    public void setLongitudeDegrees(String longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
    }

    public String getLongitudeMinutes() {
        return longitudeMinutes;
    }

    public void setLongitudeMinutes(String longitudeMinutes) {
        this.longitudeMinutes = longitudeMinutes;
    }

    public char getLongitudeDirection() {
        return longitudeDirection;
    }

    public void setLongitudeDirection(char longitudeDirection) {
        this.longitudeDirection = longitudeDirection;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}