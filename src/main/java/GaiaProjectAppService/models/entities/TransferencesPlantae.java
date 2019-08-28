package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class TransferencesPlantae {
    private int idTransferencePlantae;
    private int idPlantae;
    private int idTransferences;
    private Plantae plantaeByIdPlantae;
    private Transferences transferencesByIdTransferences;

    public int getIdTransferencePlantae() {
        return idTransferencePlantae;
    }

    public void setIdTransferencePlantae(int idTransferencePlantae) {
        this.idTransferencePlantae = idTransferencePlantae;
    }

    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
    }

    public int getIdTransferences() {
        return idTransferences;
    }

    public void setIdTransferences(int idTransferences) {
        this.idTransferences = idTransferences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferencesPlantae that = (TransferencesPlantae) o;
        return idTransferencePlantae == that.idTransferencePlantae &&
                idPlantae == that.idPlantae &&
                idTransferences == that.idTransferences;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransferencePlantae, idPlantae, idTransferences);
    }

    public Plantae getPlantaeByIdPlantae() {
        return plantaeByIdPlantae;
    }

    public void setPlantaeByIdPlantae(Plantae plantaeByIdPlantae) {
        this.plantaeByIdPlantae = plantaeByIdPlantae;
    }

    public Transferences getTransferencesByIdTransferences() {
        return transferencesByIdTransferences;
    }

    public void setTransferencesByIdTransferences(Transferences transferencesByIdTransferences) {
        this.transferencesByIdTransferences = transferencesByIdTransferences;
    }
}
