package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Association {
    private int idAssociation;
    private String associationCode;
    private String status;
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

    @Id
    @Column(name = "id_association", nullable = false )
    public int getIdAssociation() {
        return idAssociation;
    }

    public void setIdAssociation(int idAssociation) {
        this.idAssociation = idAssociation;
    }

    @Basic
    @Column(name = "association_code", nullable = false, length = 12)
    public String getAssociationCode() {
        return associationCode;
    }

    public void setAssociationCode(String associationCode) {
        this.associationCode = associationCode;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 12)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "association_name", nullable = false, length = 50)
    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
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
    @Column(name = "association_type", nullable = false, length = 50)
    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    @Basic
    @Column(name = "objective", nullable = false, length = 200)
    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Basic
    @Column(name = "telephone", nullable = false, length = 25)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 30)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "province", nullable = false, length = 30)
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
                Objects.equals(status, that.status) &&
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
        return Objects.hash(idAssociation, associationCode, status, associationName, concept, associationType, objective, telephone, address, email, country, province);
    }

    @OneToMany(mappedBy = "associationByIdAssociation")
    public Collection<Donation> getDonationsByIdAssociation() {
        return donationsByIdAssociation;
    }

    public void setDonationsByIdAssociation(Collection<Donation> donationsByIdAssociation) {
        this.donationsByIdAssociation = donationsByIdAssociation;
    }
}
