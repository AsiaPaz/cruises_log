package sailing.cruises_log.dto;

import sailing.cruises_log.SailingEvent;

import java.time.LocalDate;

public class DaysDto {
    private LocalDate dateEntity;
    private Position startPosition;
    private float dayLog;
    private float sailsTime;
    private float engineTime;
    private float strongWindHours;
    private SailingEvent sailingEvent;

    public DaysDto(LocalDate dateEntity, Position startPosition, float dayLog, float sailsTime, float engineTime, float strongWindHours, SailingEvent sailingEvent) {
        this.dateEntity = dateEntity;
        this.startPosition = startPosition;
        this.dayLog = dayLog;
        this.sailsTime = sailsTime;
        this.engineTime = engineTime;
        this.strongWindHours = strongWindHours;
        this.sailingEvent = sailingEvent;
    }

    public DaysDto() {
    }

    public LocalDate getDateEntity() {
        return dateEntity;
    }

    public void setDateEntity(LocalDate dateEntity) {
        this.dateEntity = dateEntity;
    }

    public Position getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
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
}
