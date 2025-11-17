import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        LutadorPesado jogador1 = new LutadorPesado("SubZero");
        LutadorLeve jogador2 = new LutadorLeve("Scorpion");

        jogador2.mostrarStatus();

        jogador1.especial(jogador2);


        jogador1.mostrarStatus();

        jogador1.defender(jogador2);

        jogador1.mostrarStatus();





    }
}