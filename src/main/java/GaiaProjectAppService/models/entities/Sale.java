package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
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

    @Id
    @Column(name = "id_sale", nullable = false)
    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
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
    @Column(name = "id_warehouse", nullable = false)
    public int getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    @Basic
    @Column(name = "sale_code", nullable = false, length = 12)
    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    @Basic
    @Column(name = "sale_concept", nullable = true, length = 70)
    public String getSaleConcept() {
        return saleConcept;
    }

    public void setSaleConcept(String saleConcept) {
        this.saleConcept = saleConcept;
    }

    @Basic
    @Column(name = "sale_date", nullable = true)
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

    @ManyToOne
    @JoinColumn(name = "id_management", referencedColumnName = "id_management", nullable = false , insertable = false, updatable = false)
    public Management getManagementByIdManagement() {
        return managementByIdManagement;
    }

    public void setManagementByIdManagement(Management managementByIdManagement) {
        this.managementByIdManagement = managementByIdManagement;
    }

    @ManyToOne
    @JoinColumn(name = "id_warehouse", referencedColumnName = "id_warehouse", nullable = false , insertable = false, updatable = false)
    public Warehouse getWarehouseByIdWarehouse() {
        return warehouseByIdWarehouse;
    }

    public void setWarehouseByIdWarehouse(Warehouse warehouseByIdWarehouse) {
        this.warehouseByIdWarehouse = warehouseByIdWarehouse;
    }

    @OneToMany(mappedBy = "saleByIdSale")
    public Collection<SaleDetail> getSaleDetailsByIdSale() {
        return saleDetailsByIdSale;
    }

    public void setSaleDetailsByIdSale(Collection<SaleDetail> saleDetailsByIdSale) {
        this.saleDetailsByIdSale = saleDetailsByIdSale;
    }
}
