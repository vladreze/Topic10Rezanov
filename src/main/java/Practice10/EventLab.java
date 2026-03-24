package Practice10;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class EventLab {

    public static List<Event> pick(List<Event> list , Predicate<Event> rule){
           List<Event> result = new ArrayList<>();
           for(Event e : list){
               if(rule.test(e))
                   result.add(e);
        }
           return result;
    }

    public static List<String> labels(List<Event> list, Function<Event, String> function){
        List<String> result = new ArrayList<>();
        for(Event e : list){
            result.add(function.apply(e));
        }
        return result;
    }

    public static void notifyAll(List<Event> list, Consumer<Event> consumer){
        for (Event e : list){
            consumer.accept(e);
        }
    }

    public static Event creat(Supplier<Event> supplier){
        return supplier.get();
    }

    public static void findConflicts(List<Event> list){
        for(int i=0; i< list.size() ;i++){
            Event event1 = list.get(i);
            for(int j=i+1; j< list.size();j++){
                Event event2 = list.get(j);
                if(event1.getStart().isBefore(event2.end()) && event2.getStart().isBefore(event1.end()))
                    System.out.println("ERROR: накаладуються івенти " + event1 + " та "+ event2);
            }
        }

    }






}
