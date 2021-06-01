package Java.Core.Concretes;

import Java.Core.Abstractes.ValidatorService;
import Java.Entities.Concretes.User;

public class NameValitator implements ValidatorService {
    @Override
    public boolean checkUser(User user) {
      if (user.getFirstName().length()>=2 && user.getLastName().length()>=2){
          return true;
      }
        System.out.println("isim ve soyisim en az iki karekterden olsumalidir.");
        return false;
    }
}
