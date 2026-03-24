package Practice10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Event {

    private String title;
    private LocalDateTime start;
    private long durationMinutes;
    private ZoneId zone;
    private String track;


    public Event(String title, LocalDateTime start, long durationMinutes, ZoneId zone, String track) {
        this.title = title;
        this.start = start;
        this.durationMinutes = durationMinutes;
        this.zone = zone;
        this.track = track;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public long getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(long durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public ZoneId getZone() {
        return zone;
    }

    public void setZone(ZoneId zone) {
        this.zone = zone;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public LocalDateTime end(){
        return start.plusMinutes(durationMinutes);
    }

    public String label(){
        return  title + " " + track;
    }

    @Override
    public String toString() {
        return "Event |" +
                " title= " + title +
                " | start= " + start +
                " | durationMinutes= " + durationMinutes +
                " | zone= " + zone +
                " | track= " + track;
    }
}
