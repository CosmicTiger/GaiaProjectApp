package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

public class Shift {
    private int idShift;
    private Date initialDate;
    private Date finalDate;
    private String shiftName;
    private Time hour;
    private Collection<Botanic> botanicsByIdShift;
    private Collection<Caretaker> caretakersByIdShift;
    private Collection<Guide> guidesByIdShift;
    private Collection<Management> managementsByIdShift;
    private Collection<Veterinary> veterinariesByIdShift;

    public int getIdShift() {
        return idShift;
    }

    public void setIdShift(int idShift) {
        this.idShift = idShift;
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

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shift shift = (Shift) o;
        return idShift == shift.idShift &&
                Objects.equals(initialDate, shift.initialDate) &&
                Objects.equals(finalDate, shift.finalDate) &&
                Objects.equals(shiftName, shift.shiftName) &&
                Objects.equals(hour, shift.hour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idShift, initialDate, finalDate, shiftName, hour);
    }

    public Collection<Botanic> getBotanicsByIdShift() {
        return botanicsByIdShift;
    }

    public void setBotanicsByIdShift(Collection<Botanic> botanicsByIdShift) {
        this.botanicsByIdShift = botanicsByIdShift;
    }

    public Collection<Caretaker> getCaretakersByIdShift() {
        return caretakersByIdShift;
    }

    public void setCaretakersByIdShift(Collection<Caretaker> caretakersByIdShift) {
        this.caretakersByIdShift = caretakersByIdShift;
    }

    public Collection<Guide> getGuidesByIdShift() {
        return guidesByIdShift;
    }

    public void setGuidesByIdShift(Collection<Guide> guidesByIdShift) {
        this.guidesByIdShift = guidesByIdShift;
    }

    public Collection<Management> getManagementsByIdShift() {
        return managementsByIdShift;
    }

    public void setManagementsByIdShift(Collection<Management> managementsByIdShift) {
        this.managementsByIdShift = managementsByIdShift;
    }

    public Collection<Veterinary> getVeterinariesByIdShift() {
        return veterinariesByIdShift;
    }

    public void setVeterinariesByIdShift(Collection<Veterinary> veterinariesByIdShift) {
        this.veterinariesByIdShift = veterinariesByIdShift;
    }
}
