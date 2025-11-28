// src/main/java/com/example/App.java
package com.example;

/**
 * Простейшее Java-приложение, которое демонстрирует бизнес-метод greet()
 * и точку входа main(). Этот класс попадёт в исполняемый JAR.
 */
public class App {

  /**
   * Точка входа. При запуске через `java -jar` будет выполнен метод main().
   * результат работы бизнес-метода greet().
   *
   */
  public static void main(String[] args) {
    System.out.println(greet("World"));
  }

  /**
   * Бизнес-метод: формирует приветствие.
   *
   */
  public static String greet(String name) {
    // Здесь могла бы быть любая логика — валидация, обработка и т.п.
    return "Hello, " + name + "!";
  }

  public static String reverse(String str) {
    if (str == null) {
      return null;
    }
    return new StringBuilder(str).reverse().toString();
  }

  public static String formatName(String name) {
    if (name == null || name.trim().isEmpty()) {
      return name;
    }

    String trimmedName = name.trim();

    // Если строка состоит из одного символа
    if (trimmedName.length() == 1) {
      return trimmedName.toUpperCase();
    }

    // Первая буква - заглавная, остальные - строчные
    return trimmedName.substring(0, 1).toUpperCase() +
            trimmedName.substring(1).toLowerCase();
  }
}
