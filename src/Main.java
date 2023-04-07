import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> word = new ArrayList<>(List.of("yes", "no", "yes", "print", "my", "print", "life", "yes"));
        task1(nums);
        task2(nums);
        task3(word);
        task4(word);
    }

    /*
    ## Задание 1

    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль. Код должен работать с любой
    последовательностью и объемом списка чисел.

    В качестве отладочной информации можете использовать список чисел

    ```java
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
    ```
     */
    private static void task1(List<Integer> nums) {
        System.out.println("Task 1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }

        }
        System.out.println("_________________________________________________________________________________________");
    }

    /*
    ## Задание 2

    Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.

    Код должен работать с любой последовательностью и объемом списка чисел.

    В качестве отладочной информации можете использовать список чисел

    ```java
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
    ```
     */
    private static void task2(List<Integer> nums) {
        System.out.println("Task 2");
        Set<Integer> numsSet = new TreeSet<>(nums);
        for (Integer integer : numsSet) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
        System.out.println("_________________________________________________________________________________________");
    }

    /*
    ## Задание 3

        Напишите код, который выводит в консоль все уникальные слова из списка слов,
        в котором могут встречаться дубли.

        В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.

        Код должен работать с любой последовательностью и объемом списка слов.
     */
    private static void task3(List<String> words) {
        System.out.println("Task 3");
        Set<String> numsSet = new TreeSet<>(words);
        for (String word : numsSet) {
            System.out.println(word);
        }
        System.out.println("_________________________________________________________________________________________");
    }

    /*
   ## Задание 4

        Напишите код, который выводит в консоль все количество дублей из списка слов.

        *Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется. В таком случае в консоли
        выведется результат "2", то есть то количество элементов, которые повторяются.*

        В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.

        Код должен работать с любой последовательностью и объемом списка слов.
    */
    private static void task4(List<String> words) {
        System.out.println("Task 4");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        int count = 0;
        for (Integer value : map.values()) {
            if (value > 1) {
                count += value;
            }
        }
        System.out.println(map);
        System.out.println(count);
        System.out.println("_________________________________________________________________________________________");
    }
}