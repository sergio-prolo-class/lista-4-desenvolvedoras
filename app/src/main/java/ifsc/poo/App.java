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

        System.out.println("Frota montada com " + garagem.size() + " naves.");
        System.out.println("\n--- Iniciando simulação individual das naves ---\n");

        for (NaveEspacial nave : garagem) {
            System.out.println("--- Status da Nave: " + nave.toString() + " ---");

            // Uso de polimorfismo: todos objeto que é uma "NaveEspacial" tem o método decolar
            System.out.println(nave.decolar());

            // Usando instanceof para chamar métodos das interfaces
            if (nave instanceof Tripulada) {
                // Converte a referência para o tipo da interface para chamar o método
                Tripulada t = (Tripulada) nave;
                System.out.println(t.controlarManual());
            }

            if (nave instanceof Autonoma) {
                Autonoma a = (Autonoma) nave;
                System.out.println(a.ativarControleAutomatico());
            }

            // Usando instanceof para chamar métodos das classes concretas
            if (nave instanceof NaveCargueira) {
                NaveCargueira c = (NaveCargueira) nave;
                System.out.println(c.carregar(80)); // Testando a regra dos 70%
                System.out.println(c.descarregar(40));
            }

            if (nave instanceof NaveSentinela) {
                NaveSentinela s = (NaveSentinela) nave;
                // Acelera um pouco para testar a regra do radar
                nave.acelerar();
                System.out.println(s.ligarRadar());
            }

            if (nave instanceof NaveExploradora) {
                NaveExploradora e = (NaveExploradora) nave;
                System.out.println(e.ligarHolofotes());
            }

            if (nave instanceof NaveMineradora) {
                NaveMineradora m = (NaveMineradora) nave;
                // A velocidade inicial é 0, então a mineração deve funcionar
                System.out.println(m.minerar(150));
            }

            // Uso de polimorfismo para o método pousar
            System.out.println(nave.pousar());

            System.out.println("--------------------------------------------------\n");
        }

        System.out.println("--- Simulação finalizada ---");
    }
}