package ru.innopolis.stc12.first.test;

public class Parent {
    static String parentString = "Значение родительской статической переменной";

    static {
        System.out.println();
        System.out.println("Родительский блок инициализации (статический). Статическая переменная уже проинициализирована: " + parentString);
    }

    String parentNonStaticString = "Значение родительской переменной не статической";

    {
        System.out.println();
        System.out.println("Родительский блок инициализации (не статический). Не статическая переменная уже проинициализирована: " + parentNonStaticString);
    }

    Parent() {
        System.out.println();
        System.out.println("А теперь конструктор родительского класса. Он может работать со всеми значениями, потому что последний");
    }
}
