package Java.Entity.concreretes;

public class Sale {
    int saleID;
    double salePercent;
    String saleName;

    public Sale() {
    }

    public Sale(int saleID, double salePercent, String saleName) {
        this.saleID = saleID;
        this.salePercent = salePercent;
        this.saleName = saleName;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public double getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(double salePercent) {
        this.salePercent = salePercent;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }
}
