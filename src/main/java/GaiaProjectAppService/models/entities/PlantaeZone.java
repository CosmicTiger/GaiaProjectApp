package GaiaProjectAppService.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Plantae_Zone", schema = "GaiaDatabase", catalog = "")
public class PlantaeZone {
    private int idPlantaeZone;

    @Id
    @Column(name = "id_plantae_zone", nullable = false)
    public int getIdPlantaeZone() {
        return idPlantaeZone;
    }

    public void setIdPlantaeZone(int idPlantaeZone) {
        this.idPlantaeZone = idPlantaeZone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantaeZone that = (PlantaeZone) o;
        return idPlantaeZone == that.idPlantaeZone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlantaeZone);
    }
}
