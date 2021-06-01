package Java.DataAccess.Abstractess;

import Java.Entities.Concretes.User;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void login(String mail,String password);
}
