package Observer;

import java.time.LocalDateTime;

public class Event {
    private String eventName;
    private LocalDateTime eventDateTime;

    public Event(String eventName, LocalDateTime eventDateTime) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }
}
