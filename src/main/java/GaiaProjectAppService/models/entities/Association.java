package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Association {
    private int idAssociation;
    private String associationCode;
    private String associationName;
    private String concept;
    private String associationType;
    private String objective;
    private String telephone;
    private String address;
    private String email;
    private String country;
    private String province;
    private Collection<Donation> donationsByIdAssociation;

    public int getIdAssociation() {
        return idAssociation;
    }

    public void setIdAssociation(int idAssociation) {
        this.idAssociation = idAssociation;
    }

    public String getAssociationCode() {
        return associationCode;
    }

    public void setAssociationCode(String associationCode) {
        this.associationCode = associationCode;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Association that = (Association) o;
        return idAssociation == that.idAssociation &&
                Objects.equals(associationCode, that.associationCode) &&
                Objects.equals(associationName, that.associationName) &&
                Objects.equals(concept, that.concept) &&
                Objects.equals(associationType, that.associationType) &&
                Objects.equals(objective, that.objective) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(email, that.email) &&
                Objects.equals(country, that.country) &&
                Objects.equals(province, that.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAssociation, associationCode, associationName, concept, associationType, objective, telephone, address, email, country, province);
    }

    public Collection<Donation> getDonationsByIdAssociation() {
        return donationsByIdAssociation;
    }

    public void setDonationsByIdAssociation(Collection<Donation> donationsByIdAssociation) {
        this.donationsByIdAssociation = donationsByIdAssociation;
    }
}
