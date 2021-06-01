package Java.abstractes;

import Java.Entity.concreretes.Gamer;

import java.util.List;

public interface GamerService {
    public void add(Gamer gamer);
    public void update(Gamer gamer);
    public void delete(Gamer gamer);

    List<Gamer> getAll();

}
