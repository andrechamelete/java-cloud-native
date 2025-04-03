package Consumer;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna valor.
 * É utilziada principalmente para realizar ações ou efeitos colaterais nos elementos do Strem sem modificar ou retornar um valor.
 */

public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream().filter(n -> n% 2 ==0).forEach(System.out::println);
    }
}