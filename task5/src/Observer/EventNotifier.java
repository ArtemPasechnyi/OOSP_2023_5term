package Observer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class EventNotifier {
    private List<Event> events;

    public EventNotifier() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void startNotifier() {
        Timer timer = new Timer(true);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime currentTime = LocalDateTime.now();

                for (Event event : events) {
                    if (event.getEventDateTime().isAfter(currentTime) &&
                            Duration.between(currentTime, event.getEventDateTime()).toMinutes() <= 15) {
                        notifyUser(event);
                    }
                }
            }
        }, 0, 60 * 1000);
    }

    private void notifyUser(Event event) {
        System.out.println("Notification: Event '" + event.getEventName() +
                "' is scheduled in 15 minutes at " + event.getEventDateTime());
    }
}
