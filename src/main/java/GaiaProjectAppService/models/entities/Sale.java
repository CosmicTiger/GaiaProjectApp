package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Sale {
    private int idSale;
    private int idManagement;
    private int idWarehouse;
    private String saleCode;
    private String saleConcept;
    private Date saleDate;
    private Management managementByIdManagement;
    private Warehouse warehouseByIdWarehouse;
    private Collection<SaleDetail> saleDetailsByIdSale;

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public int getIdManagement() {
        return idManagement;
    }

    public void setIdManagement(int idManagement) {
        this.idManagement = idManagement;
    }

    public int getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public String getSaleConcept() {
        return saleConcept;
    }

    public void setSaleConcept(String saleConcept) {
        this.saleConcept = saleConcept;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return idSale == sale.idSale &&
                idManagement == sale.idManagement &&
                idWarehouse == sale.idWarehouse &&
                Objects.equals(saleCode, sale.saleCode) &&
                Objects.equals(saleConcept, sale.saleConcept) &&
                Objects.equals(saleDate, sale.saleDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSale, idManagement, idWarehouse, saleCode, saleConcept, saleDate);
    }

    public Management getManagementByIdManagement() {
        return managementByIdManagement;
    }

    public void setManagementByIdManagement(Management managementByIdManagement) {
        this.managementByIdManagement = managementByIdManagement;
    }

    public Warehouse getWarehouseByIdWarehouse() {
        return warehouseByIdWarehouse;
    }

    public void setWarehouseByIdWarehouse(Warehouse warehouseByIdWarehouse) {
        this.warehouseByIdWarehouse = warehouseByIdWarehouse;
    }

    public Collection<SaleDetail> getSaleDetailsByIdSale() {
        return saleDetailsByIdSale;
    }

    public void setSaleDetailsByIdSale(Collection<SaleDetail> saleDetailsByIdSale) {
        this.saleDetailsByIdSale = saleDetailsByIdSale;
    }
}
