import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneManagement {
	private Map<String, Phone> phones;
	private Map<String, App> apps;
	private List<Person> persons;
	private int totalStorage;
	
	public PhoneManagement() {
		phones = new HashMap<>();
		apps = new HashMap<>();
		persons = new ArrayList<>();
		totalStorage = 0;
	}

	public void addApp(String name, double version, int size) {
	    if (!apps.containsKey(name)) {
	        App app = new App(name, version, size);
	        apps.put(name, app);
	        System.out.println("App was added: " + name);
	    } else {
	        System.out.println("App already exists.");
	    }
	}

public void addPerson(String name, String surname, String phoneNumber, String eMailAddress) {	
	
	Person person = new Person(name, surname, phoneNumber, eMailAddress);
	persons.add(person);
	System.out.println("A new person was added: " + name + " " + surname);
}


public boolean removeApp( String name) {

    phones.entrySet().stream()
        .filter(entry -> entry.getKey().equals(name))
        .forEach(entry -> {
            List<App> appList = (List<App>) entry.getValue();
            appList = appList.stream()
                .filter(app -> !app.getName().equals(name))
                .collect(Collectors.toList());
            phones.put(entry.getKey(), (Phone) appList);
        });
	return false;
}


public boolean removePerson(String name, String surname) {
	
	for(Person person : persons) {
		if(person.getName().equals(name) && person.getSurname().equals(surname)) {
			persons.remove(person);
			System.out.println("The person was removed: " + name + " " + surname);
			return false;
		}
	}
	System.out.println("That person cannot be found.");
	return false;
}

public void updateApp(String name, double version, int size) {

	App app = new App(name, version, size);
	phones.entrySet().stream()
    .filter(entry -> entry.getKey().equals(name))
    .forEach(entry -> {
    	Map<String, App> appMap = (Map<String, App>) entry.getValue();
    	appMap.values().stream()
            .filter(a -> a.getName().equals(name))
            .sorted(Comparator.comparing(App::getName))
            .forEach(a -> a.setVersion(version));
    });
	

}

public Person searchPerson(String name, String surname) {
    for (Person person : persons) {
    	Scanner scanner = new Scanner(System.in);
        if (person.getName().equals(name) && person.getSurname().equals(surname)) {
        	
        	System.out.print("Enter the name of the person");
    	    scanner.nextLine();
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Phone Number: " + person.getPhoneNumber());
            System.out.println("E-Mail Address: " + person.geteMailAddress());
            return person;
        }
        else {  
    System.out.println("The person cannot be found");
      }
    }
	return null;
}

public void checkStorage(String serialNumber) {
    if (phones.containsKey(serialNumber)) {
        Phone phone = phones.get(serialNumber);
        double totalStorage = phone.getStorageSpace();
        Map<String, List<App>> appMap = (Map<String, List<App>>) apps.get(serialNumber);

        if (appMap != null) {
            for (List<App> appList : appMap.values()) {
                for (App app : appList) {
                    totalStorage -= app.getSize();
                }
            }
        }
        
        System.out.println("Total storage space: " + phone.getStorageSpace() );
        System.out.println("Used storage space: " + (phone.getStorageSpace() - totalStorage) + " GB");
        System.out.println("Empty storage space: " + totalStorage + " GB");
    } 
}



	
	
}
