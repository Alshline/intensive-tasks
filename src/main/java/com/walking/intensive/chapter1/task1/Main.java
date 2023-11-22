package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        for (int age = 0; age < 121; age++) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {

        int integerRemainderOfTen = age % 10;

        if (age < 120 && age > 0) {
            if ((age >= 10 && age <= 20) || integerRemainderOfTen == 0 || integerRemainderOfTen >= 5) {
                return "Вам " + age + " лет.";
            }
            if (integerRemainderOfTen == 1) {
                return "Вам " + age + " год.";
            }
            return "Вам " + age + " года.";
        }
        return "Неверно указан возраст или вы новый номинант в книгу рекордов Гиннеса.";
    }
}