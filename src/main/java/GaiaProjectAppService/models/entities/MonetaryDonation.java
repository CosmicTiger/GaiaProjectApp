package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class MonetaryDonation {
    private int idMonetaryDonation;
    private int idDonation;
    private double amountMoney;
    private Donation donationByIdDonation;

    public int getIdMonetaryDonation() {
        return idMonetaryDonation;
    }

    public void setIdMonetaryDonation(int idMonetaryDonation) {
        this.idMonetaryDonation = idMonetaryDonation;
    }

    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(double amountMoney) {
        this.amountMoney = amountMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonetaryDonation that = (MonetaryDonation) o;
        return idMonetaryDonation == that.idMonetaryDonation &&
                idDonation == that.idDonation &&
                Double.compare(that.amountMoney, amountMoney) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMonetaryDonation, idDonation, amountMoney);
    }

    public Donation getDonationByIdDonation() {
        return donationByIdDonation;
    }

    public void setDonationByIdDonation(Donation donationByIdDonation) {
        this.donationByIdDonation = donationByIdDonation;
    }
}
