package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Donation {
    private int idDonation;
    private int idAssociation;
    private String donationCode;
    private String concept;
    private Date dateDonation;
    private Association associationByIdAssociation;
    private Collection<InventoryDonation> inventoryDonationsByIdDonation;
    private Collection<MonetaryDonation> monetaryDonationsByIdDonation;
    private Collection<ProgramDonation> programDonationsByIdDonation;

    @Id
    @Column(name = "id_donation", nullable = false)
    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    @Basic
    @Column(name = "id_association", nullable = false)
    public int getIdAssociation() {
        return idAssociation;
    }

    public void setIdAssociation(int idAssociation) {
        this.idAssociation = idAssociation;
    }

    @Basic
    @Column(name = "donation_code", nullable = false, length = 12)
    public String getDonationCode() {
        return donationCode;
    }

    public void setDonationCode(String donationCode) {
        this.donationCode = donationCode;
    }

    @Basic
    @Column(name = "concept", nullable = false, length = 70)
    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    @Basic
    @Column(name = "date_donation", nullable = false)
    public Date getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(Date dateDonation) {
        this.dateDonation = dateDonation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return idDonation == donation.idDonation &&
                idAssociation == donation.idAssociation &&
                Objects.equals(donationCode, donation.donationCode) &&
                Objects.equals(concept, donation.concept) &&
                Objects.equals(dateDonation, donation.dateDonation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDonation, idAssociation, donationCode, concept, dateDonation);
    }

    @ManyToOne
    @JoinColumn(name = "id_association", referencedColumnName = "id_association", nullable = false , insertable = false, updatable = false)
    public Association getAssociationByIdAssociation() {
        return associationByIdAssociation;
    }

    public void setAssociationByIdAssociation(Association associationByIdAssociation) {
        this.associationByIdAssociation = associationByIdAssociation;
    }

    @OneToMany(mappedBy = "donationByIdDonation")
    public Collection<InventoryDonation> getInventoryDonationsByIdDonation() {
        return inventoryDonationsByIdDonation;
    }

    public void setInventoryDonationsByIdDonation(Collection<InventoryDonation> inventoryDonationsByIdDonation) {
        this.inventoryDonationsByIdDonation = inventoryDonationsByIdDonation;
    }

    @OneToMany(mappedBy = "donationByIdDonation")
    public Collection<MonetaryDonation> getMonetaryDonationsByIdDonation() {
        return monetaryDonationsByIdDonation;
    }

    public void setMonetaryDonationsByIdDonation(Collection<MonetaryDonation> monetaryDonationsByIdDonation) {
        this.monetaryDonationsByIdDonation = monetaryDonationsByIdDonation;
    }

    @OneToMany(mappedBy = "donationByIdDonation")
    public Collection<ProgramDonation> getProgramDonationsByIdDonation() {
        return programDonationsByIdDonation;
    }

    public void setProgramDonationsByIdDonation(Collection<ProgramDonation> programDonationsByIdDonation) {
        this.programDonationsByIdDonation = programDonationsByIdDonation;
    }
}
