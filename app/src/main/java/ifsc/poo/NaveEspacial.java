package ifsc.poo;

public abstract class NaveEspacial {

    // Contador para garantir que cada nave tenha um ID único.
    private static int proximoId = 1;

    // Atributos que toda nave terá.
    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;
    protected int quantidadeMaximaTripulantes;

    // Construtor que as classes filhas usarão para nascer.
    public NaveEspacial(int velocidadeMaxima, int quantidadeMaximaTripulantes) {
        this.id = proximoId++; // Atribui um ID único para a nave.
        this.velocidadeAtual = 0; // Toda nave começa parada.
        this.velocidadeMaxima = velocidadeMaxima;
        this.quantidadeMaximaTripulantes = quantidadeMaximaTripulantes;
    }

    // Apenas informa a ação básica.
    public String decolar() {
        return "Nave decolando";
    }

    // Apenas informa a ação básica.
    public String pousar() {
        return "Nave pousando";
    }

    // Apenas aumenta a velocidade em 1, sem retornar mensagem.
    public void acelerar() {
        this.velocidadeAtual++;
    }

    // Apenas diminui a velocidade em 1, sem retornar mensagem.
    public void frear() {
        this.velocidadeAtual--;
    }
}