/*
Создать новый проект. Написать метод, который принимает список
чисел и возвращает минимальное число из списка чисел.
В main продемонстрировать работу этого метода. Закоммитить,
затем запушить эту з-чу в отдельный репозиторий. Скинуть ссылку
на этот репозиторий в чат.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MinFromArrayList {

    static int getMin () {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        int min = numbers.get (0);
        for (Integer k: numbers) {
              if (k < min)
                  min = k;
        }
        System.out.println(numbers);
        return min;
    }

    public static void main(String[] args) {
        System.out.println(getMin());
    }
}
