package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Viatic {
    private int idViatic;
    private int idStaff;
    private String viaticCode;
    private String concept;
    private Date dateViatic;
    private double amount;
    private Staff staffByIdStaff;

    @Id
    @Column(name = "id_viatic", nullable = false)
    public int getIdViatic() {
        return idViatic;
    }

    public void setIdViatic(int idViatic) {
        this.idViatic = idViatic;
    }

    @Basic
    @Column(name = "id_staff", nullable = false)
    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    @Basic
    @Column(name = "viatic_code", nullable = false, length = 12)
    public String getViaticCode() {
        return viaticCode;
    }

    public void setViaticCode(String viaticCode) {
        this.viaticCode = viaticCode;
    }

    @Basic
    @Column(name = "concept", nullable = false, length = 100)
    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    @Basic
    @Column(name = "date_viatic", nullable = false)
    public Date getDateViatic() {
        return dateViatic;
    }

    public void setDateViatic(Date dateViatic) {
        this.dateViatic = dateViatic;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 0)
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

    @ManyToOne
    @JoinColumn(name = "id_staff", referencedColumnName = "id_staff", nullable = false , insertable = false, updatable = false)
    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }
}
