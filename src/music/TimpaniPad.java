package music;

public class TimpaniPad extends ElectronicPercussion {

	public TimpaniPad(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public TimpaniPad() {
		
	}
	
	public String demo() {
		return " DINNG ";
	}

	public String toString() {
		return "Timpani = "+super.toString();
	}
}
