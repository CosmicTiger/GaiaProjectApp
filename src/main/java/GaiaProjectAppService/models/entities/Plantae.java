package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Plantae {
    private int idPlantae;
    private int idSpecie;
    private String description;
    private String origin;
    private String status;
    private Collection<BotanicPlantae> botanicPlantaesByIdPlantae;
    private Collection<CaretakerPlantae> caretakerPlantaesByIdPlantae;
    private Specie specieByIdSpecie;
    private Collection<PlantaeZone> plantaeZonesByIdPlantae;
    private Collection<TransferencesPlantae> transferencesPlantaesByIdPlantae;

    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
    }

    public int getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(int idSpecie) {
        this.idSpecie = idSpecie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plantae plantae = (Plantae) o;
        return idPlantae == plantae.idPlantae &&
                idSpecie == plantae.idSpecie &&
                Objects.equals(description, plantae.description) &&
                Objects.equals(origin, plantae.origin) &&
                Objects.equals(status, plantae.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlantae, idSpecie, description, origin, status);
    }

    public Collection<BotanicPlantae> getBotanicPlantaesByIdPlantae() {
        return botanicPlantaesByIdPlantae;
    }

    public void setBotanicPlantaesByIdPlantae(Collection<BotanicPlantae> botanicPlantaesByIdPlantae) {
        this.botanicPlantaesByIdPlantae = botanicPlantaesByIdPlantae;
    }

    public Collection<CaretakerPlantae> getCaretakerPlantaesByIdPlantae() {
        return caretakerPlantaesByIdPlantae;
    }

    public void setCaretakerPlantaesByIdPlantae(Collection<CaretakerPlantae> caretakerPlantaesByIdPlantae) {
        this.caretakerPlantaesByIdPlantae = caretakerPlantaesByIdPlantae;
    }

    public Specie getSpecieByIdSpecie() {
        return specieByIdSpecie;
    }

    public void setSpecieByIdSpecie(Specie specieByIdSpecie) {
        this.specieByIdSpecie = specieByIdSpecie;
    }

    public Collection<PlantaeZone> getPlantaeZonesByIdPlantae() {
        return plantaeZonesByIdPlantae;
    }

    public void setPlantaeZonesByIdPlantae(Collection<PlantaeZone> plantaeZonesByIdPlantae) {
        this.plantaeZonesByIdPlantae = plantaeZonesByIdPlantae;
    }

    public Collection<TransferencesPlantae> getTransferencesPlantaesByIdPlantae() {
        return transferencesPlantaesByIdPlantae;
    }

    public void setTransferencesPlantaesByIdPlantae(Collection<TransferencesPlantae> transferencesPlantaesByIdPlantae) {
        this.transferencesPlantaesByIdPlantae = transferencesPlantaesByIdPlantae;
    }
}
