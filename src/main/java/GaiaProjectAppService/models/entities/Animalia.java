package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Animalia {
    private int idAnimalia;
    private int idSpecie;
    private String description;
    private String origin;
    private String status;
    private Specie specieByIdSpecie;
    private Collection<AnimaliaZone> animaliaZonesByIdAnimalia;
    private Collection<CaretakerAnimalia> caretakerAnimaliasByIdAnimalia;
    private Collection<TransferencesAnimalia> transferencesAnimaliasByIdAnimalia;
    private Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdAnimalia;

    @Id
    @Column(name = "id_animalia", nullable = false)
    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
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
        Animalia animalia = (Animalia) o;
        return idAnimalia == animalia.idAnimalia &&
                idSpecie == animalia.idSpecie &&
                Objects.equals(description, animalia.description) &&
                Objects.equals(origin, animalia.origin) &&
                Objects.equals(status, animalia.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimalia, idSpecie, description, origin, status);
    }

    @ManyToOne
    @JoinColumn(name = "id_specie", referencedColumnName = "id_specie", nullable = false, insertable = false, updatable = false)
    public Specie getSpecieByIdSpecie() {
        return specieByIdSpecie;
    }

    public void setSpecieByIdSpecie(Specie specieByIdSpecie) {
        this.specieByIdSpecie = specieByIdSpecie;
    }

    @OneToMany(mappedBy = "animaliaByIdAnimalia")
    public Collection<AnimaliaZone> getAnimaliaZonesByIdAnimalia() {
        return animaliaZonesByIdAnimalia;
    }

    public void setAnimaliaZonesByIdAnimalia(Collection<AnimaliaZone> animaliaZonesByIdAnimalia) {
        this.animaliaZonesByIdAnimalia = animaliaZonesByIdAnimalia;
    }

    @OneToMany(mappedBy = "animaliaByIdAnimalia")
    public Collection<CaretakerAnimalia> getCaretakerAnimaliasByIdAnimalia() {
        return caretakerAnimaliasByIdAnimalia;
    }

    public void setCaretakerAnimaliasByIdAnimalia(Collection<CaretakerAnimalia> caretakerAnimaliasByIdAnimalia) {
        this.caretakerAnimaliasByIdAnimalia = caretakerAnimaliasByIdAnimalia;
    }

    @OneToMany(mappedBy = "animaliaByIdAnimalia")
    public Collection<TransferencesAnimalia> getTransferencesAnimaliasByIdAnimalia() {
        return transferencesAnimaliasByIdAnimalia;
    }

    public void setTransferencesAnimaliasByIdAnimalia(Collection<TransferencesAnimalia> transferencesAnimaliasByIdAnimalia) {
        this.transferencesAnimaliasByIdAnimalia = transferencesAnimaliasByIdAnimalia;
    }

    @OneToMany(mappedBy = "animaliaByIdAnimalia")
    public Collection<VeterinaryAnimalia> getVeterinaryAnimaliasByIdAnimalia() {
        return veterinaryAnimaliasByIdAnimalia;
    }

    public void setVeterinaryAnimaliasByIdAnimalia(Collection<VeterinaryAnimalia> veterinaryAnimaliasByIdAnimalia) {
        this.veterinaryAnimaliasByIdAnimalia = veterinaryAnimaliasByIdAnimalia;
    }
}
