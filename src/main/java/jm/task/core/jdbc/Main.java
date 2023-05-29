package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args){
        // ���������� �������� �����
        UserService service = new UserServiceImpl();
// �������� �������
        service.dropUsersTable();
// �������� �������
        service.createUsersTable();
// ���������� users
        service.saveUser("Harry", "Poter", (byte) 21);
        service.saveUser("Larry", "Loter", (byte) 12);
        service.saveUser("Jarry", "Soter", (byte) 127);
        service.saveUser("Barry", "Koter", (byte) 55);
// ������� users � ������
        service.getAllUsers();
        //System.out.println("\n������� �� �������� users:");
        //System.out.println(service.getAllUsers());
// �������� user �� id
        service.removeUserById(1L);
        //System.out.println("\n������� ����� �������� ������� users:");
        //System.out.println(service.getAllUsers());
// �������� �������
        service.cleanUsersTable();
        //System.out.println("\n������� ����� �������� users:");
        //System.out.println(service.getAllUsers());
        Util.close();
    }
}
