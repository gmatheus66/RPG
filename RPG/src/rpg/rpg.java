package rpg;



public class rpg {

	public static void main(String[] args) {
		System.out.println("Bem Vindo");
		Classe c = new Classe();
		//c.escolhaClasse();
		
		enemies enemies = new enemies();
		System.out.println(enemies.getNome(enemies.Random_enemies()));
		
		System.out.println(enemies.getNome(enemies.getContador()));
		System.out.println(enemies.getContador());
	}

}
