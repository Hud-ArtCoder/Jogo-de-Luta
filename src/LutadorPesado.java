public class LutadorPesado extends Lutador{
    public LutadorPesado (String nome){
        super(nome,150,100,20);
    }

    @Override
    public void atacar(Lutador oponente) {
        int dano = forca;
        oponente.vida -= forca;
        System.out.println("Jogador " + this.nome + " Atacou " + oponente.nome);
    }

    @Override
    public void especial(Lutador oponente) {
        this.energia -= energia;
        oponente.vida -= 90;
        System.out.println("Jogador " + this.nome + " Executou um especial em " + oponente.nome);
    }

    @Override
    public void defender(Lutador oponente) {
        if (this.energia == 100){
            System.out.println("Lutador" +this.nome+ " Defendeu ataque de " +oponente.nome);
        }else if (this.energia < 100){
            energia == ;
            System.out.println("Lutador" +this.nome+ " Defendeu ataque de " +oponente.nome+ " recarregando a energia");

        }
    }
}
