public class GalToLitTable {

    public static void main(String[] args) {
        double gallons, liters;
        int counter, n, d;
        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.5854;
            System.out.println(gallons + " gallon is " + liters + " liters.");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        if ((n % d) == 0 & d != 0)
            System.out.println(d + " is factor of " + n);

        d = 0;
        boolean f = false;

        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is factor of " + n);
        System.out.println("Fin - Prueba 2 division por 0");

/*        if (d != 0 & (n % d) == 0)
            System.out.println(d + " is factor of " + n);
        System.out.println("Fin - Prueba 1 division por 0");
*/
        if (f)
            System.out.println("verdadero");
        System.out.println("Fin - Prueba IF boleeano");
    }

}
