package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Specie {
    private int idSpecie;
    private String specieCode;
    private String commonName;
    private String cientificName;
    private String status;
    private Collection<Animalia> animaliasByIdSpecie;
    private Collection<Plantae> plantaesByIdSpecie;
    private Collection<Transferences> transferencesByIdSpecie;

    public int getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(int idSpecie) {
        this.idSpecie = idSpecie;
    }

    public String getSpecieCode() {
        return specieCode;
    }

    public void setSpecieCode(String specieCode) {
        this.specieCode = specieCode;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getCientificName() {
        return cientificName;
    }

    public void setCientificName(String cientificName) {
        this.cientificName = cientificName;
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

    public Collection<Animalia> getAnimaliasByIdSpecie() {
        return animaliasByIdSpecie;
    }

    public void setAnimaliasByIdSpecie(Collection<Animalia> animaliasByIdSpecie) {
        this.animaliasByIdSpecie = animaliasByIdSpecie;
    }

    public Collection<Plantae> getPlantaesByIdSpecie() {
        return plantaesByIdSpecie;
    }

    public void setPlantaesByIdSpecie(Collection<Plantae> plantaesByIdSpecie) {
        this.plantaesByIdSpecie = plantaesByIdSpecie;
    }

    public Collection<Transferences> getTransferencesByIdSpecie() {
        return transferencesByIdSpecie;
    }

    public void setTransferencesByIdSpecie(Collection<Transferences> transferencesByIdSpecie) {
        this.transferencesByIdSpecie = transferencesByIdSpecie;
    }
}
