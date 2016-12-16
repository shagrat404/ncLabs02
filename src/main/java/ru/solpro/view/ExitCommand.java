/*
 * @(#)ExitCommand.java 1.0 11.12.2016
 */

package ru.solpro.view;

import ru.solpro.controller.SystemException;

import java.io.IOException;

/**
 * Команда выхода.
 * @version 1.0 11 декабря 2016
 * @author Protsvetov Danila
 */
public class ExitCommand implements Command {

    /**
     * Выполнение команды.
     * @param args    аргументы
     * @return true - продолжить выполнение, false - завершить выполнение.
     * @throws SystemException  ошибка при работе пользователя с программой.
     * @throws IOException  ошибка ввыода/вывода
     */
    @Override
    public boolean execute(String[] args) throws SystemException, IOException {
        return false;
    }

    /**
     * Распечатать справку по команде.
     */
    @Override
    public void printHelp() {
    }

    /**
     * Имя команды.
     * @return имя команды.
     */
    @Override
    public String getName() {
        return "EXIT";
    }

    /**
     * Описание команды.
     * @return описание команды.
     */
    @Override
    public String getDescription() {
        return "Выход из программы";
    }
}
