package formes.deux;

public class Rectangle implements Forme {
	
	private int lon;
	private int lar;
	
	public Rectangle(int lon, int lar) {
		this.lon = lon;
		this.lar = lar;
	}

	public int getLon() {
		return lon;
	}

	public void setLon(int lon) {
		this.lon = lon;
	}

	public int getLar() {
		return lar;
	}

	public void setLar(int lar) {
		this.lar = lar;
	}

	@Override
	public void printAttribut() {
		System.out.println("lon : " + lon + " - lar : " + lar);
		
	}
	
}
