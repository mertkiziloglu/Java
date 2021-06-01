package Java.Core.Concretes;

import Java.Core.Abstractes.ValidatorService;
import Java.Entities.Concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ValidatorService {

    String passwordPattern="^.{6,}$";
    Pattern  pattern=Pattern.compile(passwordPattern);


    @Override
    public boolean checkUser(User user) {
        Matcher matcher=pattern.matcher(user.getPassword());
        if (matcher.matches()==true){
            return true;
        }
        System.out.println("Sifreniz En az 6 karekterden olusmalidir.");
        return false;
    }
}
