package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Animalia_Zone", schema = "GaiaDatabase", catalog = "")
public class AnimaliaZone {
    private int idAnimaliaZone;
    private int idAnimalia;
    private int idZone;
    private Animalia animaliaByIdAnimalia;
    private Zone zoneByIdZone;

    @Id
    @Column(name = "id_animalia_zone", nullable = false )
    public int getIdAnimaliaZone() {
        return idAnimaliaZone;
    }

    public void setIdAnimaliaZone(int idAnimaliaZone) {
        this.idAnimaliaZone = idAnimaliaZone;
    }

    @Basic
    @Column(name = "id_animalia", nullable = false )
    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
    }

    @Basic
    @Column(name = "id_zone", nullable = false)
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
        AnimaliaZone that = (AnimaliaZone) o;
        return idAnimaliaZone == that.idAnimaliaZone &&
                idAnimalia == that.idAnimalia &&
                idZone == that.idZone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimaliaZone, idAnimalia, idZone);
    }

    @ManyToOne
    @JoinColumn(name = "id_animalia", referencedColumnName = "id_animalia", nullable = false , insertable = false, updatable = false)
    public Animalia getAnimaliaByIdAnimalia() {
        return animaliaByIdAnimalia;
    }

    public void setAnimaliaByIdAnimalia(Animalia animaliaByIdAnimalia) {
        this.animaliaByIdAnimalia = animaliaByIdAnimalia;
    }

    @ManyToOne
    @JoinColumn(name = "id_zone", referencedColumnName = "id_zone", nullable = false , insertable = false, updatable = false)
    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }
}
