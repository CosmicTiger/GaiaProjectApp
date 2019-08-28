package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Supply {
    private int idSupply;
    private int idWarehouse;
    private String supplyCode;
    private String status;
    private String name;
    private String typeSupply;
    private Date admissionDate;
    private Date expirationDate;
    private Date departureDate;
    private double cost;
    private Collection<BotanicPlantae> botanicPlantaesByIdSupply;
    private Collection<InventoryDonation> inventoryDonationsByIdSupply;
    private Warehouse warehouseByIdWarehouse;
    private Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdSupply;

    @Id
    @Column(name = "id_supply", nullable = false)
    public int getIdSupply() {
        return idSupply;
    }

    public void setIdSupply(int idSupply) {
        this.idSupply = idSupply;
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
    @Column(name = "supply_code", nullable = true, length = 12)
    public String getSupplyCode() {
        return supplyCode;
    }

    public void setSupplyCode(String supplyCode) {
        this.supplyCode = supplyCode;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 12)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type_supply", nullable = false, length = 50)
    public String getTypeSupply() {
        return typeSupply;
    }

    public void setTypeSupply(String typeSupply) {
        this.typeSupply = typeSupply;
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
    @Column(name = "expiration_date", nullable = true)
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Basic
    @Column(name = "departure_date", nullable = true)
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Basic
    @Column(name = "cost", nullable = false, precision = 0)
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supply supply = (Supply) o;
        return idSupply == supply.idSupply &&
                idWarehouse == supply.idWarehouse &&
                Double.compare(supply.cost, cost) == 0 &&
                Objects.equals(supplyCode, supply.supplyCode) &&
                Objects.equals(status, supply.status) &&
                Objects.equals(name, supply.name) &&
                Objects.equals(typeSupply, supply.typeSupply) &&
                Objects.equals(admissionDate, supply.admissionDate) &&
                Objects.equals(expirationDate, supply.expirationDate) &&
                Objects.equals(departureDate, supply.departureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSupply, idWarehouse, supplyCode, status, name, typeSupply, admissionDate, expirationDate, departureDate, cost);
    }

    @OneToMany(mappedBy = "supplyByIdSupply")
    public Collection<BotanicPlantae> getBotanicPlantaesByIdSupply() {
        return botanicPlantaesByIdSupply;
    }

    public void setBotanicPlantaesByIdSupply(Collection<BotanicPlantae> botanicPlantaesByIdSupply) {
        this.botanicPlantaesByIdSupply = botanicPlantaesByIdSupply;
    }

    @OneToMany(mappedBy = "supplyByIdSupply")
    public Collection<InventoryDonation> getInventoryDonationsByIdSupply() {
        return inventoryDonationsByIdSupply;
    }

    public void setInventoryDonationsByIdSupply(Collection<InventoryDonation> inventoryDonationsByIdSupply) {
        this.inventoryDonationsByIdSupply = inventoryDonationsByIdSupply;
    }

    @ManyToOne
    @JoinColumn(name = "id_warehouse", referencedColumnName = "id_warehouse", nullable = false , insertable = false, updatable = false)
    public Warehouse getWarehouseByIdWarehouse() {
        return warehouseByIdWarehouse;
    }

    public void setWarehouseByIdWarehouse(Warehouse warehouseByIdWarehouse) {
        this.warehouseByIdWarehouse = warehouseByIdWarehouse;
    }

    @OneToMany(mappedBy = "supplyByIdSupply")
    public Collection<VeterinaryAnimalia> getVeterinaryAnimaliasByIdSupply() {
        return veterinaryAnimaliasByIdSupply;
    }

    public void setVeterinaryAnimaliasByIdSupply(Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdSupply) {
        this.veterinaryAnimaliasByIdSupply = veterinaryAnimaliasByIdSupply;
    }
}
