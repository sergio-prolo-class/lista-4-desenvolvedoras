package ifsc.poo;

public class NaveCargueira extends NaveEspacial implements Blindada, Tripulada {

    private int capacidadeMaximaCarga;
    private int cargaAtual;

    public NaveCargueira() {
        super(14, 5);
        this.capacidadeMaximaCarga = 100; // Valor de exemplo para a capacidade
        this.cargaAtual = 0;
    }

    // Método obrigatório da interface Blindada
    @Override
    public String ativarBlindagem() {
        return "NaveCargueira (ID#" + this.id + "): blindagem ativada.";
    }

    // Método obrigatório da interface Tripulada
    @Override
    public String controlarManual() {
        return "NaveCargueira (ID#" + this.id + "): controle manual ativado.";
    }

    // Método específico da NaveCargueira
    public String carregar(int peso) {
        this.cargaAtual = this.cargaAtual + peso;
        String relatorioCarga = "NaveCargueira (ID#" + this.id + "): Carga atual é " + this.cargaAtual;

        if ((double) this.cargaAtual / this.capacidadeMaximaCarga > 0.7) {
            // Relaciona a mensagem de carga com a mensagem de ativação da blindagem.
            relatorioCarga = relatorioCarga + ". " + this.ativarBlindagem();
        }

        return relatorioCarga;
    }

    public String descarregar(int peso) {
        this.cargaAtual = this.cargaAtual - peso;
        if (this.cargaAtual < 0) {
            this.cargaAtual = 0; // Evita que a carga fique com valor negativo
        }
        return "NaveCargueira (ID#" + this.id + "): Carga descarregada. Carga atual é " + this.cargaAtual;
    }

    @Override
    public String decolar() {
        return "NaveCargueira (ID#" + this.id + "): decolando.";
    }
}