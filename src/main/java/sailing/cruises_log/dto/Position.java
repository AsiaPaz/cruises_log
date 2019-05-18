package sailing.cruises_log.dto;

public class Position {
    private String latitudeDegrees;
    private String latitudeMinutes;
    private char latitudeDirection;
    private String longitudeDegrees;
    private String longitudeMinutes;
    private char longitudeDirection;

    public Position(String latitudeDegrees, String latitudeMinutes, char latitudeDirection,
                    String longitudeDegrees, String longitudeMinutes, char longitudeDirection) {
        this.latitudeDegrees = latitudeDegrees;
        this.latitudeMinutes = latitudeMinutes;
        this.latitudeDirection = latitudeDirection;
        this.longitudeDegrees = longitudeDegrees;
        this.longitudeMinutes = longitudeMinutes;
        this.longitudeDirection = longitudeDirection;
    }

    public Position() {
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
}
