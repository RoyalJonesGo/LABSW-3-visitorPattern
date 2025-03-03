public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price){
        this.promoPrice = price;
        return promo.showAllowance(telcoName, promoPrice);
    }
    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }
    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }
    public void setDataAllowance(int dataAllowance) {
        this.dataAllowance = dataAllowance;
    }
    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
    public String getTelcoName() {
        return telcoName;
    }
    public double getPromoPrice() {
        return promoPrice;
    }
    public int getDataAllowance() {
        return dataAllowance;
    }
    public boolean getUnliCallText() {
        return unliCallText;
    }
}
