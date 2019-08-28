package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Transferences_Plantae", schema = "GaiaDatabase")
public class TransferencesPlantae {
    private int idTransferencePlantae;
    private int idPlantae;
    private int idTransferences;
    private Plantae plantaeByIdPlantae;
    private Transferences transferencesByIdTransferences;

    @Id
    @Column(name = "id_transference_plantae", nullable = false)
    public int getIdTransferencePlantae() {
        return idTransferencePlantae;
    }

    public void setIdTransferencePlantae(int idTransferencePlantae) {
        this.idTransferencePlantae = idTransferencePlantae;
    }

    @Basic
    @Column(name = "id_plantae", nullable = false)
    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
    }

    @Basic
    @Column(name = "id_transferences", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "id_plantae", referencedColumnName = "id_plantae", nullable = false , insertable = false, updatable = false)
    public Plantae getPlantaeByIdPlantae() {
        return plantaeByIdPlantae;
    }

    public void setPlantaeByIdPlantae(Plantae plantaeByIdPlantae) {
        this.plantaeByIdPlantae = plantaeByIdPlantae;
    }

    @ManyToOne
    @JoinColumn(name = "id_transferences", referencedColumnName = "id_transferences", nullable = false , insertable = false, updatable = false)
    public Transferences getTransferencesByIdTransferences() {
        return transferencesByIdTransferences;
    }

    public void setTransferencesByIdTransferences(Transferences transferencesByIdTransferences) {
        this.transferencesByIdTransferences = transferencesByIdTransferences;
    }
}
