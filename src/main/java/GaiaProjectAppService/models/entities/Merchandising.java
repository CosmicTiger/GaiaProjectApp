package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Merchandising {
    private int idMerchandising;
    private int idWarehouse;
    private int idMerchandisingZone;
    private Date admissionDate;
    private Date expirationDate;
    private Warehouse warehouseByIdWarehouse;
    private Zone zoneByIdMerchandisingZone;
    private Collection<SaleDetail> saleDetailsByIdMerchandising;

    public int getIdMerchandising() {
        return idMerchandising;
    }

    public void setIdMerchandising(int idMerchandising) {
        this.idMerchandising = idMerchandising;
    }

    public int getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public int getIdMerchandisingZone() {
        return idMerchandisingZone;
    }

    public void setIdMerchandisingZone(int idMerchandisingZone) {
        this.idMerchandisingZone = idMerchandisingZone;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

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

    public Warehouse getWarehouseByIdWarehouse() {
        return warehouseByIdWarehouse;
    }

    public void setWarehouseByIdWarehouse(Warehouse warehouseByIdWarehouse) {
        this.warehouseByIdWarehouse = warehouseByIdWarehouse;
    }

    public Zone getZoneByIdMerchandisingZone() {
        return zoneByIdMerchandisingZone;
    }

    public void setZoneByIdMerchandisingZone(Zone zoneByIdMerchandisingZone) {
        this.zoneByIdMerchandisingZone = zoneByIdMerchandisingZone;
    }

    public Collection<SaleDetail> getSaleDetailsByIdMerchandising() {
        return saleDetailsByIdMerchandising;
    }

    public void setSaleDetailsByIdMerchandising(Collection<SaleDetail> saleDetailsByIdMerchandising) {
        this.saleDetailsByIdMerchandising = saleDetailsByIdMerchandising;
    }
}
