package Java.Entity.concreretes;

public class Campaign {
    int campaignId;
    int  campaignTime;
    String campaignName;

    public Campaign() {
    }

    public Campaign(int campaignId, int campaignTime, String campaignName) {
        this.campaignId = campaignId;
        this.campaignTime = campaignTime;
        this.campaignName = campaignName;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public int getCampaignTime() {
        return campaignTime;
    }

    public void setCampaignTime(int campaignTime) {
        this.campaignTime = campaignTime;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
