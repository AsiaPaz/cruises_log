package sailing.cruises_log.dto;

import sailing.cruises_log.SailingEvent;

import java.time.LocalDate;

public class DaysDto {
    private String dateEntity;
    private Position startPosition;
    private String dayLog;
    private String sailsTime;
    private String engineTime;
    private String strongWindHours;
    private SailingEvent sailingEvent;

    public DaysDto(String dateEntity, Position startPosition, String dayLog, String sailsTime, String engineTime, String strongWindHours, SailingEvent sailingEvent) {
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

    public String getDateEntity() {
        return dateEntity;
    }

    public void setDateEntity(String dateEntity) {
        this.dateEntity = dateEntity;
    }

    public Position getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
    }

    public String getDayLog() {
        return dayLog;
    }

    public void setDayLog(String dayLog) {
        this.dayLog = dayLog;
    }

    public String getSailsTime() {
        return sailsTime;
    }

    public void setSailsTime(String sailsTime) {
        this.sailsTime = sailsTime;
    }

    public String getEngineTime() {
        return engineTime;
    }

    public void setEngineTime(String engineTime) {
        this.engineTime = engineTime;
    }

    public String getStrongWindHours() {
        return strongWindHours;
    }

    public void setStrongWindHours(String strongWindHours) {
        this.strongWindHours = strongWindHours;
    }

    public SailingEvent getSailingEvent() {
        return sailingEvent;
    }

    public void setSailingEvent(SailingEvent sailingEvent) {
        this.sailingEvent = sailingEvent;
    }
}
