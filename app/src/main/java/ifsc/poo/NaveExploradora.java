package ifsc.poo;

public class NaveExploradora extends NaveEspacial implements Blindada, Tripulada {
    private boolean holofotesLigados = false;

    public NaveExploradora() { super(14, 8); }

    public String ativarBlindagem() {
        return "NaveExploradora (ID#" + id + "): blindagem ativada.";
    }

    public String desativarBlindagem() {
        return "NaveExploradora (ID#" + id + "): blindagem desativada.";
    }

    public String controlarManual() {
        return "NaveExploradora (ID#" + id + "): controle manual ativado.";
    }

    public String ligarHolofotes() {
        holofotesLigados = true;
        return "NaveExploradora (ID#" + id + "): holofotes ligados.";
    }

    @Override
    public String pousar() {
        if (velocidadeAtual == 0) {
            holofotesLigados = false;
            return "NaveExploradora (ID#" + id + "): pousando. Holofotes desligados.";
        }
        return "NaveExploradora (ID#" + id + "): não pode pousar em movimento.";
    }
}
