package sailing.cruises_log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class SailingEvent {
    @Id
    @GeneratedValue
    private int id;
    private String route;
    private String yachtName;
    private LocalDate startDate;
    private LocalDate endDate;

    public SailingEvent(String route, String yachtName, LocalDate startDate, LocalDate endDate) {
        this.route = route;
        this.yachtName = yachtName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public SailingEvent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getYachtName() {
        return yachtName;
    }

    public void setYachtName(String yachtName) {
        this.yachtName = yachtName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SailingEvent that = (SailingEvent) o;
        return id == that.id &&
                Objects.equals(route, that.route) &&
                Objects.equals(yachtName, that.yachtName) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, route, yachtName, startDate, endDate);
    }
}
