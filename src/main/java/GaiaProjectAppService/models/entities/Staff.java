package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Staff {
    private int idStaff;
    private String staffCode;
    private String status;
    private String firstName;
    private String middleName;
    private String lastNamePrimary;
    private String lastNameSecondary;
    private String telephone;
    private String address;
    private String email;
    private double salary;
    private Collection<Botanic> botanicsByIdStaff;
    private Collection<Caretaker> caretakersByIdStaff;
    private Collection<Guide> guidesByIdStaff;
    private Collection<Management> managementsByIdStaff;
    private Collection<PaymentDetail> paymentDetailsByIdStaff;
    private Collection<Security> securitiesByIdStaff;
    private Collection<User> usersByIdStaff;
    private Collection<Veterinary> veterinariesByIdStaff;
    private Collection<Viatic> viaticsByIdStaff;

    @Id
    @Column(name = "id_staff", nullable = false)
    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    @Basic
    @Column(name = "staff_code", nullable = false, length = 12)
    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
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
    @Column(name = "first_name", nullable = false, length = 25)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "middle_name", nullable = true, length = 25)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "lastName_primary", nullable = false, length = 25)
    public String getLastNamePrimary() {
        return lastNamePrimary;
    }

    public void setLastNamePrimary(String lastNamePrimary) {
        this.lastNamePrimary = lastNamePrimary;
    }

    @Basic
    @Column(name = "lastName_secondary", nullable = true, length = 25)
    public String getLastNameSecondary() {
        return lastNameSecondary;
    }

    public void setLastNameSecondary(String lastNameSecondary) {
        this.lastNameSecondary = lastNameSecondary;
    }

    @Basic
    @Column(name = "telephone", nullable = true, length = 30)
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
    @Column(name = "email", nullable = false, length = 25)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "salary", nullable = false, precision = 0)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return idStaff == staff.idStaff &&
                Double.compare(staff.salary, salary) == 0 &&
                Objects.equals(staffCode, staff.staffCode) &&
                Objects.equals(status, staff.status) &&
                Objects.equals(firstName, staff.firstName) &&
                Objects.equals(middleName, staff.middleName) &&
                Objects.equals(lastNamePrimary, staff.lastNamePrimary) &&
                Objects.equals(lastNameSecondary, staff.lastNameSecondary) &&
                Objects.equals(telephone, staff.telephone) &&
                Objects.equals(address, staff.address) &&
                Objects.equals(email, staff.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStaff, staffCode, status, firstName, middleName, lastNamePrimary, lastNameSecondary, telephone, address, email, salary);
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<Botanic> getBotanicsByIdStaff() {
        return botanicsByIdStaff;
    }

    public void setBotanicsByIdStaff(Collection<Botanic> botanicsByIdStaff) {
        this.botanicsByIdStaff = botanicsByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<Caretaker> getCaretakersByIdStaff() {
        return caretakersByIdStaff;
    }

    public void setCaretakersByIdStaff(Collection<Caretaker> caretakersByIdStaff) {
        this.caretakersByIdStaff = caretakersByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<Guide> getGuidesByIdStaff() {
        return guidesByIdStaff;
    }

    public void setGuidesByIdStaff(Collection<Guide> guidesByIdStaff) {
        this.guidesByIdStaff = guidesByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<Management> getManagementsByIdStaff() {
        return managementsByIdStaff;
    }

    public void setManagementsByIdStaff(Collection<Management> managementsByIdStaff) {
        this.managementsByIdStaff = managementsByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<PaymentDetail> getPaymentDetailsByIdStaff() {
        return paymentDetailsByIdStaff;
    }

    public void setPaymentDetailsByIdStaff(Collection<PaymentDetail> paymentDetailsByIdStaff) {
        this.paymentDetailsByIdStaff = paymentDetailsByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<Security> getSecuritiesByIdStaff() {
        return securitiesByIdStaff;
    }

    public void setSecuritiesByIdStaff(Collection<Security> securitiesByIdStaff) {
        this.securitiesByIdStaff = securitiesByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<User> getUsersByIdStaff() {
        return usersByIdStaff;
    }

    public void setUsersByIdStaff(Collection<User> usersByIdStaff) {
        this.usersByIdStaff = usersByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<Veterinary> getVeterinariesByIdStaff() {
        return veterinariesByIdStaff;
    }

    public void setVeterinariesByIdStaff(Collection<Veterinary> veterinariesByIdStaff) {
        this.veterinariesByIdStaff = veterinariesByIdStaff;
    }

    @OneToMany(mappedBy = "staffByIdStaff")
    public Collection<Viatic> getViaticsByIdStaff() {
        return viaticsByIdStaff;
    }

    public void setViaticsByIdStaff(Collection<Viatic> viaticsByIdStaff) {
        this.viaticsByIdStaff = viaticsByIdStaff;
    }
}
