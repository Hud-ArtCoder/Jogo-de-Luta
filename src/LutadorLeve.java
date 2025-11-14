public class LutadorLeve extends Lutador{
    public LutadorLeve(String nome){
        super(nome, 100, 100, 10);
    }

    @Override
    public void atacar (Lutador oponente){
        int dano = forca;
        oponente.vida -= forca;
    }
    @Override
    public void especial(Lutador oponente) {
        this.energia -= 100;
        oponente.vida -= 75;
        System.out.println("Jogador" + this.nome + "executou com um especial em" + oponente.nome);
    }

}
