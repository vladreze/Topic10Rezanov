package Practice10;

import java.util.Comparator;
import java.util.List;

public class LambdaRefactorLab {

    public static void sortAnonymous(List<Event> list){
        list.sort(new Comparator<Event>() {
            @Override
            public int compare(Event e1, Event e2) {
                return e1.getStart().compareTo(e2.getStart());
            }
        });
    }

    public static void sortLambda(List<Event> list){
        list.sort((e1, e2) -> e1.getStart().compareTo(e2.getStart()));
    }

    public static void sortMethodRef(List<Event> list){
        list.sort(Comparator.comparing(Event::getStart));
    }
}
