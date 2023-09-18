package aparelho;

import java.util.Scanner;

import util.Internet;
import util.Music;
import util.Phone;

public class Iphone implements Phone, Music, Internet{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Iphone iphone = new Iphone();
		boolean x = true;
		int a;
		
		while(x) {
			System.out.println("escolha opcao desejada:\n1 - ligar\n2 - atender\n3 - ir para correio de voz"
					+ "\n4 - tocar musica\n5 - pausar musica\n6 - selecionar musica\n7 - exibir pagina"
					+ "\n8 - adicionar nova aba\n9 - atualizar pagina\n10 - sair");
			a = entrada.nextInt();
			if(a !=10)
			iphone.controlador(a);
			else {
				x = !x;
				System.out.println("saindo");
				entrada.close();
			}
		}
	}


	public void exibirPagina() {
		System.out.println("exibindo pagina: ");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

	public void tocarMusica() {
		System.out.println("Tocando musica");
		
	}

	public void pausarMusica() {
			System.out.println("Musica pausada");
	}

	public void selecionarMusica() {
		System.out.println("musica selecionada");
		
	}

	public void ligar() {
		System.out.println("Ligando para contato");
	}

	
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz");
		
	}

	public void controlador(int a) {
		int i = a;
		switch (i) {
		case 1:
			ligar();
			break;
		case 2:
			atender();
			break;
		case 3:
			iniciarCorreioVoz();
			break;
		case 4:
			tocarMusica();
			break;
		case 5:
			pausarMusica();
			break;
		case 6:
			selecionarMusica();
			break;
		case 7:
			exibirPagina();
			break;
		case 8:
			adicionarNovaAba();
			break;
		case 9:
			atualizarPagina();
			break;
		default:
			System.out.println("Opção invalida!");
			
		}
	}
}
