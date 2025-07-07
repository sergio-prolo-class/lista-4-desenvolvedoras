package ifsc.poo;

public class NaveSentinela extends NaveEspacial implements Autonoma {
    private boolean radar = false;

    public NaveSentinela() { super(10, 0); }

    public String ativarControleAutomatico() {
        return "NaveSentinela (ID#" + id + "): controle automático ativado.";
    }

    public String ligarRadar() {
        if (velocidadeAtual > velocidadeMaxima * 0.9)
            return "NaveSentinela (ID#" + id + "): velocidade muito alta para ligar o radar.";
        radar = true;
        return "NaveSentinela (ID#" + id + "): radar ligado.";
    }
}
