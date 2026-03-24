package Practice10;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;

public class DateTimeLab {


    public static Instant toInstant(Event e) {
        return e.getStart().atZone(e.getZone()).toInstant();
    }

    public static long minutesBetween(Event a, Event b) {
        Duration duration = Duration.between(toInstant(a), toInstant(b));
        return Math.abs(duration.toMinutes());
    }

    public static ZonedDateTime startInZone(Event e, String zoneId) {
        ZoneId targetZone = ZoneId.of(zoneId);
        return toInstant(e).atZone(targetZone);
    }

}
