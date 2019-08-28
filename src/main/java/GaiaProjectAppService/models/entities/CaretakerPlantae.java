package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Objects;

public class CaretakerPlantae {
    private int idCaretakerPlantae;
    private int idCaretaker;
    private int idPlantae;
    private Date initialDate;
    private Date finalDate;
    private Caretaker caretakerByIdCaretaker;
    private Plantae plantaeByIdPlantae;

    public int getIdCaretakerPlantae() {
        return idCaretakerPlantae;
    }

    public void setIdCaretakerPlantae(int idCaretakerPlantae) {
        this.idCaretakerPlantae = idCaretakerPlantae;
    }

    public int getIdCaretaker() {
        return idCaretaker;
    }

    public void setIdCaretaker(int idCaretaker) {
        this.idCaretaker = idCaretaker;
    }

    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

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

    public Caretaker getCaretakerByIdCaretaker() {
        return caretakerByIdCaretaker;
    }

    public void setCaretakerByIdCaretaker(Caretaker caretakerByIdCaretaker) {
        this.caretakerByIdCaretaker = caretakerByIdCaretaker;
    }

    public Plantae getPlantaeByIdPlantae() {
        return plantaeByIdPlantae;
    }

    public void setPlantaeByIdPlantae(Plantae plantaeByIdPlantae) {
        this.plantaeByIdPlantae = plantaeByIdPlantae;
    }
}
