import java.util.Scanner;

public class RescateSoldados2 {
    public static void main(String[] args) {

        int[][] superficie = {
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },

        };
        final int SOLDADOS = 16;
        final int TURNOS = 20;
        boolean seguirJugando = true;
        int contadorTurnos = 0;
        colocarSoldados(superficie, SOLDADOS);
        do {
            mapearSuperficie(superficie);
            int[] cordenadas = preguntarCordenadas(superficie);
            despejarSuperfice(superficie, cordenadas);
            contadorTurnos++;
            seguirJugando = contadorTurnos < TURNOS;
        } while (seguirJugando);

    }

    private static void despejarSuperfice(int[][] superficie, int[] cordenadas) {
       
        int escenario_y = cordenadas[0];
        int escenario_x = cordenadas[1];

        superficie[escenario_y][escenario_x] = superficie[escenario_y][escenario_x] < 0
                ? superficie[escenario_y][escenario_x] * -1
                : superficie[escenario_y][escenario_x];
    }

    private static int[] preguntarCordenadas(int[][] superficie) {
        Scanner scanner = new Scanner(System.in);
        int y;
        int x;
        do {
            System.out.print("Cordenada y?");
            y = scanner.nextInt();

            System.out.print("Cordenada x?");
            x = scanner.nextInt();
            if (y < 0 || y >= superficie.length || x >= superficie[0].length || x < 0) {
                System.out.println("CORDENADAS INCORRECTAS");
            }

        } while (y < 0 || y >= superficie.length || x >= superficie[0].length || x < 0);
        return new int[] { y, x };
    }

    private static void colocarSoldados(int[][] superficie, int SOLDADOS) {
        int soldadosColocados = 0;
        do {
            int x = (int) (Math.random() * superficie[0].length);
            int y = (int) (Math.random() * superficie.length);
            if (superficie[x][y] != -2) {
                superficie[x][y] = -2;
            }
            soldadosColocados++;
        } while (soldadosColocados < SOLDADOS);

    }

    private static void mapearSuperficie(int[][] superficie) {
        System.out.println("   0  1  2  3  4  5  6  7 ");
        System.out.println("--+----------------------");
        for (int y = 0; y < superficie.length; y++) {
            System.out.print(y + "|");

            for (int x = 0; x < superficie[y].length; x++) {
                System.out.print(mapear(superficie[y][x]));
            }
            System.out.println();
        }

    }

    private static String mapear(int nºmatriz) {
        final String TILES[] = { " ? ", "~~~", "\\O/" };
        return nºmatriz < 0 ? TILES[0] : TILES[nºmatriz];
    }

}