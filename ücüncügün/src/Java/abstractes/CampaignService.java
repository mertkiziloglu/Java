package Java.abstractes;

import Java.Entity.concreretes.Campaign;

import java.util.List;

public interface CampaignService {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);

    List<Campaign> getAll();
}
