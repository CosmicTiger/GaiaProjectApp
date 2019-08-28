package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Objects;

public class Viatic {
    private int idViatic;
    private int idStaff;
    private String viaticCode;
    private String concept;
    private Date dateViatic;
    private double amount;
    private Staff staffByIdStaff;

    public int getIdViatic() {
        return idViatic;
    }

    public void setIdViatic(int idViatic) {
        this.idViatic = idViatic;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getViaticCode() {
        return viaticCode;
    }

    public void setViaticCode(String viaticCode) {
        this.viaticCode = viaticCode;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Date getDateViatic() {
        return dateViatic;
    }

    public void setDateViatic(Date dateViatic) {
        this.dateViatic = dateViatic;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viatic viatic = (Viatic) o;
        return idViatic == viatic.idViatic &&
                idStaff == viatic.idStaff &&
                Double.compare(viatic.amount, amount) == 0 &&
                Objects.equals(viaticCode, viatic.viaticCode) &&
                Objects.equals(concept, viatic.concept) &&
                Objects.equals(dateViatic, viatic.dateViatic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idViatic, idStaff, viaticCode, concept, dateViatic, amount);
    }

    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }
}
