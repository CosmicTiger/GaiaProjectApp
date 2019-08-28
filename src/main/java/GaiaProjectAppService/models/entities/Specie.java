package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Specie {
    private int idSpecie;
    private String specieCode;
    private String commonName;
    private String cientificName;
    private String status;
    private Collection<Animalia> animaliasByIdSpecie;
    private Collection<Plantae> plantaesByIdSpecie;
    private Collection<Transferences> transferencesByIdSpecie;

    @Id
    @Column(name = "id_specie", nullable = false)
    public int getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(int idSpecie) {
        this.idSpecie = idSpecie;
    }

    @Basic
    @Column(name = "specie_code", nullable = false, length = 12)
    public String getSpecieCode() {
        return specieCode;
    }

    public void setSpecieCode(String specieCode) {
        this.specieCode = specieCode;
    }

    @Basic
    @Column(name = "common_name", nullable = false, length = 50)
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    @Basic
    @Column(name = "cientific_name", nullable = false, length = 60)
    public String getCientificName() {
        return cientificName;
    }

    public void setCientificName(String cientificName) {
        this.cientificName = cientificName;
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
        Specie specie = (Specie) o;
        return idSpecie == specie.idSpecie &&
                Objects.equals(specieCode, specie.specieCode) &&
                Objects.equals(commonName, specie.commonName) &&
                Objects.equals(cientificName, specie.cientificName) &&
                Objects.equals(status, specie.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSpecie, specieCode, commonName, cientificName, status);
    }

    @OneToMany(mappedBy = "specieByIdSpecie")
    public Collection<Animalia> getAnimaliasByIdSpecie() {
        return animaliasByIdSpecie;
    }

    public void setAnimaliasByIdSpecie(Collection<Animalia> animaliasByIdSpecie) {
        this.animaliasByIdSpecie = animaliasByIdSpecie;
    }

    @OneToMany(mappedBy = "specieByIdSpecie")
    public Collection<Plantae> getPlantaesByIdSpecie() {
        return plantaesByIdSpecie;
    }

    public void setPlantaesByIdSpecie(Collection<Plantae> plantaesByIdSpecie) {
        this.plantaesByIdSpecie = plantaesByIdSpecie;
    }

    @OneToMany(mappedBy = "specieByIdSpecie")
    public Collection<Transferences> getTransferencesByIdSpecie() {
        return transferencesByIdSpecie;
    }

    public void setTransferencesByIdSpecie(Collection<Transferences> transferencesByIdSpecie) {
        this.transferencesByIdSpecie = transferencesByIdSpecie;
    }
}
