import java.util.Scanner;

public class Punkt {
private double x;
private double y; private Scanner kl = new Scanner(System.in);
Punkt() {
set(0,0);
}
Punkt(double x) {
set(x,x);
}
Punkt(double x,double y) {
set(x,y);
}
public double getX() {
return x;
}
public void setX(double x) {
this.x = x;
}
public double getY() {
return y;
}
public void setY(double y) {
this.y = y;
}
public void set(double x,double y) {
this.x=x;
this.y=y;
}
public void set() {
System.out.print("x=");
x=kl.nextDouble();
System.out.print("y=");
y=kl.nextDouble();
}
public String wsp() {
return "("+x+","+y+")";
}
}