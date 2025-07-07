package ifsc.poo;

public class NaveCargueira extends NaveEspacial implements Blindada, Tripulada {
    private int capacidadeMaximaCarga = 100;
    private int cargaAtual = 0;
    private boolean blindagemAtiva = false;

    public NaveCargueira() { super(14, 5); }

    public String ativarBlindagem() {
        blindagemAtiva = true;
        return "NaveCargueira (ID#" + id + "): blindagem ativada.";
    }

    public String desativarBlindagem() {
        if (velocidadeAtual == 0) {
            blindagemAtiva = false;
            return "NaveCargueira (ID#" + id + "): blindagem desativada.";
        }
        return "NaveCargueira (ID#" + id + "): não pode desativar blindagem em movimento.";
    }

    public String controlarManual() {
        return "NaveCargueira (ID#" + id + "): controle manual ativado.";
    }

    public String carregar(int peso) {
        cargaAtual += peso;
        String msg = "Carga atual: " + cargaAtual;
        if ((double) cargaAtual / capacidadeMaximaCarga > 0.7)
            msg += ". " + ativarBlindagem();
        return "NaveCargueira (ID#" + id + "): " + msg;
    }

    public String descarregar(int peso) {
        cargaAtual -= peso;
        if (cargaAtual < 0) cargaAtual = 0;
        return "NaveCargueira (ID#" + id + "): carga descarregada. Atual: " + cargaAtual;
    }
}
