package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Objects;

public class CaretakerAnimalia {
    private int idCaretakerAnimalia;
    private int idAnimalia;
    private int idCaretaker;
    private Date initialDate;
    private Date finalDate;
    private Animalia animaliaByIdAnimalia;
    private Caretaker caretakerByIdCaretaker;

    public int getIdCaretakerAnimalia() {
        return idCaretakerAnimalia;
    }

    public void setIdCaretakerAnimalia(int idCaretakerAnimalia) {
        this.idCaretakerAnimalia = idCaretakerAnimalia;
    }

    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
    }

    public int getIdCaretaker() {
        return idCaretaker;
    }

    public void setIdCaretaker(int idCaretaker) {
        this.idCaretaker = idCaretaker;
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

    public Animalia getAnimaliaByIdAnimalia() {
        return animaliaByIdAnimalia;
    }

    public void setAnimaliaByIdAnimalia(Animalia animaliaByIdAnimalia) {
        this.animaliaByIdAnimalia = animaliaByIdAnimalia;
    }

    public Caretaker getCaretakerByIdCaretaker() {
        return caretakerByIdCaretaker;
    }

    public void setCaretakerByIdCaretaker(Caretaker caretakerByIdCaretaker) {
        this.caretakerByIdCaretaker = caretakerByIdCaretaker;
    }
}
