package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

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

    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    public int getIdAssociation() {
        return idAssociation;
    }

    public void setIdAssociation(int idAssociation) {
        this.idAssociation = idAssociation;
    }

    public String getDonationCode() {
        return donationCode;
    }

    public void setDonationCode(String donationCode) {
        this.donationCode = donationCode;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

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

    public Association getAssociationByIdAssociation() {
        return associationByIdAssociation;
    }

    public void setAssociationByIdAssociation(Association associationByIdAssociation) {
        this.associationByIdAssociation = associationByIdAssociation;
    }

    public Collection<InventoryDonation> getInventoryDonationsByIdDonation() {
        return inventoryDonationsByIdDonation;
    }

    public void setInventoryDonationsByIdDonation(Collection<InventoryDonation> inventoryDonationsByIdDonation) {
        this.inventoryDonationsByIdDonation = inventoryDonationsByIdDonation;
    }

    public Collection<MonetaryDonation> getMonetaryDonationsByIdDonation() {
        return monetaryDonationsByIdDonation;
    }

    public void setMonetaryDonationsByIdDonation(Collection<MonetaryDonation> monetaryDonationsByIdDonation) {
        this.monetaryDonationsByIdDonation = monetaryDonationsByIdDonation;
    }

    public Collection<ProgramDonation> getProgramDonationsByIdDonation() {
        return programDonationsByIdDonation;
    }

    public void setProgramDonationsByIdDonation(Collection<ProgramDonation> programDonationsByIdDonation) {
        this.programDonationsByIdDonation = programDonationsByIdDonation;
    }
}
