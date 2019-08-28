package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Merchandising {
    private int idMerchandising;
    private int idWarehouse;
    private int idMerchandisingZone;
    private Date admissionDate;
    private Date expirationDate;
    private Warehouse warehouseByIdWarehouse;
    private Zone zoneByIdMerchandisingZone;
    private Collection<SaleDetail> saleDetailsByIdMerchandising;

    @Id
    @Column(name = "id_merchandising", nullable = false)
    public int getIdMerchandising() {
        return idMerchandising;
    }

    public void setIdMerchandising(int idMerchandising) {
        this.idMerchandising = idMerchandising;
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
    @Column(name = "id_merchandising_zone", nullable = false)
    public int getIdMerchandisingZone() {
        return idMerchandisingZone;
    }

    public void setIdMerchandisingZone(int idMerchandisingZone) {
        this.idMerchandisingZone = idMerchandisingZone;
    }

    @Basic
    @Column(name = "admission_date", nullable = false)
    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Basic
    @Column(name = "expiration_date", nullable = false)
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merchandising that = (Merchandising) o;
        return idMerchandising == that.idMerchandising &&
                idWarehouse == that.idWarehouse &&
                idMerchandisingZone == that.idMerchandisingZone &&
                Objects.equals(admissionDate, that.admissionDate) &&
                Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMerchandising, idWarehouse, idMerchandisingZone, admissionDate, expirationDate);
    }

    @ManyToOne
    @JoinColumn(name = "id_warehouse", referencedColumnName = "id_warehouse", nullable = false , insertable = false, updatable = false)
    public Warehouse getWarehouseByIdWarehouse() {
        return warehouseByIdWarehouse;
    }

    public void setWarehouseByIdWarehouse(Warehouse warehouseByIdWarehouse) {
        this.warehouseByIdWarehouse = warehouseByIdWarehouse;
    }

    @ManyToOne
    @JoinColumn(name = "id_merchandising_zone", referencedColumnName = "id_zone", nullable = false , insertable = false, updatable = false)
    public Zone getZoneByIdMerchandisingZone() {
        return zoneByIdMerchandisingZone;
    }

    public void setZoneByIdMerchandisingZone(Zone zoneByIdMerchandisingZone) {
        this.zoneByIdMerchandisingZone = zoneByIdMerchandisingZone;
    }

    @OneToMany(mappedBy = "merchandisingByIdMerchandising")
    public Collection<SaleDetail> getSaleDetailsByIdMerchandising() {
        return saleDetailsByIdMerchandising;
    }

    public void setSaleDetailsByIdMerchandising(Collection<SaleDetail> saleDetailsByIdMerchandising) {
        this.saleDetailsByIdMerchandising = saleDetailsByIdMerchandising;
    }
}
