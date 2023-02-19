
import java.util.Arrays;
import java.util.logging.*;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */

public class task2 {

    private static Logger logger = Logger.getLogger(task2.class.getName());

    public static void main(String[] args) {
        
        int[] mas = { 23, 4, 5, 6, 2, 6, 34 };

        boolean isSorted = false;
        int buf;
        
        while (!isSorted) {
            isSorted = true;
            
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                    logger.log(Level.INFO, String.format("%d <-> %d, %s", mas[i], mas[i+1], Arrays.toString(mas)));
                    
                }      
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}


