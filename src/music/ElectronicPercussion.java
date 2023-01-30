package music;

public abstract class ElectronicPercussion extends PercussionInstruments {

	public ElectronicPercussion(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public ElectronicPercussion() {
		
	}

	public String toString() {
		return super.toString() + ", diameter:"+getDiameter()+", material:"+getMaterial();
	}
}
