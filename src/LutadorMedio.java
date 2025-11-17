public class LutadorMedio extends Lutador {
    public LutadorMedio (String nome){
        super(nome,120,100,15);
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
        oponente.vida -= 75;
        System.out.println("Jogador" +this.nome+"Executou um especial em"+ oponente.nome);
    }

    @Override
    public void defender(Lutador oponente) {
        this.energia += 10;
        System.out.println("Lutador" +this.nome+ " Defendeu ataque de " +oponente.nome);
    }
}
