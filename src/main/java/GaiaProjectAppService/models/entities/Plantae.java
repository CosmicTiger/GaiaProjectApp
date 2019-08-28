package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Plantae {
    private int idPlantae;
    private int idSpecie;
    private String description;
    private String origin;
    private String status;
    private Collection<BotanicPlantae> botanicPlantaesByIdPlantae;
    private Collection<CaretakerPlantae> caretakerPlantaesByIdPlantae;
    private Specie specieByIdSpecie;
    private Collection<TransferencesPlantae> transferencesPlantaesByIdPlantae;

    @Id
    @Column(name = "id_plantae", nullable = false)
    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
    }

    @Basic
    @Column(name = "id_specie", nullable = false)

    public int getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(int idSpecie) {
        this.idSpecie = idSpecie;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 90)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "origin", nullable = false, length = 60)
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 50)
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

    @OneToMany(mappedBy = "plantaeByIdPlantae")
    public Collection<BotanicPlantae> getBotanicPlantaesByIdPlantae() {
        return botanicPlantaesByIdPlantae;
    }

    public void setBotanicPlantaesByIdPlantae(Collection<BotanicPlantae> botanicPlantaesByIdPlantae) {
        this.botanicPlantaesByIdPlantae = botanicPlantaesByIdPlantae;
    }

    @OneToMany(mappedBy = "plantaeByIdPlantae")
    public Collection<CaretakerPlantae> getCaretakerPlantaesByIdPlantae() {
        return caretakerPlantaesByIdPlantae;
    }

    public void setCaretakerPlantaesByIdPlantae(Collection<CaretakerPlantae> caretakerPlantaesByIdPlantae) {
        this.caretakerPlantaesByIdPlantae = caretakerPlantaesByIdPlantae;
    }

    @ManyToOne
    @JoinColumn(name = "id_specie", referencedColumnName = "id_specie", nullable = false , insertable = false, updatable = false)
    public Specie getSpecieByIdSpecie() {
        return specieByIdSpecie;
    }

    public void setSpecieByIdSpecie(Specie specieByIdSpecie) {
        this.specieByIdSpecie = specieByIdSpecie;
    }

    @OneToMany(mappedBy = "plantaeByIdPlantae")
    public Collection<TransferencesPlantae> getTransferencesPlantaesByIdPlantae() {
        return transferencesPlantaesByIdPlantae;
    }

    public void setTransferencesPlantaesByIdPlantae(Collection<TransferencesPlantae> transferencesPlantaesByIdPlantae) {
        this.transferencesPlantaesByIdPlantae = transferencesPlantaesByIdPlantae;
    }
}
