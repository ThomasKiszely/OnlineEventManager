import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        EventManager eventManager = new EventManager();
        Scanner input = new Scanner(System.in);
        userManager.addUser("Thomas", "1234");
        userManager.addUser("Emma", "Mark");

        while (true) {
            System.out.println("1. Register");
            //Ville gerne have brugt Singleton til at registrere brugere, men er ikke sikker på at vi har gjort det
            System.out.println("2. Login");
            //Prøver at bruge Factory til nye events
            System.out.println("3. New event");
            //Bruger Observer til subscribere (forhåbentlig)
            System.out.println("4. Notify subscribers of new event");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    userManager.register();
                    break;
                case 2:
                    userManager.login();
                    break;
                case 3:
                    eventManager.makeNewEvent();
                    break;
                case 4:
                    userManager.notificate();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



