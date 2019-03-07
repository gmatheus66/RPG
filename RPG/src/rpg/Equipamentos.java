package rpg;

public class Equipamentos implements Equip{
	private int dano;
	private int defesa;
	private String armas[] = {"Machados","Greatswords","Foice","Cajados","Adagas","Espada Longa","Katana","Lança","Arco", "Espada Curta"};
	

	@Override
	public int getDano() {
		// TODO Auto-generated method stub
		return dano;
	}

	@Override
	public void setDano(int dano) {
		// TODO Auto-generated method stub
		this.dano = dano;
	}

	@Override
	public int getDefesa() {
		// TODO Auto-generated method stub
		return defesa;
	}

	@Override
	public void setDefesa(int defesa) {
		// TODO Auto-generated method stub
		this.defesa = defesa;
	}

}
