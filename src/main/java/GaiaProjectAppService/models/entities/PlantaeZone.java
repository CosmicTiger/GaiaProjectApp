package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class PlantaeZone {
    private int idPlantaeZone;
    private int idPlantae;
    private int idZone;
    private Plantae plantaeByIdPlantae;
    private Zone zoneByIdZone;

    public int getIdPlantaeZone() {
        return idPlantaeZone;
    }

    public void setIdPlantaeZone(int idPlantaeZone) {
        this.idPlantaeZone = idPlantaeZone;
    }

    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantaeZone that = (PlantaeZone) o;
        return idPlantaeZone == that.idPlantaeZone &&
                idPlantae == that.idPlantae &&
                idZone == that.idZone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlantaeZone, idPlantae, idZone);
    }

    public Plantae getPlantaeByIdPlantae() {
        return plantaeByIdPlantae;
    }

    public void setPlantaeByIdPlantae(Plantae plantaeByIdPlantae) {
        this.plantaeByIdPlantae = plantaeByIdPlantae;
    }

    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }
}
