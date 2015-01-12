
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        x = 0;

    }

    /**
     * Imprime todos los múltiplos de 5 comprendidos entre 10 y 95 (ambos
     * extremos no incluidos).
     */
    public void multiplesOfFive()
    {
        int num = 10;
        boolean maxMult = false;
        while (num < 90) {
            num = num + 5;
            System.out.println(num);
            if (num >= 90){
                maxMult = true;
            }
        }
    }
    
    /**
     * Imprime por pantalla la suma de los números comprendidos entre el 0 y el 10 
     * (ambos incluidos) haciendo uso de un bucle `while`.
     */
    public void sumValues()
    {
        int num = 0;
        int suma = 0;
        boolean maxNum = false;
        while (num < 10) {
            num = num + 1;
            suma = num + suma;
            if (num >= 10) {
                maxNum = true;
            }
        }
        System.out.println(suma);
    }
    
    /**
     * Muestra la suma de los valores comprendidos entre dichos parámetros 
     * (ambos incluidos).
     */
    public void sumValuesInterval(int valorA, int valorB)
    {
        int a = valorA;
        int b = valorB;
        int suma = a;
        boolean maxNum = false;
        while (a < b) {
            a = a + 1;
            suma = a + suma;
            if (a >= b) {
                maxNum = true;
            }
        }
        System.out.println(suma);
    }
}
