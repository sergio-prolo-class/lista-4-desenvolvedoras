package ifsc.poo;

public class NaveMineradora extends NaveEspacial implements Tripulada {

    private int energiaLaserMaxima;
    private int energiaLaserAtual;

    public NaveMineradora() {
        super(18, 4);
        this.energiaLaserMaxima = 1000; // Valor de exemplo
        this.energiaLaserAtual = 1000;
    }

    // Método obrigatório da Interface Tripulada
    @Override
    public String controlarManual() {
        return "NaveMineradora (ID#" + this.id + "): controle manual ativado.";
    }

    public String minerar(int custo) {
        if (this.velocidadeAtual < (this.velocidadeMaxima * 0.1)) {

            if (this.energiaLaserAtual > custo) {

                this.energiaLaserAtual = this.energiaLaserAtual - custo;
                return "NaveMineradora (ID#" + this.id + "): Mineração realizada. Energia restante: " + this.energiaLaserAtual;

            } else {
                return "NaveMineradora (ID#" + this.id + "): Energia do laser insuficiente para minerar.";
            }

        } else {
            return "NaveMineradora (ID#" + this.id + "): Impossível minerar em alta velocidade.";
        }
    }

    @Override
    public String decolar() {
        return "NaveMineradora (ID#" + this.id + "): decolando.";
    }
}