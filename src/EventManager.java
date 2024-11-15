import java.util.Scanner;
import java.util.ArrayList;
public class EventManager {
    Scanner input = new Scanner(System.in);
    private ArrayList<Event> events = new ArrayList<>();
    public void addConcert(String name, String description){
        events.add(new Concert(name, description));
    }
    public void addWorkShop(String name, String description){
        events.add(new WorkShop(name, description));
    }

    public void makeNewEvent(){
        System.out.println("1 for concert, 2 for workshop");
        String choice = input.nextLine();
        switch (choice){
            case "1":
                makeNewConcert();
                break;
            case "2":
                makeNewWorkShop();
                break;
            default:
                System.out.println("Invalid choice - try again");
        }
    }
    public void makeNewConcert(){
        System.out.println("Please enter name of Concert");
        String name = input.nextLine();
        System.out.println("Please enter description");
        String description = input.nextLine();
        addConcert(name, description);
        System.out.println("Concert added");
        for (Event event : events) {
            System.out.println(event.getDetails());
        }
    }
    public void makeNewWorkShop(){
        System.out.println("Please enter name of Work Shop");
        String name = input.nextLine();
        System.out.println("Please enter description");
        String description = input.nextLine();
        addWorkShop(name, description);
        System.out.println("Work shop added");
        for (Event event : events) {
            System.out.println(event.getDetails());
        }
    }
}

