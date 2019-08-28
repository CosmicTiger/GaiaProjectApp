package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Guide {
    private int idGuide;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<ItineraryGuide> itineraryGuidesByIdGuide;

    public int getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(int idGuide) {
        this.idGuide = idGuide;
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
        Guide guide = (Guide) o;
        return idGuide == guide.idGuide &&
                idStaff == guide.idStaff &&
                Objects.equals(role, guide.role) &&
                Objects.equals(descriptionRole, guide.descriptionRole) &&
                Objects.equals(idShift, guide.idShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGuide, idStaff, role, descriptionRole, idShift);
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

    public Collection<ItineraryGuide> getItineraryGuidesByIdGuide() {
        return itineraryGuidesByIdGuide;
    }

    public void setItineraryGuidesByIdGuide(Collection<ItineraryGuide> itineraryGuidesByIdGuide) {
        this.itineraryGuidesByIdGuide = itineraryGuidesByIdGuide;
    }
}
