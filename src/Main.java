import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
    task3("Добро, пожаловать, на, курс, по, JAVA");
    }
    static void task0(){
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) System.out.println("Доброе утро, " + name);
        else if (hour < 18) System.out.println("Добрый день, " + name);
        else if (hour < 23) System.out.println("Добрый вечер, " + name);
        else System.out.println("Доброй ночи, " + name);

        scanner.close();

    }

    static void task1(){
//        Дан массив двоичных чисел
//        [1,1,0,1,1,1] вывести мах единиц
        int[] array = {1,0,1,0,0,1,1,1};
        int count = 0;
        int max0nes = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1) count++;
            if (array[i] == 0 || i == array.length-1){
                if (count > max0nes) max0nes = count;
                count = 0;
            }
        }
        System.out.println(max0nes);

    }

//    Дан массив [3,2,2,3] и число val = 3
    static void task2(){
        int[] nums = {2,2,3,3,1,4,2,6,8,4,4};
        int val = 2;
        int[] temp =  new int[nums.length];
        Arrays.fill(temp, val);

        for (int i = 0, j = 0; i < nums.length; i++ ){
            if (nums[i] != val){
                temp[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(temp));

    }

//    Дана фраза "Добро, пожаловать, на, курс, по, JAVA"
//    Переставьте символы.
static void task3(String str){
    //        Текст задачи:
//        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
    str = str.toLowerCase();
    String[] arr = str.split(" ");
    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
    }
}

    static void task4(double a, double b){
//        <aside>
//📔 **Текст задачи:**
//
//        Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//
//        Пример 1: а = 3, b = 2, ответ: 9
//
//        Пример 2: а = 2, b = -2, ответ: 0.25
//
//        Пример 3: а = 3, b = 0, ответ: 1
//
//                </aside>
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result = result * a;
        }

        result = (b > 0 ? result : 1/result );
        System.out.println(result);
    }

    }



