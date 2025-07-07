package ifsc.poo;

import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<NaveEspacial> garagem = new LinkedHashSet<>();

        System.out.println("--- Montando a frota na garagem ---");

        NaveCargueira cargueira = new NaveCargueira();
        NaveSentinela sentinela = new NaveSentinela();
        NaveExploradora exploradora = new NaveExploradora();
        NaveMineradora mineradora = new NaveMineradora();

        garagem.add(cargueira);
        garagem.add(sentinela);
        garagem.add(exploradora);
        garagem.add(mineradora);

        System.out.println("Frota montada com " + garagem.size() + " naves.\n");

        for (NaveEspacial nave : garagem) {
            System.out.println("--- Status da Nave: ID#" + nave.getId() + " ---");
            System.out.println(nave.decolar());

            if (nave instanceof Tripulada t) {
                System.out.println(t.controlarManual());
            }

            if (nave instanceof Autonoma a) {
                System.out.println(a.ativarControleAutomatico());
            }

            if (nave instanceof NaveCargueira c) {
                System.out.println(c.carregar(80));
                System.out.println(c.descarregar(40));
                System.out.println(c.desativarBlindagem());
            }

            if (nave instanceof NaveSentinela s) {
                nave.acelerar();
                System.out.println(s.ligarRadar());
            }

            if (nave instanceof NaveExploradora e) {
                System.out.println(e.ligarHolofotes());
            }

            if (nave instanceof NaveMineradora m) {
                System.out.println(m.minerar(150));
            }

            nave.frear();
            System.out.println(nave.pousar());
            System.out.println();
        }

        System.out.println("--- Simulação finalizada ---");
    }
}
