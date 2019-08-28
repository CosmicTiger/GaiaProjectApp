package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Caretaker_Animalia", schema = "GaiaDatabase", catalog = "")
public class CaretakerAnimalia {
    private int idCaretakerAnimalia;
    private int idAnimalia;
    private int idCaretaker;
    private Date initialDate;
    private Date finalDate;
    private Animalia animaliaByIdAnimalia;
    private Caretaker caretakerByIdCaretaker;

    @Id
    @Column(name = "id_caretaker_animalia", nullable = false)
    public int getIdCaretakerAnimalia() {
        return idCaretakerAnimalia;
    }

    public void setIdCaretakerAnimalia(int idCaretakerAnimalia) {
        this.idCaretakerAnimalia = idCaretakerAnimalia;
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
    @Column(name = "id_caretaker", nullable = false)
    public int getIdCaretaker() {
        return idCaretaker;
    }

    public void setIdCaretaker(int idCaretaker) {
        this.idCaretaker = idCaretaker;
    }

    @Basic
    @Column(name = "initial_date", nullable = false)
    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    @Basic
    @Column(name = "final_date", nullable = false)
    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaretakerAnimalia that = (CaretakerAnimalia) o;
        return idCaretakerAnimalia == that.idCaretakerAnimalia &&
                idAnimalia == that.idAnimalia &&
                idCaretaker == that.idCaretaker &&
                Objects.equals(initialDate, that.initialDate) &&
                Objects.equals(finalDate, that.finalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCaretakerAnimalia, idAnimalia, idCaretaker, initialDate, finalDate);
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
    @JoinColumn(name = "id_caretaker", referencedColumnName = "id_caretaker", nullable = false , insertable = false, updatable = false)
    public Caretaker getCaretakerByIdCaretaker() {
        return caretakerByIdCaretaker;
    }

    public void setCaretakerByIdCaretaker(Caretaker caretakerByIdCaretaker) {
        this.caretakerByIdCaretaker = caretakerByIdCaretaker;
    }
}
