package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args){
        // реализуйте алгоритм здесь
        UserService service = new UserServiceImpl();
// удаление таблицы
        service.dropUsersTable();
// создание таблицы
        service.createUsersTable();
// добавление users
        service.saveUser("Harry", "Poter", (byte) 21);
        service.saveUser("Larry", "Loter", (byte) 12);
        service.saveUser("Jarry", "Soter", (byte) 127);
        service.saveUser("Barry", "Koter", (byte) 55);
// таблица users в список
        service.getAllUsers();
        //System.out.println("\nТаблица до очищения users:");
        //System.out.println(service.getAllUsers());
// удаление user по id
        service.removeUserById(1L);
        //System.out.println("\nТаблица после удаления первого users:");
        //System.out.println(service.getAllUsers());
// очищение таблицы
        service.cleanUsersTable();
        //System.out.println("\nТаблица после очищения users:");
        //System.out.println(service.getAllUsers());
        Util.close();
    }
}
