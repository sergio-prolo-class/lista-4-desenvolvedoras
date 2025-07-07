package ifsc.poo;

public class NaveMineradora extends NaveEspacial implements Tripulada {
    private int energiaLaserAtual = 1000;
    private int energiaLaserMaxima = 1000;

    public NaveMineradora() { super(18, 4); }

    public String controlarManual() {
        return "NaveMineradora (ID#" + id + "): controle manual ativado.";
    }

    public String minerar(int custo) {
        if (velocidadeAtual < velocidadeMaxima * 0.1) {
            if (energiaLaserAtual > custo) {
                energiaLaserAtual -= custo;
                return "NaveMineradora (ID#" + id + "): mineração realizada. Energia: " + energiaLaserAtual;
            }
            return "NaveMineradora (ID#" + id + "): energia insuficiente.";
        }
        return "NaveMineradora (ID#" + id + "): velocidade alta demais para minerar.";
    }
}
