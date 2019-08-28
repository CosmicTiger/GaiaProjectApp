package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Security {
    private int idSecurity;
    private int idStaff;
    private Integer idZone;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Zone zoneByIdZone;

    @Id
    @Column(name = "id_security", nullable = false)
    public int getIdSecurity() {
        return idSecurity;
    }

    public void setIdSecurity(int idSecurity) {
        this.idSecurity = idSecurity;
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
    @Column(name = "id_zone", nullable = true)
    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    @Basic
    @Column(name = "role", nullable = true, length = 60)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "description_role", nullable = true, length = 70)
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
        Security security = (Security) o;
        return idSecurity == security.idSecurity &&
                idStaff == security.idStaff &&
                Objects.equals(idZone, security.idZone) &&
                Objects.equals(role, security.role) &&
                Objects.equals(descriptionRole, security.descriptionRole) &&
                Objects.equals(idShift, security.idShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSecurity, idStaff, idZone, role, descriptionRole, idShift);
    }

    @ManyToOne
    @JoinColumn(name = "id_staff", referencedColumnName = "id_staff", nullable = false, insertable = false, updatable = false)
    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }

    @ManyToOne
    @JoinColumn(name = "id_zone", referencedColumnName = "id_zone", insertable = false, updatable = false)
    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }
}
