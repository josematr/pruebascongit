import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int matriz[][] = new int[5][20];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0; // Asigna 0 en lugar de valor
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%6d", matriz[i][j]); // Ajusta el formato según tus preferencias
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        System.out.println("preuba adasdasdasdaspara git");
    }
}

