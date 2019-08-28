package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class InventoryDonation {
    private int idInventoryDonation;
    private int idSupply;
    private int idDonation;
    private Supply supplyByIdSupply;
    private Donation donationByIdDonation;

    public int getIdInventoryDonation() {
        return idInventoryDonation;
    }

    public void setIdInventoryDonation(int idInventoryDonation) {
        this.idInventoryDonation = idInventoryDonation;
    }

    public int getIdSupply() {
        return idSupply;
    }

    public void setIdSupply(int idSupply) {
        this.idSupply = idSupply;
    }

    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryDonation that = (InventoryDonation) o;
        return idInventoryDonation == that.idInventoryDonation &&
                idSupply == that.idSupply &&
                idDonation == that.idDonation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInventoryDonation, idSupply, idDonation);
    }

    public Supply getSupplyByIdSupply() {
        return supplyByIdSupply;
    }

    public void setSupplyByIdSupply(Supply supplyByIdSupply) {
        this.supplyByIdSupply = supplyByIdSupply;
    }

    public Donation getDonationByIdDonation() {
        return donationByIdDonation;
    }

    public void setDonationByIdDonation(Donation donationByIdDonation) {
        this.donationByIdDonation = donationByIdDonation;
    }
}
