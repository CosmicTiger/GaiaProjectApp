package GaiaProjectAppService.models.entities;

import java.util.Collection;
import java.util.Objects;

public class Botanic {
    private int idBotanic;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<BotanicPlantae> botanicPlantaesByIdBotanic;

    public int getIdBotanic() {
        return idBotanic;
    }

    public void setIdBotanic(int idBotanic) {
        this.idBotanic = idBotanic;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }

    public Integer getIdShift() {
        return idShift;
    }

    public void setIdShift(Integer idShift) {
        this.idShift = idShift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Botanic botanic = (Botanic) o;
        return idBotanic == botanic.idBotanic &&
                idStaff == botanic.idStaff &&
                Objects.equals(role, botanic.role) &&
                Objects.equals(descriptionRole, botanic.descriptionRole) &&
                Objects.equals(idShift, botanic.idShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBotanic, idStaff, role, descriptionRole, idShift);
    }

    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }

    public Shift getShiftByIdShift() {
        return shiftByIdShift;
    }

    public void setShiftByIdShift(Shift shiftByIdShift) {
        this.shiftByIdShift = shiftByIdShift;
    }

    public Collection<BotanicPlantae> getBotanicPlantaesByIdBotanic() {
        return botanicPlantaesByIdBotanic;
    }

    public void setBotanicPlantaesByIdBotanic(Collection<BotanicPlantae> botanicPlantaesByIdBotanic) {
        this.botanicPlantaesByIdBotanic = botanicPlantaesByIdBotanic;
    }
}
