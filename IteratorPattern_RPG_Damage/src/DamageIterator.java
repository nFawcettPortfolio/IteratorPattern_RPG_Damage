
public class DamageIterator implements Iterator{

	Damage[] damageList;
	int pos=0;
	
	public DamageIterator(Damage[] dotList) {
		this.damageList=dotList;
	}
	
	public Object next() {
		Damage dot = damageList[pos];
		pos++;
		return dot;
	}
	public boolean hasNext() {
		if (pos >= damageList.length||damageList[pos] == null){
			return false;
		}
		return true;
	}
	
}
