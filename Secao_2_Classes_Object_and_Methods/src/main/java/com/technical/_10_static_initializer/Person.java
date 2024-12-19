package com.technical._10_static_initializer;

public class Person {
    // Declaração de uma variável estática que será inicializada pelo método estático `initNums`.
    public static int[] nums = initNums();

    // Método estático para inicializar a variável estática `nums`.
    // Este método é chamado automaticamente durante o carregamento da classe devido à sua atribuição acima.
    public static int[] initNums() {
        // Cria um array de inteiros com capacidade para 5 elementos.
        nums = new int[5];

        // Atribui valores ao array.
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        // O quinto elemento (`nums[4]`) não é explicitamente atribuído, então será inicializado com o valor padrão (0).

        return nums; // Retorna o array inicializado.
    }

    public static void main(String[] args) {
        // O método `main` está vazio, mas poderia ser usado para verificar ou acessar a variável `nums`.
        // Por exemplo:
        // for (int num : nums) {
        //     System.out.println(num);
        // }
    }
}
