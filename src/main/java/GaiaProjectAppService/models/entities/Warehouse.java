package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Warehouse {
    private int idWarehouse;
    private int idManagement;
    private int idZone;
    private int capacity;
    private double size;
    private Collection<Merchandising> merchandisingsByIdWarehouse;
    private Collection<Sale> salesByIdWarehouse;
    private Collection<Supply> suppliesByIdWarehouse;
    private Management managementByIdManagement;
    private Zone zoneByIdZone;

    @Id
    @Column(name = "id_warehouse", nullable = false)
    public int getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    @Basic
    @Column(name = "id_management", nullable = false)
    public int getIdManagement() {
        return idManagement;
    }

    public void setIdManagement(int idManagement) {
        this.idManagement = idManagement;
    }

    @Basic
    @Column(name = "id_zone", nullable = false)
    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    @Basic
    @Column(name = "capacity", nullable = false)
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "size", nullable = false, precision = 0)
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return idWarehouse == warehouse.idWarehouse &&
                idManagement == warehouse.idManagement &&
                idZone == warehouse.idZone &&
                capacity == warehouse.capacity &&
                Double.compare(warehouse.size, size) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWarehouse, idManagement, idZone, capacity, size);
    }

    @OneToMany(mappedBy = "warehouseByIdWarehouse")
    public Collection<Merchandising> getMerchandisingsByIdWarehouse() {
        return merchandisingsByIdWarehouse;
    }

    public void setMerchandisingsByIdWarehouse(Collection<Merchandising> merchandisingsByIdWarehouse) {
        this.merchandisingsByIdWarehouse = merchandisingsByIdWarehouse;
    }

    @OneToMany(mappedBy = "warehouseByIdWarehouse")
    public Collection<Sale> getSalesByIdWarehouse() {
        return salesByIdWarehouse;
    }

    public void setSalesByIdWarehouse(Collection<Sale> salesByIdWarehouse) {
        this.salesByIdWarehouse = salesByIdWarehouse;
    }

    @OneToMany(mappedBy = "warehouseByIdWarehouse")
    public Collection<Supply> getSuppliesByIdWarehouse() {
        return suppliesByIdWarehouse;
    }

    public void setSuppliesByIdWarehouse(Collection<Supply> suppliesByIdWarehouse) {
        this.suppliesByIdWarehouse = suppliesByIdWarehouse;
    }

    @ManyToOne
    @JoinColumn(name = "id_management", referencedColumnName = "id_management", nullable = false , insertable = false, updatable = false)
    public Management getManagementByIdManagement() {
        return managementByIdManagement;
    }

    public void setManagementByIdManagement(Management managementByIdManagement) {
        this.managementByIdManagement = managementByIdManagement;
    }

    @ManyToOne
    @JoinColumn(name = "id_zone", referencedColumnName = "id_zone", nullable = false , insertable = false, updatable = false)
    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }
}
