package ifsc.poo;

public class NaveExploradora extends NaveEspacial implements Blindada, Tripulada {

    private boolean holofotesLigados;

    public NaveExploradora() {
        super(14, 8);
        this.holofotesLigados = false;
    }

    @Override
    public String ativarBlindagem() {
        return "NaveExploradora (ID#" + this.id + "): blindagem ativada.";
    }

    @Override
    public String controlarManual() {
        return "NaveExploradora (ID#" + this.id + "): controle manual ativado.";
    }

    public String ligarHolofotes() {
        this.holofotesLigados = true;
        return "NaveExploradora (ID#" + this.id + "): holofotes ligados.";
    }

    @Override
    public String decolar() {
        return "NaveExploradora (ID#" + this.id + "): decolando.";
    }

    @Override
    public String pousar() {
        // Primeiro, chamamos o método original da classe mãe para ver se o pouso é possível.
        String relatorioPouso = super.pousar();

        // Verificamos se o pouso foi autorizado pela classe mãe.
        if (relatorioPouso.contains("autorizado")) {
            this.holofotesLigados = false;
            relatorioPouso = relatorioPouso + " Holofotes desligados automaticamente.";
        }

        return relatorioPouso;
    }
}