package rpg;

public class fight extends Classe {
	private String N_Oponente1 = getNome();
	private String N_Oponente2;
	private String Classe_Oponente1 = getEscolha_classe();
	private String Classe_Oponente2;

	public void luta() {
		enemies enemies = new enemies();
		enemies.getNome(enemies.Random_enemies());
		

	}

	public String getN_Oponente1() {
		return N_Oponente1;
	}

	public void setN_Oponente1(String n_Oponente1) {
		N_Oponente1 = n_Oponente1;
	}

	public String getN_Oponente2() {
		return N_Oponente2;
	}

	public void setN_Oponente2(String n_Oponente2) {
		N_Oponente2 = n_Oponente2;
	}

	public String getClasse_Oponente1() {
		return Classe_Oponente1;
	}

	public void setClasse_Oponente1(String classe_Oponente1) {
		Classe_Oponente1 = classe_Oponente1;
	}

	public String getClasse_Oponente2() {
		return Classe_Oponente2;
	}

	public void setClasse_Oponente2(String classe_Oponente2) {
		Classe_Oponente2 = classe_Oponente2;
	}

}
