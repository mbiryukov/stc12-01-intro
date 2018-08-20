package ru.innopolis.stc12.first.test;

public class Child extends Parent {
    static String childString = "Значение дочерней статической переменной";

    static {
        System.out.println();

        System.out.println("Дочерний блок инициализации. Статическая переменная (дочерняя) уже проинициализирована: " + childString);
        System.out.println("Дочерний блок инициализации. Статическая переменная (родительская) тоже проинициализирована: " + parentString);
    }

    String childNonStaticString = "Значение дочерней переменной не статической";

    {
        System.out.println();

        System.out.println("Дочерний блок инициализации (не статический). Обычная переменная (дочерняя) уже проинициализирована: " + childNonStaticString);
        System.out.println("Дочерний блок инициализации (не статический). Обычная переменная (родительская) тоже проинициализирована: " + parentNonStaticString);
    }

    public Child() {
        System.out.println();
        System.out.println("А теперь конструктор дочернего класса. Он может работать со всеми значениями, потому что самый последний");
    }
}
