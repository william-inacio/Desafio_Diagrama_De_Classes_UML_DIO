package Aparelho.Musica;

public class Ipod implements ReproduzMusica {
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar musica");
    }
}