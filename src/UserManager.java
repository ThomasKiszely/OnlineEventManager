import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void addUser(String userName, String passWord) {
        users.add(new User(userName, passWord));

    }

    // Registrer ny bruger
    public void register() {
        System.out.print("Enter username: ");
        String userName = input.nextLine();
        NameChecker nameChecker = NameChecker.getInstance(userName);
        //Man ville måske sørge for at kun én bruger navnedatabasen ad gangen, så ikke der oprettes ens brugernavne
        System.out.println(nameChecker.checker);
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("User already exist");
                return;
            }
        }
            System.out.print("Enter password: ");
            String passWord = input.nextLine();
            addUser(userName, passWord);
            System.out.println("Registration successful.");
    }

    // Bruger login
    public void login() {
        System.out.print("Enter username: ");
        String userName = input.nextLine();
        System.out.print("Enter password: ");
        String passWord = input.nextLine();

        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassWord().equals(passWord)) {
                System.out.println("Login successful.");
                return;
            }
        }
        System.out.println("Invalid username or password.");
    }
    //Besked til subscribers
    public void notificate() {
        Notifications notifications1 = new Notifications();
        for (User user : users) {
            NotificationSubscriber User = new NotificationSubscriber(user.getUserName());
            notifications1.subscribe(User);
        }
        System.out.println("Enter new event for newsletter");
        String news = input.nextLine();

        notifications1.notifySubscribers(news);
    }
}
