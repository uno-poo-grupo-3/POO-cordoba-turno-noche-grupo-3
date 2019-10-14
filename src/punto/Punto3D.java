package punto;

public class Punto3D extends Punto {
	private double z;
	
	public static void main(String[] args) {
		Punto3D p1 = new Punto3D(10, 4, 5);
		System.out.println(p1.getZ());
	}

	public Punto3D(double z) {
		super();
		this.z = z;
	}
	
	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.setZ(z);
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Punto3D [z=" + z + "]";
	}
}
