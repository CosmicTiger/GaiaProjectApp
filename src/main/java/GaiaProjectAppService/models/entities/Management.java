package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Management {
    private int idManagement;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<Sale> salesByIdManagement;
    private Collection<Warehouse> warehousesByIdManagement;

    public int getIdManagement() {
        return idManagement;
    }

    public void setIdManagement(int idManagement) {
        this.idManagement = idManagement;
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
        Management that = (Management) o;
        return idManagement == that.idManagement &&
                idStaff == that.idStaff &&
                Objects.equals(role, that.role) &&
                Objects.equals(descriptionRole, that.descriptionRole) &&
                Objects.equals(idShift, that.idShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idManagement, idStaff, role, descriptionRole, idShift);
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

    public Collection<Sale> getSalesByIdManagement() {
        return salesByIdManagement;
    }

    public void setSalesByIdManagement(Collection<Sale> salesByIdManagement) {
        this.salesByIdManagement = salesByIdManagement;
    }

    public Collection<Warehouse> getWarehousesByIdManagement() {
        return warehousesByIdManagement;
    }

    public void setWarehousesByIdManagement(Collection<Warehouse> warehousesByIdManagement) {
        this.warehousesByIdManagement = warehousesByIdManagement;
    }
}
