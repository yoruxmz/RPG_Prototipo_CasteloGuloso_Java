import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String resposta1;
		String resposta_classe;
		String nomePlayer;
        String resposta_final;
		
		int hp_player = 0;
		int stg_player = 0;
		int hp_enemy1 = 115;
		int stg_enemy1 = 20;
		int escolha_classe = 0;
		int escolha1 = 0;
		int escolha_combate = 0;
		
do{
		do {
		    

			System.out.println("===== BEM VINDO, JOGADOR! =====");
			System.out.println("Por favor, digite o seu nome: ");

			nomePlayer = leitor.nextLine();

         do {

			System.out.println("Qual a sua classe: [1], [2], [3] ");
			System.out.println("[1] Guerreiro");
			System.out.println("[2] Tanque");
			System.out.println("[3] Andarilho");
			
			escolha_classe = leitor.nextInt();
			leitor.nextLine();
			
			if (escolha_classe == 1) {
			    hp_player = 150;
			    stg_player = 30;
			    System.out.println("Guerreiro: Uma classe focada em Equilibrio entre Força e Vitalidade. Perfeita para jogadores que buscam o combate constante.");
			} else if (escolha_classe == 2) {
			    hp_player = 300;
			    stg_player = 15;
			    System.out.println("Tanque: Classe focada em Vitalidade, mas pouco dano. Bom para os jogadores que amam se jogar ao perigo.");
			} else if (escolha_classe == 3) {
			    hp_player = 75;
			    stg_player = 5;
			    System.out.println("Andarilho: Uma Classe fraca no começo, porém esconde um potencial oculto. Escolha arriscada para iniciantes.");
			} else {
			   System.out.println("Classe não encontrada. Por favor, selecione uma classe válida.");
			}
			
			System.out.println("Deseja confirmar esta classe? (S/N)");
			resposta_classe = leitor.nextLine();
         } while (resposta_classe.equalsIgnoreCase("N"));
			

			System.out.println("Criando seu personagem! Aguarde...");
			System.out.println("===============================================================");
			System.out.println("Personagem criado com sucesso. Aqui está suas estatísticas:");
			System.out.println("Nome do personagem: " + nomePlayer);
			System.out.println("Classe: " + escolha_classe);

			System.out.println("Vitalidade: " + hp_player);
			System.out.println("Força: " + stg_player);
			System.out.println("================================================================");
			System.out.println("Deseja continuar? (S/N)");
			resposta1 = leitor.nextLine();
		} while (!resposta1.equalsIgnoreCase("S"));

		System.out.println("Personagem criado com sucesso.");
		System.out.println("Carregando...");
		System.out.println("===================================================================================");
		System.out.println("Você está atualmente em: Castelo Guloso");
        System.out.println("Você está na porta de entrada do castelo.");
	
	do {
	
		System.out.println("O que deseja fazer adiante?");
		System.out.println("[1] Explorar Castelo. [2] Sair da C!rea. [3] Fim de jogo.");

		escolha1 = leitor.nextInt();
		leitor.nextLine();

		if (escolha1 == 1) {
		    System.out.println("===============================================================================================================");
			System.out.println("Você decide explorar o castelo...");
			System.out.println("Ao entrar no castelo, você encontra um morto-vivo vagando pela entrada. Ele te avista e corre em sua direção.");
		} else {
		    System.out.println("Impossível acessar. Conteúdo ainda não lançado! Por favor, escolha outra opção!");
		}
	} while (escolha1 != 1);    
		
            
            do {
            System.out.println("=============================================================================================================================================");
            System.out.println("Morto-Vivo Guloso / Força: " + stg_enemy1 + " / HP:" + hp_enemy1 + " // " + nomePlayer + " / Força: " + stg_player + " / HP: " + hp_player);
            System.out.println("Você está em combate. O que irá fazer? (Correr não é uma opção!)");
            System.out.println("[1] Atacar");
            System.out.println("==============================================================================================================================================");
            
            escolha_combate = leitor.nextInt();
            leitor.nextLine();
            
            if (escolha_combate == 1) {
                System.out.println("Você atacou Morto-Vivo Guloso!");
                
                hp_enemy1 = hp_enemy1 - stg_player;
                
                System.out.println("Vida restante do inimigo: " + hp_enemy1);
                System.out.println("=============================================================================================================================");
                System.out.println("Morto-Vivo Guloso fica furioso e revida o ataque!");
                System.out.println("Morto-Vivo Guloso usa Mordida Calabresiana");
                
                hp_player = hp_player - stg_enemy1;
            } else {
                System.out.println("Não seja covarde!");
            }
            } while (hp_enemy1 > 0 && hp_player > 0);
            if (hp_enemy1 <= 0) {
            System.out.println("====================================");
            System.out.println("Inimigo derrotado, Meus parabéns!");
            
            } else if (hp_player <= 0) {
                System.out.println("Morto-Vivo Guloso te degustou. Fim de jogo!");
            }
            System.out.println("===============================================================================================");
            System.out.println("Parabéns! Você chegou até a fase final do meu protótipo. Quer recomeçar um novo perfil? (S/N)");
            resposta_final = leitor.nextLine();
            } while (resposta_final.equalsIgnoreCase("s"));
            
		leitor.close();
	}
}