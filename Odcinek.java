public class Odcinek {
private Punkt p1 = new Punkt();
private Punkt p2 = new Punkt();
Odcinek(double x1,double y1,double x2,double y2) {
p1.set(x1,y1);
p2.set(x2,y2);
}
public String wsp() {
return this.p1.wsp()+this.p2.wsp();
}
public double dl() {
return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
}
}