import java.util.Arrays;

public class Resultado {
    private int[] marcador = new int[]{0, 0, 0, 0, 0, 0};
    private Object[] puntuadores = new Object[]{new Object(), new Object(), new Object(), new Object(), new Object(), new Object()};
    public int getMarcador(int numero) {
        return marcador[numero];
    }

    public void incrementarPuntuacion(int numero) {
        synchronized (puntuadores[numero]) {
            marcador[numero]++;
        }
    }
    private int total(){
        return Arrays.stream(marcador).sum();

    }
    @Override
    public String toString() {
        return String.format("Resultados:\n" +
                        "\t1: %d\n" +
                        "\t2: %d\n" +
                        "\t3: %d\n" +
                        "\t4: %d\n" +
                        "\t5: %d\n" +
                        "\t6: %d\n" +
                        "Total de la suma: %d\n",
                getMarcador(0), getMarcador(1),
                getMarcador(2), getMarcador(3),
                getMarcador(4), (getMarcador(5)),total());
    }
}