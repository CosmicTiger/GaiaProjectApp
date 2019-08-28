package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Guide {
    private int idGuide;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<ItineraryGuide> itineraryGuidesByIdGuide;

    @Id
    @Column(name = "id_guide", nullable = false)
    public int getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(int idGuide) {
        this.idGuide = idGuide;
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
    @Column(name = "description_Role", nullable = false, length = 70)
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

    @ManyToOne
    @JoinColumn(name = "id_staff", referencedColumnName = "id_staff", nullable = false , insertable = false, updatable = false)
    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }

    @ManyToOne
    @JoinColumn(name = "id_shift", referencedColumnName = "id_shift" , insertable = false, updatable = false)
    public Shift getShiftByIdShift() {
        return shiftByIdShift;
    }

    public void setShiftByIdShift(Shift shiftByIdShift) {
        this.shiftByIdShift = shiftByIdShift;
    }

    @OneToMany(mappedBy = "guideByIdGuide")
    public Collection<ItineraryGuide> getItineraryGuidesByIdGuide() {
        return itineraryGuidesByIdGuide;
    }

    public void setItineraryGuidesByIdGuide(Collection<ItineraryGuide> itineraryGuidesByIdGuide) {
        this.itineraryGuidesByIdGuide = itineraryGuidesByIdGuide;
    }
}
