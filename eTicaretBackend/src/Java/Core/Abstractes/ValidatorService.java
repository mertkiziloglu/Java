package Java.Core.Abstractes;

import Java.Entities.Concretes.User;

public interface ValidatorService {
    boolean checkUser(User user);
}
