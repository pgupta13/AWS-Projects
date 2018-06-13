package resources;

public class StateCity {
	private String state;
	private String city;
	private int zip;

	public StateCity(String state, String city, int zip) {
		this.state = state;
		this.zip = zip;
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public StateCity() {
		super();
		// TODO Auto-generated constructor stub
	}

}