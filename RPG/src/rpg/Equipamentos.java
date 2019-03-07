package rpg;

public class Equipamentos implements Equip{
	private int dano;
	private int defesa;
	private String armas[] = {"Machado","Greatswords","Foice","Cajados","Adagas","Espada Longa","Katana","Lança","Arco", "Espada Curta"};
	private String armaduras[] = {"Armadura acolchoada","Corselete de couro","Couro batido","Gibão de peles","Armadura de Gladiador","Couraça","Couraça de Bronze","Loriga segmentada"};
	private String escudos[] = {"Escudo leve","Escudo pesado","Escudo de corpo"};
	private int indice_armas;
	private int indice_armaduras;
	private int indice_escudos;

	@Override
	public int getDano() {
		// TODO Auto-generated method stub
		return dano;
	}

	public String getArmas(int i) {
		setIndice_armas(i);
		return armas[i];
	}
	
	public void setArmas(String Nome, int i) {
		this.armas[i + 1] = Nome;
	}
	
	
	public String getArmaduras(int i) {
		setIndice_armaduras(i);
		return armaduras[i];
	}
	
	public void setArmaduras(String Nome, int i) {
		this.armaduras[i + 1] = Nome;
	}
	
	
	public String getEscudos(int i) {
		setIndice_escudos(i);
		return escudos[i];
	}
	
	public void setEscudos(String Nome, int i) {
		this.escudos[i + 1] = Nome;
	}
	
	
	

	public int getIndice_armas() {
		return indice_armas;
	}

	public void setIndice_armas(int indice_armas) {
		this.indice_armas = indice_armas;
	}

	public int getIndice_armaduras() {
		return indice_armaduras;
	}

	public void setIndice_armaduras(int indice_armaduras) {
		this.indice_armaduras = indice_armaduras;
	}

	public int getIndice_escudos() {
		return indice_escudos;
	}

	public void setIndice_escudos(int indice_escudos) {
		this.indice_escudos = indice_escudos;
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
