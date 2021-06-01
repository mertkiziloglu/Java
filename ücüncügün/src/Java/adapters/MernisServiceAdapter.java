package Java.adapters;

import Java.Entity.concreretes.Gamer;
import Java.abstractes.PersonCheckService;

public class MernisServiceAdapter implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Gamer gamer) throws Exception {
      return false;
    }
}
