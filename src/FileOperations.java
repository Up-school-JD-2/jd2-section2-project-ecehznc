import java.util.List;
import java.util.Map;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class FileOperations {
	public void saveData(Map<String, Phone> phones, Map<String, List<App>> apps, List<Person> persons) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("veri_yedekleme.txt");
		         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

		        objectOutputStream.writeObject(phones);
		        objectOutputStream.writeObject(apps);
		        objectOutputStream.writeObject(persons);

		        System.out.println("Data is saved");
		    } catch (IOException e) {
		        System.out.println("Failed " + e.getMessage());
		    }
		}
	

}
