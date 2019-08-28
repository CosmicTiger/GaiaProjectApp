package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class AnimaliaZone {
    private int idAnimaliaZone;
    private int idAnimalia;
    private int idZone;
    private Animalia animaliaByIdAnimalia;
    private Zone zoneByIdZone;

    public int getIdAnimaliaZone() {
        return idAnimaliaZone;
    }

    public void setIdAnimaliaZone(int idAnimaliaZone) {
        this.idAnimaliaZone = idAnimaliaZone;
    }

    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
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
        AnimaliaZone that = (AnimaliaZone) o;
        return idAnimaliaZone == that.idAnimaliaZone &&
                idAnimalia == that.idAnimalia &&
                idZone == that.idZone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimaliaZone, idAnimalia, idZone);
    }

    public Animalia getAnimaliaByIdAnimalia() {
        return animaliaByIdAnimalia;
    }

    public void setAnimaliaByIdAnimalia(Animalia animaliaByIdAnimalia) {
        this.animaliaByIdAnimalia = animaliaByIdAnimalia;
    }

    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }
}
