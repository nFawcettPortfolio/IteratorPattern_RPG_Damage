
public class Damage {
	private String damageType;
	private float damageAmount;

	public Damage(String damageType, float damageAmount) {
		this.damageType=damageType;
		this.damageAmount=damageAmount;
	}
	public String getDamageType() {
		return damageType;
	}
	public void setDamageType(String damageType) {
		this.damageType=damageType;
	}
	public float getDamageAmount() {
		return damageAmount;
	}
	public void setDamageAmount(float damageAmount) {
		this.damageAmount=damageAmount;
	}
	@Override
	public String toString() {
		return "You suffer "+damageAmount+" "+damageType+" damage";
	}
}

