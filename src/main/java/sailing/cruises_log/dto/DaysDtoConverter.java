package sailing.cruises_log.dto;

import sailing.cruises_log.Days;

public class DaysDtoConverter {
public static DaysDto fromEntity(Days days){
    DaysDto daysDto= new DaysDto();

    Position positionDto=new Position();
    positionDto.setLatitudeDegrees(days.getLatitudeDegrees());
    positionDto.setLatitudeMinutes(days.getLatitudeMinutes());
    positionDto.setLatitudeDirection(days.getLatitudeDirection());
    positionDto.setLongitudeDegrees(days.getLongitudeDegrees());
    positionDto.setLongitudeMinutes(days.getLongitudeMinutes());
    positionDto.setLongitudeDirection(days.getLongitudeDirection());

    daysDto.setDateEntity(days.getDateEntity());
    daysDto.setStartPosition(positionDto);
    daysDto.setDayLog(days.getDayLog());
    daysDto.setSailsTime(days.getSailsTime());
    daysDto.setEngineTime(days.getEngineTime());
    daysDto.setStrongWindHours(days.getStrongWindHours());
    daysDto.setSailingEvent(days.getSailingEvent());
    return daysDto;
}

public static Days toEntity(DaysDto daysDto){
    Days days = new Days();
    days.setDateEntity(daysDto.getDateEntity());
    days.setLatitudeDegrees(daysDto.getStartPosition().getLatitudeDegrees());
    days.setLatitudeMinutes(daysDto.getStartPosition().getLatitudeMinutes());
    days.setLatitudeDirection(daysDto.getStartPosition().getLatitudeDirection());
    days.setLongitudeDegrees(daysDto.getStartPosition().getLongitudeDegrees());
    days.setLongitudeMinutes(daysDto.getStartPosition().getLongitudeMinutes());
    days.setLongitudeDirection(daysDto.getStartPosition().getLongitudeDirection());
    days.setDayLog(daysDto.getDayLog());
    days.setSailsTime(daysDto.getSailsTime());
    days.setEngineTime(daysDto.getEngineTime());
    days.setStrongWindHours(daysDto.getStrongWindHours());
    days.setSailingEvent(daysDto.getSailingEvent());
    return days;
}

}
