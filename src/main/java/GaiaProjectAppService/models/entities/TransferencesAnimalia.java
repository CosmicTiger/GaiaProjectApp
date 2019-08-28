package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class TransferencesAnimalia {
    private int idTransferenceAnimalia;
    private int idAnimalia;
    private int idTransferences;
    private Animalia animaliaByIdAnimalia;
    private Transferences transferencesByIdTransferences;

    public int getIdTransferenceAnimalia() {
        return idTransferenceAnimalia;
    }

    public void setIdTransferenceAnimalia(int idTransferenceAnimalia) {
        this.idTransferenceAnimalia = idTransferenceAnimalia;
    }

    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
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
        TransferencesAnimalia that = (TransferencesAnimalia) o;
        return idTransferenceAnimalia == that.idTransferenceAnimalia &&
                idAnimalia == that.idAnimalia &&
                idTransferences == that.idTransferences;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransferenceAnimalia, idAnimalia, idTransferences);
    }

    public Animalia getAnimaliaByIdAnimalia() {
        return animaliaByIdAnimalia;
    }

    public void setAnimaliaByIdAnimalia(Animalia animaliaByIdAnimalia) {
        this.animaliaByIdAnimalia = animaliaByIdAnimalia;
    }

    public Transferences getTransferencesByIdTransferences() {
        return transferencesByIdTransferences;
    }

    public void setTransferencesByIdTransferences(Transferences transferencesByIdTransferences) {
        this.transferencesByIdTransferences = transferencesByIdTransferences;
    }
}
