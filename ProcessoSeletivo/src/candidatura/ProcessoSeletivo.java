package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Marcia", "Andre", "Romeno", "Duda", "Joao"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while( continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.printf("Conseguimos contato com %s na %d tentativa! %n", candidato, tentativasRealizadas);
        } else {
            System.out.printf("Não conseguimos contato com o %s %n", candidato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Marcia", "Andre", "Romeno", "Duda", "Joao"};
        System.out.println("Imprimindo lista de aprovados!");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.printf("O candidato de número %d é %s %n", indice+1, candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Andre", "Fernanda", "Ivan", "Romeno", "Joao", "Duda", "Guti", "Tania"};
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou o valor de %.2f %n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado %n", candidato);
                candidatosSelecionados++;
            }
            candidatosAtuais++;
;        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultados dos demais candidatos");
        }
    }
}