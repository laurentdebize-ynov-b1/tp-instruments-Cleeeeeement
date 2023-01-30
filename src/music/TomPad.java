package music;

public class TomPad extends ElectronicPercussion {

	public TomPad(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public TomPad() {
		
	}
	
	public String demo() {
		return " TCHAAK ";
	}
	
	public String toString() {
		return "Tom Pad = "+super.toString();
	}
}
