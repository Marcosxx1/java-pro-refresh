package com.technical._5_simple_collections_with_arrays;

import java.util.Arrays;

/**
 * Demonstração de uso de arrays em Java.
 *
 * Arrays são estruturas de dados que armazenam uma coleção de elementos do mesmo tipo.
 * Eles possuem as seguintes características:
 * <p>
 * 1. **Tamanho fixo**: O tamanho do array é definido no momento de sua criação e não pode ser alterado.
 * 2. **Índices baseados em zero**: O primeiro elemento está no índice 0, o segundo no índice 1, e assim por diante.
 * 3. **Homogeneidade**: Todos os elementos em um array devem ser do mesmo tipo.
 * 4. **Acesso rápido**: Elementos podem ser acessados diretamente usando seu índice.
 * <p>
 * Exemplo de declaração e inicialização de um array:
 *   - `String[] array = {"primeiro", "segundo", "terceiro"};`
 * <p>
 * Propriedades importantes:
 *   - `array.length`: Retorna o número de elementos no array.
 *   - `array.getClass().getSimpleName()`: Retorna o tipo da estrutura (ex.: "String[]").
 *   - `Arrays.toString(array)`: Permite exibir o conteúdo do array como uma String.
 */
public class ArrayDemo {

    public static void main(String[] args) {

        // Declaração e inicialização do array
        String[] array = {"primeiro", "segundo", "terceiro"};

        // Exibição de informações do array
        System.out.println("Valores: " + Arrays.toString(array));
        System.out.println("Tamanho: " + array.length);
        System.out.println("Tipo: " + array.getClass().getSimpleName());
    }
}
