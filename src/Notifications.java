import java.util.ArrayList;
import java.util.List;
public class Notifications{
    private List <EventsNotification> subscribers = new ArrayList<>();
    public void subscribe(EventsNotification subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(EventsNotification subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(String message){
        for(EventsNotification subscriber : subscribers){
            subscriber.update(message);
        }
    }
}