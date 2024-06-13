package application;

import java.util.Scanner;

import Interfaces.aparelhoTelefonico;
import Interfaces.navegadorInternet;
import Interfaces.reprodutorMusical;

public class Iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina.");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Página adicionada.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo telefone.");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando para algum número.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
		
	}

	@Override
	public void tocar() {
		System.out.println("Sua musica está sendo reproduzida");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone();
		int opcao;
		
		do {
			System.out.println("Selecione uma opcao\n" + "1 - Exibir pagina na web\n" + 
		"2 - Adicionar pagina\n" + "3 - Atualizar pagina\n" + "4 - Atender telefone\n" +
					"5 - Ligar para numero\n" + "6 - Iniciar correio de voz\n" +
		"7 - Reproduzir musica\n" + "8 - Pausar musica\n" + "9 - Selecionar Musica\n" + 
					"0 - Encerrar");
			
			
			
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				iphone.exibirPagina();
				Thread.sleep(1500);
				break;
			case 2:
				iphone.adicionarNovaAba();
				Thread.sleep(1500);
				break;
			case 3:
				iphone.atualizarPagina();
				Thread.sleep(1500);
				break;
			case 4:
				iphone.atender();
				Thread.sleep(1500);
				break;
			case 5:
				iphone.ligar();
				Thread.sleep(1500);
				break;
			case 6:
				iphone.iniciarCorreioVoz();
				Thread.sleep(1500);
				break;
			case 7:
				iphone.tocar();
				Thread.sleep(1500);
				break;
			case 8:
				iphone.pausar();
				Thread.sleep(1500);
				break;
			case 9:
				iphone.selecionarMusica();
				Thread.sleep(1500);
				break;

			default: System.out.println("Opção inválida, digite um número de 0 a 9");
				break;
			}
		} while (opcao != 0);
	}
}
