package Supplier;

import java.util.List;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, mundo!").limit(3).toList();

        listaSaudacoes.forEach(System.out::println);
        /* é o mesmo que:
        listaSaudacoes.forEach(s -> System.out.println(s));
         */
    }
}
