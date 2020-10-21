import java.util.Random;

public class Dado implements Runnable {
    Resultado resultado;
    Random random = new Random();

    public Dado(Resultado resultados) {
        this.resultado = resultados;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            resultado.incrementarPuntuacion(random.nextInt(6));
        }
    }

}