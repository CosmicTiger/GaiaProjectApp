package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Shift {
    private int idShift;
    private String status;
    private Date initialDate;
    private Date finalDate;
    private String shiftName;
    private Time hour;
    private Collection<Botanic> botanicsByIdShift;
    private Collection<Caretaker> caretakersByIdShift;
    private Collection<Guide> guidesByIdShift;
    private Collection<Management> managementsByIdShift;
    private Collection<Veterinary> veterinariesByIdShift;

    @Id
    @Column(name = "id_shift", nullable = false)
    public int getIdShift() {
        return idShift;
    }

    public void setIdShift(int idShift) {
        this.idShift = idShift;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 12)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "initial_date", nullable = true)
    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    @Basic
    @Column(name = "final_date", nullable = true)
    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    @Basic
    @Column(name = "shift_name", nullable = true, length = 30)
    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    @Basic
    @Column(name = "hour", nullable = true)
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
                Objects.equals(status, shift.status) &&
                Objects.equals(initialDate, shift.initialDate) &&
                Objects.equals(finalDate, shift.finalDate) &&
                Objects.equals(shiftName, shift.shiftName) &&
                Objects.equals(hour, shift.hour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idShift, status, initialDate, finalDate, shiftName, hour);
    }

    @OneToMany(mappedBy = "shiftByIdShift")
    public Collection<Botanic> getBotanicsByIdShift() {
        return botanicsByIdShift;
    }

    public void setBotanicsByIdShift(Collection<Botanic> botanicsByIdShift) {
        this.botanicsByIdShift = botanicsByIdShift;
    }

    @OneToMany(mappedBy = "shiftByIdShift")
    public Collection<Caretaker> getCaretakersByIdShift() {
        return caretakersByIdShift;
    }

    public void setCaretakersByIdShift(Collection<Caretaker> caretakersByIdShift) {
        this.caretakersByIdShift = caretakersByIdShift;
    }

    @OneToMany(mappedBy = "shiftByIdShift")
    public Collection<Guide> getGuidesByIdShift() {
        return guidesByIdShift;
    }

    public void setGuidesByIdShift(Collection<Guide> guidesByIdShift) {
        this.guidesByIdShift = guidesByIdShift;
    }

    @OneToMany(mappedBy = "shiftByIdShift")
    public Collection<Management> getManagementsByIdShift() {
        return managementsByIdShift;
    }

    public void setManagementsByIdShift(Collection<Management> managementsByIdShift) {
        this.managementsByIdShift = managementsByIdShift;
    }

    @OneToMany(mappedBy = "shiftByIdShift")
    public Collection<Veterinary> getVeterinariesByIdShift() {
        return veterinariesByIdShift;
    }

    public void setVeterinariesByIdShift(Collection<Veterinary> veterinariesByIdShift) {
        this.veterinariesByIdShift = veterinariesByIdShift;
    }
}
