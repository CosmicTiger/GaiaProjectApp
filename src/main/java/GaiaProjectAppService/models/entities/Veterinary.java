package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Veterinary {
    private int idVeterinary;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdVeterinary;

    public int getIdVeterinary() {
        return idVeterinary;
    }

    public void setIdVeterinary(int idVeterinary) {
        this.idVeterinary = idVeterinary;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }

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

    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }

    public Shift getShiftByIdShift() {
        return shiftByIdShift;
    }

    public void setShiftByIdShift(Shift shiftByIdShift) {
        this.shiftByIdShift = shiftByIdShift;
    }

    public Collection<VeterinaryAnimalia> getVeterinaryAnimaliasByIdVeterinary() {
        return veterinaryAnimaliasByIdVeterinary;
    }

    public void setVeterinaryAnimaliasByIdVeterinary(Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdVeterinary) {
        this.veterinaryAnimaliasByIdVeterinary = veterinaryAnimaliasByIdVeterinary;
    }
}
