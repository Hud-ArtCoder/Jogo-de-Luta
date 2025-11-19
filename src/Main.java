import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lutador[]lutadores = new Lutador[2];

        boolean i = false;

        while (i != true){
            System.out.println("Digite o nome de um jogador");
            String nome = sc.next();

            try{
                Scanner scanner = new Scanner(System.in);


                System.out.println("Tipo de Lutador: ");
                System.out.println("Escolha 1 para Lutador Leve");
                System.out.println("Escolha 2 para Lutador Médio");
                System.out.println("Escolha 3 para Lutador Pesado");

                int tipo = sc.nextInt();

                if(tipo != 0){
                    i = true;
                }else{
                    i = false;
                }

                Lutador lutador;

                i = false;

                while (i != true){
                    System.out.println("Digite o oponente ");
                    String nomeoponente = sc.next();

                    System.out.println("Tipo de Lutador: ");
                    System.out.println("Escolha 1 para Lutador Leve");
                    System.out.println("Escolha 2 para Lutador Médio");
                    System.out.println("Escolha 3 para Lutador Pesado");

                    int tipooponente = sc.nextInt();

                    if(tipooponente != 0){
                        i = true;
                    }else{
                        i = false;
                    }

                }

                for (int j = 0;j < 2; j++){
                    switch (tipo) {
                        case 1:
                            lutador = new LutadorLeve(nome);
                            break;

                        case 2:
                            lutador = new LutadorMedio(nome);
                            break;

                        case 3:
                            lutador = new LutadorPesado(nome);
                            break;

                        default:
                            System.out.println("Tipo inválido! Criando lutador leve por padrão.");
                            lutador = new LutadorLeve(nome);
                            break;

                    }
                    lutadores[j] = lutador;

                }

            }catch (InputMismatchException e) {
                System.out.println("Por favor, digite apenas números");
            }
        }

        System.out.println("\n--- INICIANDO O COMBATE ---");
        Lutador p1 = lutadores[0];
        Lutador p2 = lutadores[1];

        p1.atacar(p2);
        p2.defender(p1);
        p2.atacar(p2);
        p1.especial(p2);
        p2.mostrarStatus();
        p1.mostrarStatus();
        p1.estaVivo();

    }

}