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
		System.out.println(enemies.RandomHP());
		System.out.println(enemies.Random_SP());
		System.out.println("HP: " + enemies.getHP());
		System.out.println("SP: " + enemies.getSP());
		Equipamentos ep1 = new Equipamentos();
		System.out.println(ep1.getArmaduras(1));
		System.out.println(ep1.getArmas(0));
	}

}
