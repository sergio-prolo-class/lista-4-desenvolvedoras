package ifsc.poo;

public class NaveSentinela extends NaveEspacial implements Autonoma {

    private boolean radar;

    public NaveSentinela() {
        // Regras 3 e 4: Define velocidade 10 e 0 tripulantes para esta nave.
        super(10, 0);
        this.radar = false;
    }

    // Método obrigatório da interface Autonoma.
    @Override
    public String ativarControleAutomatico() {
        // Forma simples de juntar texto e o ID da nave.
        return "NaveSentinela (ID#" + this.id + "): controle automático ativado.";
    }

    // Método que só a NaveSentinela tem.
    public String ligarRadar() {
        // Regra 6: Não pode ligar radar em alta velocidade.
        if (this.velocidadeAtual > (this.velocidadeMaxima * 0.9)) {
            return "NaveSentinela (ID#" + this.id + "): Impossível ligar radar em alta velocidade.";
        } else {
            this.radar = true;
            return "NaveSentinela (ID#" + this.id + "): Radar ligado.";
        }
    }

    // Sobrescrevendo o método da classe mãe para dar uma mensagem específica.
    @Override
    public String decolar() {
        return "NaveSentinela (ID#" + this.id + "): decolando.";
    }
}