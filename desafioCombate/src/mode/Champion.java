package mode;

public class Champion {

	private String name;
	private int life, amor, attack;

	public Champion(String name, int life, int attack, int amor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.amor = amor;
	}

	public void takeDamage(Champion oponente) {
		double atackReduzido;
		if (oponente.amor > this.attack) {
			atackReduzido = 1;
		} else {
			atackReduzido = this.attack - oponente.amor;
		}

		oponente.life -= atackReduzido;

		if (oponente.life < 0) {
			oponente.life = 0;
		}

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

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAmor() {
		return amor;
	}

	public void setAmor(int amor) {
		this.amor = amor;
	}

}
