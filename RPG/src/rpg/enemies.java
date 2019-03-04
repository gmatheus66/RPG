package rpg;

import java.util.Random;

public class enemies implements Personagem {

	private String nome[] = { "Javali", "Ettercap", "Salamandra", "Manticore", "Boarman", "Abalin", "Morcego",
			"Pantera", "Troll", "Makara", "Avolakia", "Gárgulas", "Gnoll", "Gimlorck", "Harpias", "Espantalho", "Cobra",
			"Golem", "Ciclope", "Esqueleto", "Basilisco", "Andarilho" };
	private int HP;
	private int SP;
	private String escolha_classe;
	private int contador;

	
	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}


	public int Random_SP() {
		Random gera = new Random();
		return gera.nextInt();
	}
	
	
	//gerar HP randomico
	public int RandomHP() {
		Random gerar = new Random();
		return gerar.nextInt(3000);
	}
	
	
	//gerar enemies randomicos
	public int Random_enemies() {
		Random gera = new Random();
		return gera.nextInt(nome.length);
	}

	@Override
	public String getNome(int i) {
		// TODO Auto-generated method stub
		setContador(i);
		return nome[i];
	}

	
	public void setNome(String Nome, int i) {
		
		this.nome[i +1] = Nome;
		// TODO Auto-generated method stub

	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return HP;
	}

	@Override
	public void setHP(int HP) {
		// TODO Auto-generated method stub
		this.HP = HP;
	}

	@Override
	public int getSP() {
		// TODO Auto-generated method stub
		return SP;
	}

	@Override
	public void setSP(int SP) {
		// TODO Auto-generated method stub
		this.SP = SP;
	}

	@Override
	public String getEscolha_classe() {
		// TODO Auto-generated method stub
		return escolha_classe;
	}

	@Override
	public void setEscolha_classe(String escolha_classe) {
		// TODO Auto-generated method stub
		this.escolha_classe = escolha_classe;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setNome(String Nome) {
		// TODO Auto-generated method stub
		
	}
	

}
