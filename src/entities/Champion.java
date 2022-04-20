package entities;

public class Champion {
	private String name;
	private int life;
	private int damage;
	private int armor;
	
	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.damage = damage;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		if ((other.getDamage() - getArmor()) > 0) {
			setLife(getLife() - (other.getDamage() - getArmor()));	
		} else {
			setLife(getLife() - 1);
		}
	}
	
	public String status() {
		if (getLife() > 0) {
			return String.format("%s: %d de vida", getName(), getLife());
		}
		else {
			setLife(0);
			return String.format("%s: 0 de vida (morreu)", getName());
		}
	}
	
}
