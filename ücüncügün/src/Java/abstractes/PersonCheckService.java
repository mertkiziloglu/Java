package Java.abstractes;

import Java.Entity.concreretes.Gamer;

public interface PersonCheckService {
    boolean checkIfRealPerson(Gamer gamer) throws Exception;

}
