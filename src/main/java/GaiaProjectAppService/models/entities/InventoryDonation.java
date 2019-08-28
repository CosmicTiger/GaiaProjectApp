package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Inventory_Donation", schema = "GaiaDatabase", catalog = "")
public class InventoryDonation {
    private int idInventoryDonation;
    private int idSupply;
    private int idDonation;
    private Supply supplyByIdSupply;
    private Donation donationByIdDonation;

    @Id
    @Column(name = "id_inventory_donation", nullable = false)
    public int getIdInventoryDonation() {
        return idInventoryDonation;
    }

    public void setIdInventoryDonation(int idInventoryDonation) {
        this.idInventoryDonation = idInventoryDonation;
    }

    @Basic
    @Column(name = "id_supply", nullable = false)
    public int getIdSupply() {
        return idSupply;
    }

    public void setIdSupply(int idSupply) {
        this.idSupply = idSupply;
    }

    @Basic
    @Column(name = "id_donation", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "id_supply", referencedColumnName = "id_supply", nullable = false , insertable = false, updatable = false)
    public Supply getSupplyByIdSupply() {
        return supplyByIdSupply;
    }

    public void setSupplyByIdSupply(Supply supplyByIdSupply) {
        this.supplyByIdSupply = supplyByIdSupply;
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
