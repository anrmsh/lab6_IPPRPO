// src/test/java/com/example/AppTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Модульный тест для бизнес-метода greet(). Запускается Surefire-плагином Maven.
 * Результаты тестов будут собраны Jenkins и показаны в отчёте JUnit.
 */
class AppTest {

    /**
     * Базовый тест: проверяем, что greet("World") возвращает ожидаемое значение.
     * В реальном проекте добавьте больше тестов (пограничные случаи, null, длинные строки).
     */
    @Test
    void testGreet() {
        assertEquals("Hello, World!", App.greet("World"));
    }

    @Test
    void testReverse() {
        assertEquals("cba", App.reverse("abc"));
        assertEquals("", App.reverse(""));
        assertEquals("a", App.reverse("a"));
        assertEquals("racecar", App.reverse("racecar"));
        assertNull(App.reverse(null));
    }


}
