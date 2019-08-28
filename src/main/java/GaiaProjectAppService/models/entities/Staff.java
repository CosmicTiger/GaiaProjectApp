package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Staff {
    private int idStaff;
    private String staffCode;
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

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastNamePrimary() {
        return lastNamePrimary;
    }

    public void setLastNamePrimary(String lastNamePrimary) {
        this.lastNamePrimary = lastNamePrimary;
    }

    public String getLastNameSecondary() {
        return lastNameSecondary;
    }

    public void setLastNameSecondary(String lastNameSecondary) {
        this.lastNameSecondary = lastNameSecondary;
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
        return Objects.hash(idStaff, staffCode, firstName, middleName, lastNamePrimary, lastNameSecondary, telephone, address, email, salary);
    }

    public Collection<Botanic> getBotanicsByIdStaff() {
        return botanicsByIdStaff;
    }

    public void setBotanicsByIdStaff(Collection<Botanic> botanicsByIdStaff) {
        this.botanicsByIdStaff = botanicsByIdStaff;
    }

    public Collection<Caretaker> getCaretakersByIdStaff() {
        return caretakersByIdStaff;
    }

    public void setCaretakersByIdStaff(Collection<Caretaker> caretakersByIdStaff) {
        this.caretakersByIdStaff = caretakersByIdStaff;
    }

    public Collection<Guide> getGuidesByIdStaff() {
        return guidesByIdStaff;
    }

    public void setGuidesByIdStaff(Collection<Guide> guidesByIdStaff) {
        this.guidesByIdStaff = guidesByIdStaff;
    }

    public Collection<Management> getManagementsByIdStaff() {
        return managementsByIdStaff;
    }

    public void setManagementsByIdStaff(Collection<Management> managementsByIdStaff) {
        this.managementsByIdStaff = managementsByIdStaff;
    }

    public Collection<PaymentDetail> getPaymentDetailsByIdStaff() {
        return paymentDetailsByIdStaff;
    }

    public void setPaymentDetailsByIdStaff(Collection<PaymentDetail> paymentDetailsByIdStaff) {
        this.paymentDetailsByIdStaff = paymentDetailsByIdStaff;
    }

    public Collection<Security> getSecuritiesByIdStaff() {
        return securitiesByIdStaff;
    }

    public void setSecuritiesByIdStaff(Collection<Security> securitiesByIdStaff) {
        this.securitiesByIdStaff = securitiesByIdStaff;
    }

    public Collection<User> getUsersByIdStaff() {
        return usersByIdStaff;
    }

    public void setUsersByIdStaff(Collection<User> usersByIdStaff) {
        this.usersByIdStaff = usersByIdStaff;
    }

    public Collection<Veterinary> getVeterinariesByIdStaff() {
        return veterinariesByIdStaff;
    }

    public void setVeterinariesByIdStaff(Collection<Veterinary> veterinariesByIdStaff) {
        this.veterinariesByIdStaff = veterinariesByIdStaff;
    }

    public Collection<Viatic> getViaticsByIdStaff() {
        return viaticsByIdStaff;
    }

    public void setViaticsByIdStaff(Collection<Viatic> viaticsByIdStaff) {
        this.viaticsByIdStaff = viaticsByIdStaff;
    }
}
