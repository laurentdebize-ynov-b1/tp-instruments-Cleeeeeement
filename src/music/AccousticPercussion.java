package music;

public abstract class AccousticPercussion extends PercussionInstruments{

	public AccousticPercussion(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}


	public String toString() {
		return super.toString() + ", diameter:"+getDiameter()+", material:"+getMaterial();
	}
	
	
}
