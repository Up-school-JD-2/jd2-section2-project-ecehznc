import java.util.Scanner;


public class Main {
    private static PhoneManagement phoneManagement = new PhoneManagement();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        phoneManagement.addApp("Instagram", 1.0, 10);
        phoneManagement.addApp("Whatsapp", 3.0, 80);
        phoneManagement.addPerson("Ece", "Hazneci", "5054586253", "ece.hazneci@gmail.com");
        phoneManagement.addPerson("Mert", "Yıldız", "5559876543", "mert.yıldız@gmail.com");

        while (true) {
            System.out.println("1. Add App");
            System.out.println("2. Add Person");
            System.out.println("3. Remove App");
            System.out.println("4. Remove Person");
            System.out.println("5. Update App");
            System.out.println("6. Search Person");
            System.out.println("7. Check Storage Space");
            System.out.println("8. Çıkış");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Menu.addApp(scanner);
                    break;
                case 2:
                    Menu.addPerson(scanner);
                    break;
                case 3:
                	Menu.removeApp(scanner);
                    break;
                case 4:
                	Menu.removePerson(scanner);
                    break;
                case 5:
                	Menu.updateApp(scanner);
                    break;
                case 6:
                	Menu.searchPerson(scanner);
                    break;
                case 7:
                	Menu.checkStorage(scanner);
                    break;
                case 8:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Unvalid choice");
            }
        }
    }

    
}