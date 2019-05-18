package sailing.cruises_log.dto;

public class Navigation {
    private int log;
    private int COG;
    private float speed;

    public Navigation(int log, int COG, float speed) {
        this.log = log;
        this.COG = COG;
        this.speed = speed;
    }

    public Navigation() {
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
}
