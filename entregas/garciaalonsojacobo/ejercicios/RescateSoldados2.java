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
        final int SOLDADOS = 1;
        final int TURNOS = 20;
        boolean seguirJugando = true;
        int contadorTurnos = 0;
        colocarSoldados(superficie, SOLDADOS);
        boolean quedanSoldados = true;
        do {
            mapearSuperficie(superficie);
            int[] cordenadas = preguntarCordenadas(superficie);
            despejarSuperfice(superficie, cordenadas);
            contadorTurnos++;
            quedanSoldados = quedanPorRescatar(superficie);
            seguirJugando = contadorTurnos < TURNOS && quedanSoldados;

        } while (seguirJugando);
        
        if (!quedanSoldados) {
            System.out.println("¡MISIÓN COMPLETADA! Soldados rescatados = "+ SOLDADOS);
        } else {
            System.out.println("MISIÓN FALLIDA. Se acabaron los turnos 💀");
        }

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
        int[] coordenada = null;
        boolean tieneCoordenada = false;
        do {
            System.out.print("Cordenada y?");
            y = scanner.nextInt();

            System.out.print("Cordenada x?");
            x = scanner.nextInt();
            if (x == 666) {
                mostrarMapaRevelado(superficie);
            } else {

                coordenada = new int[] { y, x };
                tieneCoordenada = cordenadaValida(superficie, coordenada);
            }

        } while (!tieneCoordenada);
        return coordenada;
    }

    private static boolean cordenadaValida(int[][] superficie, int[] coordenada) {
        int y = coordenada[0];
        int x = coordenada[1];
        if (y < 0 || y >= superficie.length || x >= superficie[0].length || x < 0) {
            System.out.println("CORDENADAS INCORRECTAS");
            return false;
        }
        return true;

    }

    private static void colocarSoldados(int[][] superficie, int soldados) {
        int soldadosColocados = 0;
        do {
            int y = (int) (Math.random() * superficie[0].length);
            int x = (int) (Math.random() * superficie.length);
            if (superficie[y][x] != -2) {
                superficie[y][x] = -2;
                soldadosColocados++;
            }

        } while (soldadosColocados < soldados);

    }

    private static void mapearSuperficie(int[][] superficie) {
        System.out.println("   0  1  2  3  4  5  6  7 ");
        System.out.println("--+----------------------");
        for (int y = 0; y < superficie.length; y++) {
            System.out.print(y + "|");

            for (int x = 0; x < superficie[y].length; x++) {
                int tile = superficie[y][x];
                System.out.print(mapear(tile));
            }
            System.out.println();
        }

    }

    static boolean quedanPorRescatar(int[][] superficie) {
        for (int y = 0; y < superficie.length; y++) {
            for (int x = 0; x < superficie[y].length; x++) {
                if (superficie[y][x] == -2) {
                    return true;
                }

            }
        }
        return false;
    }

    private static String mapear(int nºmatriz) {
        final String TILES[] = { " ? ", "~~~", "\\O/" };
        return nºmatriz < 0 ? TILES[0] : TILES[nºmatriz];
    }

    static void mostrarMapaRevelado(int[][] superficie) {
        System.out.println("    0  1  2  3  4  5  6  7 ");
        System.out.println("--+------------------------");
        for (int y = 0; y < superficie.length; y++) {
            System.out.print(y + "|");
            for (int x = 0; x < superficie[y].length; x++) {
                System.out.printf("%3d", superficie[y][x]);
            }
            System.out.println();
        }
    }
}