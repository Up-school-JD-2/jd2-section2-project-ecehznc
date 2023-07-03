import java.util.Scanner;

public class Menu {

    private static PhoneManagement phoneManagement;
    private static Scanner scanner= new Scanner(System.in);
	private static int id;
    
	public Menu(PhoneManagement phoneManagement) {
		this.phoneManagement = phoneManagement;
		this.scanner = scanner;
	}
		
	public void Menu() {
		while (true) {
			System.out.println("\n---Phone Management---");		
		}
	}
	public static void addApp(Scanner scanner) {
	    System.out.print("App Name: ");
	    String appName = scanner.nextLine();
	    System.out.print("App Version: ");
	    double appVersion = scanner.nextDouble();
	    System.out.print("App Size: ");
	    int appSize = scanner.nextInt();
	    scanner.nextLine(); 

	    phoneManagement.addApp(appName, appVersion, appSize);
	    System.out.println("App added: " + appName);
	}

    public static void addPerson(Scanner scanner) {
        System.out.print("Ad: ");
        String name = scanner.nextLine();
        System.out.print("Soyad: ");
        String surname = scanner.nextLine();
        System.out.print("Telefon numarası: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("E-posta adresi: ");
        String emailAddress = scanner.nextLine();

        phoneManagement.addPerson(name, surname, phoneNumber, emailAddress);
        System.out.println("A new person was added " + name + " " + surname);
    }
    
    public static void removeApp(Scanner scanner) {
        System.out.print("App name: ");
        String name = scanner.nextLine();
        if (phoneManagement.removeApp(name)) {
            System.out.println("App removed: " );
        } else {
            System.out.println("App not found: ");
        }
       
    }
    
    public static void removePerson(Scanner scanner) {
    	System.out.print("Ad: ");
        String name = scanner.nextLine();
        System.out.print("Soyad: ");
        String surname = scanner.nextLine();
        if (phoneManagement.removePerson(name, surname)) {
            System.out.println("Person was removed: " );
        } else {
            System.out.println("Person can not found: ");
        }
        System.out.println("Person was removed " + name + " " + surname);
    }
    
    public static void updateApp(Scanner scanner) {
    	System.out.print("Ad: ");
        String name = scanner.nextLine();    	
    }
    
    public static void searchPerson(Scanner scanner) {
    	System.out.print("Ad: ");
        String name = scanner.nextLine();
        System.out.print("Soyad: ");
        String surname = scanner.nextLine();
        Person person = phoneManagement.searchPerson(name, surname);
	    if(person==null) {
	    	System.out.println("Person cannot be found");
	    	return;
	    }
	    System.out.println(person);
        
    }
    
    public static void checkStorage(Scanner scanner) {
    	System.out.print("Serial number: ");
        String name = scanner.nextLine();
    }

}
