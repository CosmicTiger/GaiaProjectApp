package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class Security {
    private int idSecurity;
    private int idStaff;
    private Integer idZone;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Zone zoneByIdZone;

    public int getIdSecurity() {
        return idSecurity;
    }

    public void setIdSecurity(int idSecurity) {
        this.idSecurity = idSecurity;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
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

    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }

    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }
}
