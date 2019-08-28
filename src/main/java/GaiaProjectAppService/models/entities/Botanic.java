package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Botanic {
    private int idBotanic;
    private int idStaff;
    private String role;
    private String descriptionRole;
    private Integer idShift;
    private Staff staffByIdStaff;
    private Shift shiftByIdShift;
    private Collection<BotanicPlantae> botanicPlantaesByIdBotanic;

    @Id
    @Column(name = "id_botanic", nullable = false)
    public int getIdBotanic() {
        return idBotanic;
    }

    public void setIdBotanic(int idBotanic) {
        this.idBotanic = idBotanic;
    }

    @Basic
    @Column(name = "id_staff", nullable = false)
    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    @Basic
    @Column(name = "role", nullable = true, length = 60)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "description_Role", nullable = true, length = 70)
    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }

    @Basic
    @Column(name = "id_shift", nullable = true)
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

    @ManyToOne
    @JoinColumn(name = "id_staff", referencedColumnName = "id_staff", nullable = false, insertable = false, updatable = false)
    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }

    @ManyToOne
    @JoinColumn(name = "id_shift", referencedColumnName = "id_shift" , insertable = false, updatable = false)
    public Shift getShiftByIdShift() {
        return shiftByIdShift;
    }

    public void setShiftByIdShift(Shift shiftByIdShift) {
        this.shiftByIdShift = shiftByIdShift;
    }

    @OneToMany(mappedBy = "botanicByIdBotanic")
    public Collection<BotanicPlantae> getBotanicPlantaesByIdBotanic() {
        return botanicPlantaesByIdBotanic;
    }

    public void setBotanicPlantaesByIdBotanic(Collection<BotanicPlantae> botanicPlantaesByIdBotanic) {
        this.botanicPlantaesByIdBotanic = botanicPlantaesByIdBotanic;
    }
}
