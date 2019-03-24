import java.util.Scanner;

public class Odcinek {
private Punkt p1 = new Punkt();
private Punkt p2 = new Punkt();
private Scanner ok = new Scanner(System.in);
Odcinek(double x1,double y1,double x2,double y2) {
p1.set(x1,y1);
p2.set(x2,y2);
}


public Punkt getP1() {
	return p1;
}


public void setP1(Punkt p1) {
	this.p1 = p1;
}


public Punkt getP2() {
	return p2;
}


public void setP2(Punkt p2) {
	this.p2 = p2;
}

public void set (double x1,double y1,double x2,double y2) {
this.x1=x1;
this.x2=x2;
this.y1=y1;
this.y2=y2;
}

public void set() {
System.out.print("x1=");
x1=ok.nextDouble();
System.out.print("y1=");
y1=ok.nextDouble();
System.out.print("x2=");
x2=ok.nextDouble();
System.out.print("y2=");
y2=ok.nextDouble();
}

public String wsp() {
return this.p1.wsp()+this.p2.wsp();
}
public double dl() {
return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
}
}
