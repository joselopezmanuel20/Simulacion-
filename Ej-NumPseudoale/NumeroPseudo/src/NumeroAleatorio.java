import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Generar 10 números pseudoaleatorios uniformes entre 0 y 1
        System.out.println("=== Números pseudoaleatorios (Distribución Uniforme [0,1]) ===");
        double[] numerosUniformes = new double[10];
        for (int i = 0; i < numerosUniformes.length; i++) {
            numerosUniformes[i] = random.nextDouble(); // [0.0, 1.0)
            System.out.printf("%.4f ", numerosUniformes[i]);
        }

        // 2. Generar 10 números pseudoaleatorios con distribución normal
        System.out.println("\n\n=== Números pseudoaleatorios (Distribución Normal media=0, desviación=1) ===");
        double[] numerosNormales = new double[10];
        for (int i = 0; i < numerosNormales.length; i++) {
            numerosNormales[i] = random.nextGaussian(); // Distribución normal
            System.out.printf("%.4f ", numerosNormales[i]);
        }

        // 3. Pequeño histograma textual (para los uniformes)
        System.out.println("\n\n=== Histograma de los números uniformes (0.0 - 1.0) ===");
        int[] frecuencias = new int[10];
        for (double num : numerosUniformes) {
            int indice = (int) (num * 10);
            if (indice == 10) indice = 9; // si justo es 1.0
            frecuencias[indice]++;
        }

        for (int i = 0; i < frecuencias.length; i++) {
            String rango = String.format("%.1f - %.1f", i / 10.0, (i + 1) / 10.0);
            System.out.print(rango + " | ");
            for (int j = 0; j < frecuencias[i]; j++) {
                System.out.print("*"); // barra del histograma
            }
            System.out.println();
        }
    }


}


