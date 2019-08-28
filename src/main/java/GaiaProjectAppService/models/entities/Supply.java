package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Supply {
    private int idSupply;
    private int idWarehouse;
    private String warehouseCode;
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

    public int getIdSupply() {
        return idSupply;
    }

    public void setIdSupply(int idSupply) {
        this.idSupply = idSupply;
    }

    public int getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeSupply() {
        return typeSupply;
    }

    public void setTypeSupply(String typeSupply) {
        this.typeSupply = typeSupply;
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

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

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
                Objects.equals(warehouseCode, supply.warehouseCode) &&
                Objects.equals(name, supply.name) &&
                Objects.equals(typeSupply, supply.typeSupply) &&
                Objects.equals(admissionDate, supply.admissionDate) &&
                Objects.equals(expirationDate, supply.expirationDate) &&
                Objects.equals(departureDate, supply.departureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSupply, idWarehouse, warehouseCode, name, typeSupply, admissionDate, expirationDate, departureDate, cost);
    }

    public Collection<BotanicPlantae> getBotanicPlantaesByIdSupply() {
        return botanicPlantaesByIdSupply;
    }

    public void setBotanicPlantaesByIdSupply(Collection<BotanicPlantae> botanicPlantaesByIdSupply) {
        this.botanicPlantaesByIdSupply = botanicPlantaesByIdSupply;
    }

    public Collection<InventoryDonation> getInventoryDonationsByIdSupply() {
        return inventoryDonationsByIdSupply;
    }

    public void setInventoryDonationsByIdSupply(Collection<InventoryDonation> inventoryDonationsByIdSupply) {
        this.inventoryDonationsByIdSupply = inventoryDonationsByIdSupply;
    }

    public Warehouse getWarehouseByIdWarehouse() {
        return warehouseByIdWarehouse;
    }

    public void setWarehouseByIdWarehouse(Warehouse warehouseByIdWarehouse) {
        this.warehouseByIdWarehouse = warehouseByIdWarehouse;
    }

    public Collection<VeterinaryAnimalia> getVeterinaryAnimaliasByIdSupply() {
        return veterinaryAnimaliasByIdSupply;
    }

    public void setVeterinaryAnimaliasByIdSupply(Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdSupply) {
        this.veterinaryAnimaliasByIdSupply = veterinaryAnimaliasByIdSupply;
    }
}
