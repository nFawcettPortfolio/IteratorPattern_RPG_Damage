
public class Main {
	public static void main(String args[]) {
		
		DamageCollection damage = new DamageCollection();
		damage.addDot("Electric", 5);
		damage.addDot("Fire", 12);
		damage.addDot("Ice", 8);
		damage.addDot("Poison", 4);

        Iterator iterator = damage.createIterator(); 
        while (iterator.hasNext()) 
        { 
            Damage d = (Damage)iterator.next(); 
            System.out.println(d.toString()); 
        } 
	}
}
