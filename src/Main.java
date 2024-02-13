import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача1
        System.out.println("Задача_1");
        //1_массив
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        // второй вариант) но в уроке написано так не надо делать )
        int[] a = new int[]{1, 2, 3};
        //2_массив
        double[] b = {1.57, 7.654, 9.986};
        //3_массив
        int[] massiv = new int[7];
        for (int index = 0; index < massiv.length; index++) {
            massiv[index] = index * 2;
        }
        //Задача2
        System.out.println("Задача_2");
        //1_массив_вывод
        for (int index = 0; index < i.length; index++) {
            if (index == i.length - 1) {
                System.out.println(i[index]);
                break;
            }
            System.out.print(i[index] + ", ");
        }
        //2_массив_вывод
        for (int index = 0; index < b.length; index++) {
            if (index == b.length - 1) {
                System.out.println(b[index]);
                break;
            }
            System.out.print(b[index] + ", ");
        }
        //3_массив_вывод
        for (int index = 0; index < massiv.length; index++) {
            if (index == massiv.length - 1) {
                System.out.println(massiv[index]);
                break;
            }
            System.out.print(massiv[index] + ", ");
        }
        //Задача3
        System.out.println("Задача_3");
        //1_массив_вывод
        for (int index = i.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(i[index]);
                break;
            }
            System.out.print(i[index] + ", ");
        }
        //2_массив_вывод
        for (int index = b.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(b[index]);
                break;
            }
            System.out.print(b[index] + ", ");
        }
        //3_массив_вывод
        for (int index = massiv.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(massiv[index]);
                break;
            }
            System.out.print(massiv[index] + ", ");
        }
        //Задача4
        System.out.println("Задача_4");
        for (int index = 0; index < i.length; index++) {
            if (i[index] % 2 != 0) {
                i[index] += 1;
            }
        }
        System.out.println(Arrays.toString(i));
    }
}