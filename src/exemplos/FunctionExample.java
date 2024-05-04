package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) { 
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;
        // Dobrar o número 5 usando a função dobrar
        int numeroDobrado = dobrar.apply(5);
        // Imprimir o número dobrado
        System.out.println("O dobro de 5 é: " + numeroDobrado);

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra
        // lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
