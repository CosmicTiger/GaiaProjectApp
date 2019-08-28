package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Monetary_Donation", schema = "GaiaDatabase", catalog = "")
public class MonetaryDonation {
    private int idMonetaryDonation;
    private int idDonation;
    private double amountMoney;
    private Donation donationByIdDonation;

    @Id
    @Column(name = "id_monetary_donation", nullable = false)
    public int getIdMonetaryDonation() {
        return idMonetaryDonation;
    }

    public void setIdMonetaryDonation(int idMonetaryDonation) {
        this.idMonetaryDonation = idMonetaryDonation;
    }

    @Basic
    @Column(name = "id_donation", nullable = false)
    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    @Basic
    @Column(name = "amount_money", nullable = false, precision = 0)
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

    @ManyToOne
    @JoinColumn(name = "id_donation", referencedColumnName = "id_donation", nullable = false , insertable = false, updatable = false)
    public Donation getDonationByIdDonation() {
        return donationByIdDonation;
    }

    public void setDonationByIdDonation(Donation donationByIdDonation) {
        this.donationByIdDonation = donationByIdDonation;
    }
}
