package rpg;

import java.util.Scanner;

public class Classe  implements Personagem{
	
	
	private String Nome;
	private String escolha_classe;
	private int HP;
	private int SP;
	
	Scanner sc =  new Scanner(System.in);
	
	
	public String escolhaClasse() {
		System.out.println(" ");
		System.out.println("--------------------------");
		System.out.println("Vamos a escolha da Classe !!! ");
		System.out.println(" Guerreiro  |  Mago  |  Arqueiro  |  Berserker");
		System.out.println("Escolha sua Classe: ");
		escolha_classe = sc.next();
		if(escolha_classe.equals("Guerreiro") || escolha_classe.equals("guerreiro")) {
			//Guerreiro
			System.out.println("Qual o Nome do Guerreiro: ");
			setNome(sc.next());
			setHP(2500);
			setSP(1000);
			
		}
		else if(escolha_classe.equals("Mago") || escolha_classe.equals("mago")) {
			//Mago
			System.out.println("Qual o Nome do Mago: ");
			setNome(sc.next());
			setHP(1500);
			setSP(2500);
		}
		else if(escolha_classe.equals("Arqueiro") || escolha_classe.equals("arqueiro")) {
			//arqueiro
			System.out.println("Qual o Nome do Arqueiro: ");
			setNome(sc.next());
			setHP(1500);
			setSP(1000);
		}
		else if(escolha_classe.equals("Berserker") || escolha_classe.equals("berserker")) {
			//Berserker
			System.out.println("Qual o Nome do Berserker: ");
			setNome(sc.next());
			setHP(3000);
			setSP(500);
		}
		else {
			System.out.println("Escolha indisponivel");
			System.out.println("--------------------------");
			System.out.println(" ");
			return escolhaClasse();
		}
		escolha_classe = escolha_classe.substring(0,1).toUpperCase().concat(escolha_classe.substring(1));
		return descricao(escolha_classe);
	}
	
	//descriçao de cada classe
	public String descricao(String escolha) {
		if(escolha.equals("Guerreiro")) {
			System.out.println(" ");
			System.out.println("-------------------------");
			System.out.println("Guerreiro");
			System.out.println(" Este é o típico jovem que se arma com espada e escudo e abandona sua vila na companhia de colegas aventureiros. ");
			System.out.println("É a forma mais simples e conhecida de herói aventureiro, o tipomais comum em Aventuras Medievais.");
			System.out.println("Não é preciso muita coisa para ser um Guerreiro: basta uma arma e a disposição para usá-la.");
			System.out.println("HP: " + getHP() + "    " + "SP: " + getSP());
		}
		else if(escolha.equals("Mago")) {
			System.out.println(" ");
			System.out.println("-------------------------");
			System.out.println("Mago");
			System.out.println(" Os Magos têm o poder de utilizar os poderes naturais e elementais Como Terra, Fogo, aguá, ar e os poderes da natureza. ");
			System.out.println("Além de poderem causar pequenas Ilusões em seus adversários de menores leveis.");
			System.out.println("A arma que o Mago utiliza geralmente é um Bastão que contem os Poderes Citados a cima, mas ele não precisa da arma para usar seus Poderes, \n ele pode fazer magia apenas usando suas mãos e conjurando as magias por meio de fala.");
			System.out.println("HP: " + getHP() + "    " + "SP: " + getSP());
			
		}
		else if (escolha.equals("Arqueiro")) {
			System.out.println(" ");
			System.out.println("-------------------------");
			System.out.println("Arqueiro");
			System.out.println(" Exímios atiradores no uso do arco,  e estão muito além das capacidades de um guerreiro especialista.\n Sua afinidade e dedicação a um único tipo de arma, \n  torna possível que realizem verdadeiras proezas quando disparam suas flechas.");
			System.out.println("E contrariando as expectativas, arqueiros detestam serem rotulados de meros guerreiros especialistas em arco, \n pois consideram a sua classe uma classe distinta e com habilidades muito superior as habilidades de um guerreiro no uso do arco.");
			System.out.println("Um arqueiro é um verdadeiro mestre no uso de arco, e nem mesmo um guerreiro muito experiente pode se igualar as suas capacidades.");
			System.out.println("HP: " + getHP() + "    " + "SP: " + getSP());
		}
		else {
			System.out.println(" ");
			System.out.println("-------------------------");
			System.out.println("Berserker");
			System.out.println(" A Classe Guerreira, é lembrada e cultuada pela sua enorme força e agressividade dentro dos campos de batalha.");
			System.out.println("São famosos por lutarem sem armaduras, utilizando apenas machados e se atirando ferozmente para cima de qualquer oponente.");
			System.out.println("HP: " + getHP() + "    " + "SP: " + getSP());
		}
		return "";
	}
	
	
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return Nome;
	}

	@Override
	public void setNome(String Nome) {
		// TODO Auto-generated method stub
		this.Nome = Nome;
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

}
