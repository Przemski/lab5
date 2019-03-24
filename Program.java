public class Program {
public static void main(String[] args) { 
Punkt p = new Punkt();
p.set();
System.out.println(p.wsp());

Odcinek o = new Odcinek();
o.set();
System.out.println(o.dl());


Okrag oo = new Okrag(2);
oo.info();
}
}
