public class LutadorLeve extends Lutador{
    public LutadorLeve(String nome){
        super(nome, 100, 100, 10);
    }

    @Override
    public void atacar (Lutador oponente){

        int dano = forca;
        oponente.vida -= forca;
        System.out.println("Jogador " + this.nome + " Atacou " + oponente.nome);

        if (oponente.vida < 0 ){
            throw new ArithmeticException("Oponente está nocauteado");
        }else {
            System.out.println("Oponente ainda resiste");
        }

    }
    @Override
    public void especial(Lutador oponente) {
        if (this.energia < energia){
            throw new ArithmeticException("Não possui energia suficiente");

        }else {

            System.out.println("É possivel atacar");
        }

        this.energia -= energia;
        oponente.vida -= 90;
        System.out.println("Jogador " + this.nome + " Executou um especial em " + oponente.nome);

    }

    @Override
    public void defender(Lutador oponente) {

        if (this.energia == 100){
            System.out.println("Lutador" +this.nome+ " Defendeu ataque de " +oponente.nome);
        }else if (this.energia < 100){
            energia += 5;
            System.out.println("Lutador" +this.nome+ " Defendeu ataque de " +oponente.nome+ " recarregando a energia");

        }

    }
}
