package Java.DataAccess.Concretes;

import Java.DataAccess.Abstractess.UserDao;
import Java.Entities.Concretes.User;

import java.util.ArrayList;

public class UserDaoManager implements UserDao {

   public ArrayList<User> users=new ArrayList<User>();
    @Override
    public void add(User user) {
        users.add(user);
        System.out.println(user +" adli kuulanici eklendi.");
    }

    @Override
    public void delete(User user) {

        users.remove(user);
        System.out.println(user +" adli kuulanici silindi.");
    }

    @Override
    public void login(String mail, String password) {
        System.out.println("Kullanici girisi dogru..");

    }
}
