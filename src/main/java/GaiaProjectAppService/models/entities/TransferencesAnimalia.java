package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Transferences_Animalia", schema = "GaiaDatabase", catalog = "")
public class TransferencesAnimalia {
    private int idTransferenceAnimalia;
    private int idAnimalia;
    private int idTransferences;
    private Animalia animaliaByIdAnimalia;
    private Transferences transferencesByIdTransferences;

    @Id
    @Column(name = "id_transference_animalia", nullable = false)
    public int getIdTransferenceAnimalia() {
        return idTransferenceAnimalia;
    }

    public void setIdTransferenceAnimalia(int idTransferenceAnimalia) {
        this.idTransferenceAnimalia = idTransferenceAnimalia;
    }

    @Basic
    @Column(name = "id_animalia", nullable = false)
    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
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
        TransferencesAnimalia that = (TransferencesAnimalia) o;
        return idTransferenceAnimalia == that.idTransferenceAnimalia &&
                idAnimalia == that.idAnimalia &&
                idTransferences == that.idTransferences;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransferenceAnimalia, idAnimalia, idTransferences);
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
    @JoinColumn(name = "id_transferences", referencedColumnName = "id_transferences", nullable = false , insertable = false, updatable = false)
    public Transferences getTransferencesByIdTransferences() {
        return transferencesByIdTransferences;
    }

    public void setTransferencesByIdTransferences(Transferences transferencesByIdTransferences) {
        this.transferencesByIdTransferences = transferencesByIdTransferences;
    }
}
