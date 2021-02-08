
public class DamageCollection implements Collection{
	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	Damage[] damageList;
	
	public DamageCollection() {
		damageList = new Damage[MAX_ITEMS];
	}
	public void addDot(String damageType, float damageAmount) {
		Damage dot = new Damage(damageType, damageAmount);
		if (numOfItems >= MAX_ITEMS) {
			System.err.println("Can not have any more damage");
		}else {
			damageList[numOfItems]=dot;
			numOfItems++;
		}
	}

	@Override
	public Iterator createIterator() {
		return new DamageIterator(damageList);
	}
}
