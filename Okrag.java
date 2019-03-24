import java.util.Scanner;

class Okrag{
	
	double promien;
	double punkt;
	private Scanner okrag = new Scanner(System.in);
	Okrag(){
		promien = (0);
	}
	Okrag(double promien){
		this.promien = promien;
	}

	public double getPromien() {
		return promien;
	}
	public void setPromien(double promien) {
		this.promien = promien;
	}
	public double getPunkt() {
		return punkt;
	}
	public void setPunkt(double punkt) {
		this.punkt = punkt;
	}

public void set() {
	System.out.print("Promien");
	promien=okrag.nextDouble();
}

double obliczObwod(){
	return 2*3.14*promien;
}
void info() {
	System.out.println("Promien kola wynosi: " + promien);
	System.out.println("Obwod kola wynosi: " + obliczObwod());
}
 
}