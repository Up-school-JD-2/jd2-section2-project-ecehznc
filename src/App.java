
public class App {
	public String name;
	public double version;
	public int size;
	
	public App(String name, double version, int size) {
		this.name = name;
		this.version = version;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "App [name=" + name + ", version=" + version + ", size=" + size + "]";
	}
	
	

}
