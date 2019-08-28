package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Caretaker {
    private int idCaretaker;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<CaretakerAnimalia> caretakerAnimaliasByIdCaretaker;
    private Collection<CaretakerPlantae> caretakerPlantaesByIdCaretaker;

    public int getIdCaretaker() {
        return idCaretaker;
    }

    public void setIdCaretaker(int idCaretaker) {
        this.idCaretaker = idCaretaker;
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
        Caretaker caretaker = (Caretaker) o;
        return idCaretaker == caretaker.idCaretaker &&
                idStaff == caretaker.idStaff &&
                Objects.equals(role, caretaker.role) &&
                Objects.equals(descriptionRole, caretaker.descriptionRole) &&
                Objects.equals(idShift, caretaker.idShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCaretaker, idStaff, role, descriptionRole, idShift);
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

    public Collection<CaretakerAnimalia> getCaretakerAnimaliasByIdCaretaker() {
        return caretakerAnimaliasByIdCaretaker;
    }

    public void setCaretakerAnimaliasByIdCaretaker(Collection<CaretakerAnimalia> caretakerAnimaliasByIdCaretaker) {
        this.caretakerAnimaliasByIdCaretaker = caretakerAnimaliasByIdCaretaker;
    }

    public Collection<CaretakerPlantae> getCaretakerPlantaesByIdCaretaker() {
        return caretakerPlantaesByIdCaretaker;
    }

    public void setCaretakerPlantaesByIdCaretaker(Collection<CaretakerPlantae> caretakerPlantaesByIdCaretaker) {
        this.caretakerPlantaesByIdCaretaker = caretakerPlantaesByIdCaretaker;
    }
}
