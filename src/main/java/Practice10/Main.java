package Practice10;

import com.sun.java.accessibility.util.EventQueueMonitor;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();
        EventLab eventLab = new EventLab();
        LambdaRefactorLab lambdaRefactorLab = new LambdaRefactorLab();
        DateTimeLab dateTimeLab = new DateTimeLab();

        System.out.println("==============TASK1=================");
        Event event1 = new Event("Event1", LocalDateTime.of(2026,1,1,23,23),10, ZoneId.of("Europe/Kyiv"),"Track1");
        Event event2 = new Event("Event2", LocalDateTime.of(2025,2,4,11,12),20, ZoneId.of("Europe/Berlin"),"Track2");
        Event event3 = new Event("Event3", LocalDateTime.of(2024,3,5,15,15),30, ZoneId.of("Europe/London"),"Track3");

        events.add(event1);
        events.add(event2);
        events.add(event3);

        System.out.println(event1);
        System.out.println(event2);
        System.out.println(event3);

        System.out.println("==============TASK2=================");

        Predicate<Event> rule = event -> event.getStart().getHour() < 12;
        System.out.println(EventLab.pick(events,rule));

        System.out.println("=====================================");

        Function<Event, String> fullLabelMaker = event -> "Локація: " + event.getTrack() + " | Подія: " + event.getTitle();
        System.out.println(EventLab.labels(events, fullLabelMaker));

        System.out.println("=====================================");

        Consumer<Event> berofeAllEventsText = event -> System.out.println("EVENTS TITLES " + event.getTitle());
        EventLab.notifyAll(events, berofeAllEventsText);

        System.out.println("=====================================");

        Supplier<Event> defaultEvent = () -> new Event("New Draft Event", LocalDateTime.now(), 30, ZoneId.of("Europe/Kyiv"), "Track"
        );
        System.out.println(EventLab.creat(defaultEvent));

        System.out.println("=====================================");
        Event event3Copy = new Event("Event3", LocalDateTime.of(2024,3,5,15,15),30, ZoneId.of("Europe/London"),"Track3");
        events.add(event3Copy);
        EventLab.findConflicts(events);


        System.out.println("==============TASK3=================");
        LambdaRefactorLab.sortMethodRef(events);
        System.out.println(events);







    }

}
