package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Zone {
    private int idZone;
    private String zoneCode;
    private String nameZone;
    private String extension;
    private String description;
    private String wheater;
    private String role;
    private Collection<AnimaliaZone> animaliaZonesByIdZone;
    private Collection<ItineraryZone> itineraryZonesByIdZone;
    private Collection<Merchandising> merchandisingsByIdZone;
    private Collection<PlantaeZone> plantaeZonesByIdZone;
    private Collection<Security> securitiesByIdZone;
    private Collection<Warehouse> warehousesByIdZone;

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getNameZone() {
        return nameZone;
    }

    public void setNameZone(String nameZone) {
        this.nameZone = nameZone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWheater() {
        return wheater;
    }

    public void setWheater(String wheater) {
        this.wheater = wheater;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zone zone = (Zone) o;
        return idZone == zone.idZone &&
                Objects.equals(zoneCode, zone.zoneCode) &&
                Objects.equals(nameZone, zone.nameZone) &&
                Objects.equals(extension, zone.extension) &&
                Objects.equals(description, zone.description) &&
                Objects.equals(wheater, zone.wheater) &&
                Objects.equals(role, zone.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZone, zoneCode, nameZone, extension, description, wheater, role);
    }

    public Collection<AnimaliaZone> getAnimaliaZonesByIdZone() {
        return animaliaZonesByIdZone;
    }

    public void setAnimaliaZonesByIdZone(Collection<AnimaliaZone> animaliaZonesByIdZone) {
        this.animaliaZonesByIdZone = animaliaZonesByIdZone;
    }

    public Collection<ItineraryZone> getItineraryZonesByIdZone() {
        return itineraryZonesByIdZone;
    }

    public void setItineraryZonesByIdZone(Collection<ItineraryZone> itineraryZonesByIdZone) {
        this.itineraryZonesByIdZone = itineraryZonesByIdZone;
    }

    public Collection<Merchandising> getMerchandisingsByIdZone() {
        return merchandisingsByIdZone;
    }

    public void setMerchandisingsByIdZone(Collection<Merchandising> merchandisingsByIdZone) {
        this.merchandisingsByIdZone = merchandisingsByIdZone;
    }

    public Collection<PlantaeZone> getPlantaeZonesByIdZone() {
        return plantaeZonesByIdZone;
    }

    public void setPlantaeZonesByIdZone(Collection<PlantaeZone> plantaeZonesByIdZone) {
        this.plantaeZonesByIdZone = plantaeZonesByIdZone;
    }

    public Collection<Security> getSecuritiesByIdZone() {
        return securitiesByIdZone;
    }

    public void setSecuritiesByIdZone(Collection<Security> securitiesByIdZone) {
        this.securitiesByIdZone = securitiesByIdZone;
    }

    public Collection<Warehouse> getWarehousesByIdZone() {
        return warehousesByIdZone;
    }

    public void setWarehousesByIdZone(Collection<Warehouse> warehousesByIdZone) {
        this.warehousesByIdZone = warehousesByIdZone;
    }
}
