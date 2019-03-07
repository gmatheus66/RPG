package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	private String N;
	private BufferedReader reader;
	private BufferedReader reader2;

	public String getN() {
		return N;
	}

	public void setN(String n) {
		N = n;
	}

	public void CriarArquivo(String Nome) throws IOException {
		try {
			setN(Nome);
			File file = new File(getN() + ".txt");
			if (!file.exists()) {
				file.createNewFile();

			}

			System.out.println("Arquivo Criado");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao criar o arquivo");
		}
	}

	public void EscreverArquivo(String Nome, String Classe, int HP, int SP) throws IOException {
		try {
			FileWriter fw = new FileWriter(getN() + ".txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(Nome);
			bw.newLine();
			bw.write(Classe);
			bw.newLine();
			bw.write(HP);
			bw.newLine();
			bw.write(SP);
			bw.newLine();
			bw.close();
			System.out.println("Arquivo foi escrito");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao Escrever no Arquivo");
		}

	}

	public void LerArquivo() throws IOException {
		try {
			FileReader lerarq = new FileReader(getN() + ".txt");
			reader = new BufferedReader(lerarq);
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("ERRO ao ler o arquivo");
		}
		

	}
	
	public void AlterarLinha(String Nome, String Linha, String Linha_Alterada) throws IOException {
		FileReader lerarq = new FileReader(Nome + ".txt");
		reader2 = new BufferedReader(lerarq);
		String line;
		while((line = reader2.readLine())!= null) {
			if(line == Linha) {
				FileWriter fw = new FileWriter(Nome + ".txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(Linha_Alterada);
				bw.close();
				
			}else {
				System.out.println(line);
			}
		}
		
		
	}

	public void ExcluirArquivo(String Nome) {

		File file = new File(getN() + ".txt");
		if (file.exists()) {
			file.delete();
		}

	}

}
