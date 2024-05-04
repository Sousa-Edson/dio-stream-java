package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // soma dois numeros
        BinaryOperator<Integer> somar = Integer::sum;
        int resultado1 = somar.apply(3, 5);
        System.out.println("A soma dos números é: " + resultado1);
        // soma todos os numeros de um array
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("A soma dos números é: " + resultado);
    }
}
