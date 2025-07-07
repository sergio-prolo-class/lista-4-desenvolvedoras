package ifsc.poo;

public abstract class NaveEspacial {
    private static int proximoId = 1;
    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;
    protected int quantidadeMaximaTripulantes;

    public NaveEspacial(int velocidadeMaxima, int quantidadeMaximaTripulantes) {
        this.id = proximoId++;

        if (this instanceof Blindada && velocidadeMaxima != 14)
            throw new IllegalArgumentException("Blindadas devem ter velocidade máxima 14");
        if (!(this instanceof Blindada) && velocidadeMaxima > 20)
            throw new IllegalArgumentException("Velocidade máxima não pode passar de 20 para naves sem blindagem");
        if (this instanceof Tripulada && velocidadeMaxima < 12)
            throw new IllegalArgumentException("Tripuladas devem ter velocidade mínima de 12");
        if (this instanceof Autonoma && quantidadeMaximaTripulantes != 0)
            throw new IllegalArgumentException("Autônomas devem ter 0 tripulantes");

        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.quantidadeMaximaTripulantes = quantidadeMaximaTripulantes;
    }

    public void acelerar() {
        if (velocidadeAtual < velocidadeMaxima)
            velocidadeAtual++;
    }

    public void frear() {
        if (velocidadeAtual > 0)
            velocidadeAtual--;
    }

    public String decolar() {
        return "Nave (ID#" + id + "): decolando.";
    }

    public String pousar() {
        if (velocidadeAtual == 0)
            return "Nave (ID#" + id + "): pousando.";
        else
            return "Nave (ID#" + id + "): não pode pousar em movimento.";
    }

    public int getId() {
        return id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
