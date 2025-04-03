package Predicate;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor boolean.
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "javascript", "Go", "ruby");

        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
}
