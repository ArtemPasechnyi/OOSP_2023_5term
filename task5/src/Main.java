import Observer.Event;
import Observer.EventNotifier;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EventNotifier eventNotifier = new EventNotifier();

        Event event1 = new Event("Встреча с клиентом", LocalDateTime.now().plusHours(1));
        Event event2 = new Event("Презентация проекта", LocalDateTime.now().plusDays(2).plusHours(2));

        eventNotifier.addEvent(event1);
        eventNotifier.addEvent(event2);

        eventNotifier.startNotifier();
    }
}
