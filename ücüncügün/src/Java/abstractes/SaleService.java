package Java.abstractes;

import Java.Entity.concreretes.Sale;

import java.util.List;

public interface SaleService {
    void add(Sale sale);
    void delete(Sale sale);
    void update(Sale sale);

    List<Sale> getAll();

}
