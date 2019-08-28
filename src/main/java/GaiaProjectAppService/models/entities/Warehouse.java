package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

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

    public int getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public int getIdManagement() {
        return idManagement;
    }

    public void setIdManagement(int idManagement) {
        this.idManagement = idManagement;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

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

    public Collection<Merchandising> getMerchandisingsByIdWarehouse() {
        return merchandisingsByIdWarehouse;
    }

    public void setMerchandisingsByIdWarehouse(Collection<Merchandising> merchandisingsByIdWarehouse) {
        this.merchandisingsByIdWarehouse = merchandisingsByIdWarehouse;
    }

    public Collection<Sale> getSalesByIdWarehouse() {
        return salesByIdWarehouse;
    }

    public void setSalesByIdWarehouse(Collection<Sale> salesByIdWarehouse) {
        this.salesByIdWarehouse = salesByIdWarehouse;
    }

    public Collection<Supply> getSuppliesByIdWarehouse() {
        return suppliesByIdWarehouse;
    }

    public void setSuppliesByIdWarehouse(Collection<Supply> suppliesByIdWarehouse) {
        this.suppliesByIdWarehouse = suppliesByIdWarehouse;
    }

    public Management getManagementByIdManagement() {
        return managementByIdManagement;
    }

    public void setManagementByIdManagement(Management managementByIdManagement) {
        this.managementByIdManagement = managementByIdManagement;
    }

    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }
}
