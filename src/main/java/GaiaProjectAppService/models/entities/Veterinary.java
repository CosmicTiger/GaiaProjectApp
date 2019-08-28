package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Veterinary {
    private int idVeterinary;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdVeterinary;

    @Id
    @Column(name = "id_veterinary", nullable = false)
    public int getIdVeterinary() {
        return idVeterinary;
    }

    public void setIdVeterinary(int idVeterinary) {
        this.idVeterinary = idVeterinary;
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
    @Column(name = "role", nullable = false, length = 60)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "description_role", nullable = false, length = 70)
    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }

    @Basic
    @Column(name = "id_shift", nullable = true)
    public Integer getIdShift() {
        return idShift;
    }

    public void setIdShift(Integer idShift) {
        this.idShift = idShift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veterinary that = (Veterinary) o;
        return idVeterinary == that.idVeterinary &&
                idStaff == that.idStaff &&
                Objects.equals(role, that.role) &&
                Objects.equals(descriptionRole, that.descriptionRole) &&
                Objects.equals(idShift, that.idShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVeterinary, idStaff, role, descriptionRole, idShift);
    }

    @ManyToOne
    @JoinColumn(name = "id_staff", referencedColumnName = "id_staff", nullable = false , insertable = false, updatable = false)
    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }

    @ManyToOne
    @JoinColumn(name = "id_shift", referencedColumnName = "id_shift", insertable = false, updatable = false)
    public Shift getShiftByIdShift() {
        return shiftByIdShift;
    }

    public void setShiftByIdShift(Shift shiftByIdShift) {
        this.shiftByIdShift = shiftByIdShift;
    }

    @OneToMany(mappedBy = "veterinaryByIdVeterinary")
    public Collection<VeterinaryAnimalia> getVeterinaryAnimaliasByIdVeterinary() {
        return veterinaryAnimaliasByIdVeterinary;
    }

    public void setVeterinaryAnimaliasByIdVeterinary(Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdVeterinary) {
        this.veterinaryAnimaliasByIdVeterinary = veterinaryAnimaliasByIdVeterinary;
    }
}
