package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Zone {
    private int idZone;
    private String zoneCode;
    private String status;
    private String nameZone;
    private String extension;
    private String description;
    private String temperature;
    private String role;
    private Collection<AnimaliaZone> animaliaZonesByIdZone;
    private Collection<ItineraryZone> itineraryZonesByIdZone;
    private Collection<Merchandising> merchandisingsByIdZone;
    private Collection<Security> securitiesByIdZone;
    private Collection<Warehouse> warehousesByIdZone;

    @Id
    @Column(name = "id_zone", nullable = false)
    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    @Basic
    @Column(name = "zone_code", nullable = false, length = 12)
    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
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
    @Column(name = "name_zone", nullable = false, length = 50)
    public String getNameZone() {
        return nameZone;
    }

    public void setNameZone(String nameZone) {
        this.nameZone = nameZone;
    }

    @Basic
    @Column(name = "extension", nullable = false, length = 50)
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 70)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "temperature", nullable = false, length = 50)
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 50)
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
                Objects.equals(status, zone.status) &&
                Objects.equals(nameZone, zone.nameZone) &&
                Objects.equals(extension, zone.extension) &&
                Objects.equals(description, zone.description) &&
                Objects.equals(temperature, zone.temperature) &&
                Objects.equals(role, zone.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZone, zoneCode, status, nameZone, extension, description, temperature, role);
    }

    @OneToMany(mappedBy = "zoneByIdZone")
    public Collection<AnimaliaZone> getAnimaliaZonesByIdZone() {
        return animaliaZonesByIdZone;
    }

    public void setAnimaliaZonesByIdZone(Collection<AnimaliaZone> animaliaZonesByIdZone) {
        this.animaliaZonesByIdZone = animaliaZonesByIdZone;
    }

    @OneToMany(mappedBy = "zoneByIdZone")
    public Collection<ItineraryZone> getItineraryZonesByIdZone() {
        return itineraryZonesByIdZone;
    }

    public void setItineraryZonesByIdZone(Collection<ItineraryZone> itineraryZonesByIdZone) {
        this.itineraryZonesByIdZone = itineraryZonesByIdZone;
    }

    @OneToMany(mappedBy = "zoneByIdMerchandisingZone")
    public Collection<Merchandising> getMerchandisingsByIdZone() {
        return merchandisingsByIdZone;
    }

    public void setMerchandisingsByIdZone(Collection<Merchandising> merchandisingsByIdZone) {
        this.merchandisingsByIdZone = merchandisingsByIdZone;
    }

    @OneToMany(mappedBy = "zoneByIdZone")
    public Collection<Security> getSecuritiesByIdZone() {
        return securitiesByIdZone;
    }

    public void setSecuritiesByIdZone(Collection<Security> securitiesByIdZone) {
        this.securitiesByIdZone = securitiesByIdZone;
    }

    @OneToMany(mappedBy = "zoneByIdZone")
    public Collection<Warehouse> getWarehousesByIdZone() {
        return warehousesByIdZone;
    }

    public void setWarehousesByIdZone(Collection<Warehouse> warehousesByIdZone) {
        this.warehousesByIdZone = warehousesByIdZone;
    }
}
