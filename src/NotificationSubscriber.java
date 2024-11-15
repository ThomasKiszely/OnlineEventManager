public class NotificationSubscriber implements EventsNotification{
    private String name;
    public NotificationSubscriber (String name){
        this.name = name;
    }
    @Override
    public void update(String message){
        System.out.println(name + " received message " + message);
    }
}
