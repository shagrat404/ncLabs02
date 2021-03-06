/*
 * @(#)Command.java 1.0 11.12.2016
 */

package ru.solpro.view;

import java.io.IOException;

/**
 * Интерфейс для команд.
 * @version 1.0 11 декабря 2016
 * @author Protsvetov Danila
 */
public interface Command {

    /**
     * Выполнение команды.
     * @param args    аргументы
     * @return true - продолжить выполнение, false - завершить выполнение.
     * @throws IOException  ошибка ввыода/вывода
     */
    boolean execute(String[] args) throws IOException;

    /**
     * Распечатать справку по команде.
     */
    void printHelp();

    /**
     * Имя команды.
     * @return имя команды.
     */
    String getName();

    /**
     * Описание команды.
     * @return описание команды.
     */
    String getDescription();
}
