package Lesson4;

import java.util.HashMap;
import java.util.Map;

public class DZ4 {

        public static void main(String[] args) {
            task1();
            task2();
        }

        private static void task1() {
            Map<String, Integer> hm = new HashMap<>();
            String[] words = {
                    "Телефон", "Заяц", "Кот",
                    "Зонт", "Небо", "Трава",
                    "Вода", "Автомобиль", "Море",
                    "Остров", "Кот", "Телефон",
                    "Вода", "Небо", "Трава",
                    "Автомобиль", "Море", "Остров", "Кот"
            };

            for (int i = 0; i < words.length; i++) {
                if (hm.containsKey(words[i]))
                    hm.put(words[i], hm.get(words[i]) + 1);
                else
                    hm.put(words[i], 1);
            }
            System.out.println(hm);
        }

        private static void task2() {
            Directory directory = new Directory();

            directory.add("Иванов", "8937123321");
            directory.add("Иванов", "8927155326");
            directory.add("Котова", "8903155552");
            directory.add("Сидорова", "8373455672");
            directory.add("Иванов", "89273034597");
            directory.add("Сидорова", "89452979316");
            directory.add("Попов", "89098054634");
            directory.add("Максимов", "89174697325");
            directory.add("Попов", "89274567327");

            System.out.println(directory.get("Иванов"));
            System.out.println(directory.get("Сидорова"));
            System.out.println(directory.get("Котова"));
            System.out.println(directory.get("Попов"));
            System.out.println(directory.get("Максимов"));
        }

    }
