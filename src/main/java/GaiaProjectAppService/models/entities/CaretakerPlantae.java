package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Caretaker_Plantae", schema = "GaiaDatabase", catalog = "")
public class CaretakerPlantae {
    private int idCaretakerPlantae;
    private int idCaretaker;
    private int idPlantae;
    private Date initialDate;
    private Date finalDate;
    private Caretaker caretakerByIdCaretaker;
    private Plantae plantaeByIdPlantae;

    @Id
    @Column(name = "id_caretaker_plantae", nullable = false)
    public int getIdCaretakerPlantae() {
        return idCaretakerPlantae;
    }

    public void setIdCaretakerPlantae(int idCaretakerPlantae) {
        this.idCaretakerPlantae = idCaretakerPlantae;
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
    @Column(name = "id_plantae", nullable = false)
    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
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
        CaretakerPlantae that = (CaretakerPlantae) o;
        return idCaretakerPlantae == that.idCaretakerPlantae &&
                idCaretaker == that.idCaretaker &&
                idPlantae == that.idPlantae &&
                Objects.equals(initialDate, that.initialDate) &&
                Objects.equals(finalDate, that.finalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCaretakerPlantae, idCaretaker, idPlantae, initialDate, finalDate);
    }

    @ManyToOne
    @JoinColumn(name = "id_caretaker", referencedColumnName = "id_caretaker", nullable = false , insertable = false, updatable = false)
    public Caretaker getCaretakerByIdCaretaker() {
        return caretakerByIdCaretaker;
    }

    public void setCaretakerByIdCaretaker(Caretaker caretakerByIdCaretaker) {
        this.caretakerByIdCaretaker = caretakerByIdCaretaker;
    }

    @ManyToOne
    @JoinColumn(name = "id_plantae", referencedColumnName = "id_plantae", nullable = false , insertable = false, updatable = false)
    public Plantae getPlantaeByIdPlantae() {
        return plantaeByIdPlantae;
    }

    public void setPlantaeByIdPlantae(Plantae plantaeByIdPlantae) {
        this.plantaeByIdPlantae = plantaeByIdPlantae;
    }
}
