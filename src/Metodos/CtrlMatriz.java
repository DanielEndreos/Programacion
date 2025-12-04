package Metodos;
/**
 * Imprime una matriz por consola.
 *
 * <p><strong>Ejemplo:</strong></p>
 * <pre>
 * headerTabla
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 * </pre>
 */

public final class CtrlMatriz {
    /**
     * Rellena una matriz con valores enteros aleatorios. Permite decidir
     * si el 0 es válido y si los valores pueden repetirse.
     *
     * @param matriz        Matriz destino
     * @param includeZero   Si true, puede generar 0
     * @param maxRandNumb   Valor máximo aleatorio (excluido)
     * @param repetible     Si true, permite números repetidos
     */
    public static void buildToInt(int[][] matriz, boolean includeZero, int maxRandNumb, boolean repetible, String headerTabla){
        int matrizDimension = (matriz.length)*(matriz[0].length);
        int qtyNumbersForRandomize = maxRandNumb;
        int start = includeZero?0:1;

        if (repetible){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = (int)(Math.random()*qtyNumbersForRandomize)+start;
                }
            }
        } else {
            qtyNumbersForRandomize = Math.max(maxRandNumb, matrizDimension);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    int tempNumb;
                    do{
                        tempNumb = (int)(Math.random()*qtyNumbersForRandomize)+start;
                    }while(busquedaValorInt(matriz, tempNumb, i, j));
                    matriz[i][j] = tempNumb;
                }
            }
        }
        displayFromInt(matriz, headerTabla);
    }

    /**
     * Rellena una matriz con valores double aleatorios, con opción
     * a que se repitan o no, y redondeo a un número de decimales.
     *
     * @param matriz        Matriz destino
     * @param includeZero   Si true, puede generar 0.0
     * @param maxRandNumb   Valor máximo aleatorio (excluido)
     * @param repetible     Si true, permite números repetidos
     * @param decimales     Número de decimales a redondear
     */
    public static void buildToDouble(double[][] matriz, boolean includeZero, double maxRandNumb, boolean repetible, int decimales, String headerTabla){
        int matrizDimension = (matriz.length)*(matriz[0].length);
        double qtyNumbersForRandomize = maxRandNumb;
        double redondeo = 1;
        double start = includeZero?0.0:1.0;

        for (int i = 0; i < decimales; i++) {
            redondeo *=10;
        }

        if (repetible){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = Math.round(((Math.random()*qtyNumbersForRandomize)+start)*redondeo)/redondeo;
                }
            }
        } else {
            qtyNumbersForRandomize = Math.max(maxRandNumb, matrizDimension);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    double tempNumb;
                    do{
                        tempNumb = Math.round(((Math.random()*qtyNumbersForRandomize)+start)*redondeo)/redondeo;
                    }while(busquedaValorDouble(matriz, tempNumb, i, j));
                    matriz[i][j] = tempNumb;
                }
            }
        }
        displayFromDouble(matriz, headerTabla);
    }

    public static void displayFromInt(int[][] matriz, String headerTabla){
        Object[][] objMatriz = new Object[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                objMatriz[i][j] = matriz[i][j];
            }
        }
        visualizacion(objMatriz, headerTabla);
    }

    public static void displayFromDouble(double[][] matriz, String headerTabla){
        Object[][] objMatriz = new Object[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                objMatriz[i][j] = matriz[i][j];
            }
        }
        visualizacion(objMatriz, headerTabla);
    }

    public static void displayFromString(String[][] matriz, String headerTabla){
        Object[][] objMatriz = new Object[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                objMatriz[i][j] = matriz[i][j];
            }
        }
        visualizacion(objMatriz, headerTabla);
    }

    private static void visualizacion(Object[][] tipoMatriz, String headerTabla){
        System.out.printf("%s\n", headerTabla);
        for (Object[] fila : tipoMatriz ) {
            for (Object item : fila) {
                System.out.printf("%3s\t", item);
            }
            System.out.println("");
        }
    }

    public static boolean busquedaValorInt(int[][] matriz, int numBusq, int iPtr, int jPtr){
        for (int i = 0; i <= iPtr ; i++) {
            if (i == iPtr){
                for (int j = 0; j < jPtr; j++) {
                    if (numBusq == matriz[i][j]){
                        return true;
                    }
                }
            } else{
                for (int j = 0; j < matriz[0].length; j++) {
                    if (numBusq == matriz[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean busquedaValorDouble(double[][] matriz, double numBusq, int iPtr, int jPtr){
        for (int i = 0; i <= iPtr ; i++) {
            if (i == iPtr){
                for (int j = 0; j < jPtr; j++) {
                    if (numBusq == matriz[i][j]){
                        return true;
                    }
                }
            } else{
                for (int j = 0; j < matriz[0].length; j++) {
                    if (numBusq == matriz[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
