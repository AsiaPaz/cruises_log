package sailing.cruises_log.dto;

import sailing.cruises_log.Days;

import java.time.LocalDate;

public class DaysDtoConverter {
    @Override
    public String toString() {
        return "DaysDtoConverter{}";
    }

    public static DaysDto fromEntity(Days days){
    DaysDto daysDto= new DaysDto();

    Position positionDto=new Position();
    positionDto.setLatitudeDegrees(days.getLatitudeDegrees());
    positionDto.setLatitudeMinutes(days.getLatitudeMinutes());
    positionDto.setLatitudeDirection(days.getLatitudeDirection());
    positionDto.setLongitudeDegrees(days.getLongitudeDegrees());
    positionDto.setLongitudeMinutes(days.getLongitudeMinutes());
    positionDto.setLongitudeDirection(days.getLongitudeDirection());

    daysDto.setDateEntity(days.getDateEntity().toString());

    daysDto.setStartPosition(positionDto);

    daysDto.setDayLog(days.getDayLog()+"");
    daysDto.setSailsTime(days.getSailsTime()+"");
    daysDto.setEngineTime(days.getEngineTime()+"");
    daysDto.setStrongWindHours(days.getStrongWindHours()+"");

    daysDto.setSailingEvent(days.getSailingEvent());
    return daysDto;
}

public static Days toEntity(DaysDto daysDto){
    Days days = new Days();
    days.setDateEntity(LocalDate.parse(daysDto.getDateEntity()));

    days.setLatitudeDegrees(daysDto.getStartPosition().getLatitudeDegrees());
    days.setLatitudeMinutes(daysDto.getStartPosition().getLatitudeMinutes());
    days.setLatitudeDirection(daysDto.getStartPosition().getLatitudeDirection());
    days.setLongitudeDegrees(daysDto.getStartPosition().getLongitudeDegrees());
    days.setLongitudeMinutes(daysDto.getStartPosition().getLongitudeMinutes());
    days.setLongitudeDirection(daysDto.getStartPosition().getLongitudeDirection());

    days.setDayLog(Float.parseFloat(daysDto.getDayLog()));
    days.setSailsTime(Float.parseFloat(daysDto.getSailsTime()));
    days.setEngineTime(Float.parseFloat(daysDto.getEngineTime()));
    days.setStrongWindHours(Float.parseFloat(daysDto.getStrongWindHours()));

    days.setSailingEvent(daysDto.getSailingEvent());
    return days;
}

}
