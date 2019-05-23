package sailing.cruises_log;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Days {
    @Id
    @GeneratedValue
    private int id;
    private LocalDate dateEntity;
    private String latitudeDegrees;
    private String latitudeMinutes;
    private char latitudeDirection;
    private String longitudeDegrees;
    private String longitudeMinutes;
    private char longitudeDirection;
    private float dayLog;
    private float sailsTime;
    private float engineTime;
    private float strongWindHours;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private SailingEvent sailingEvent;

    public Days(LocalDate dateEntity, String latitudeDegrees, String latitudeMinutes, char latitudeDirection, String longitudeDegrees, String longitudeMinutes, char longitudeDirection,
                float dayLog, float sailsTime, float engineTime, float strongWindHours, SailingEvent sailingEvent) {
        this.dateEntity = dateEntity;
        this.latitudeDegrees = latitudeDegrees;
        this.latitudeMinutes = latitudeMinutes;
        this.latitudeDirection = latitudeDirection;
        this.longitudeDegrees = longitudeDegrees;
        this.longitudeMinutes = longitudeMinutes;
        this.longitudeDirection = longitudeDirection;
        this.dayLog = dayLog;
        this.sailsTime = sailsTime;
        this.engineTime = engineTime;
        this.strongWindHours = strongWindHours;
        this.sailingEvent = sailingEvent;
    }

    public Days() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateEntity() {
        return dateEntity;
    }

    public void setDateEntity(LocalDate dateEntity) {
        this.dateEntity = dateEntity;
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

    public float getDayLog() {
        return dayLog;
    }

    public void setDayLog(float dayLog) {
        this.dayLog = dayLog;
    }

    public float getSailsTime() {
        return sailsTime;
    }

    public void setSailsTime(float sailsTime) {
        this.sailsTime = sailsTime;
    }

    public float getEngineTime() {
        return engineTime;
    }

    public void setEngineTime(float engineTime) {
        this.engineTime = engineTime;
    }

    public float getStrongWindHours() {
        return strongWindHours;
    }

    public void setStrongWindHours(float strongWindHours) {
        this.strongWindHours = strongWindHours;
    }

    public SailingEvent getSailingEvent() {
        return sailingEvent;
    }

    public void setSailingEvent(SailingEvent sailingEvent) {
        this.sailingEvent = sailingEvent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Days days = (Days) o;
        return id == days.id &&
                latitudeDirection == days.latitudeDirection &&
                longitudeDirection == days.longitudeDirection &&
                Float.compare(days.dayLog, dayLog) == 0 &&
                Float.compare(days.sailsTime, sailsTime) == 0 &&
                Float.compare(days.engineTime, engineTime) == 0 &&
                Float.compare(days.strongWindHours, strongWindHours) == 0 &&
                Objects.equals(dateEntity, days.dateEntity) &&
                Objects.equals(latitudeDegrees, days.latitudeDegrees) &&
                Objects.equals(latitudeMinutes, days.latitudeMinutes) &&
                Objects.equals(longitudeDegrees, days.longitudeDegrees) &&
                Objects.equals(longitudeMinutes, days.longitudeMinutes) &&
                Objects.equals(sailingEvent, days.sailingEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateEntity, latitudeDegrees, latitudeMinutes, latitudeDirection, longitudeDegrees, longitudeMinutes, longitudeDirection, dayLog, sailsTime, engineTime, strongWindHours, sailingEvent);
    }


}
