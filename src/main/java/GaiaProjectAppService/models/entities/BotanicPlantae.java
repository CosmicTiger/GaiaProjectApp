package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Botanic_Plantae", schema = "GaiaDatabase", catalog = "")
public class BotanicPlantae {
    private int idBotanicPlantae;
    private int idPlantae;
    private int idBotanic;
    private int idSupply;
    private Plantae plantaeByIdPlantae;
    private Botanic botanicByIdBotanic;
    private Supply supplyByIdSupply;

    @Id
    @Column(name = "id_botanic_plantae", nullable = false)
    public int getIdBotanicPlantae() {
        return idBotanicPlantae;
    }

    public void setIdBotanicPlantae(int idBotanicPlantae) {
        this.idBotanicPlantae = idBotanicPlantae;
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
    @Column(name = "id_botanic", nullable = false)
    public int getIdBotanic() {
        return idBotanic;
    }

    public void setIdBotanic(int idBotanic) {
        this.idBotanic = idBotanic;
    }

    @Basic
    @Column(name = "id_supply", nullable = false)
    public int getIdSupply() {
        return idSupply;
    }

    public void setIdSupply(int idSupply) {
        this.idSupply = idSupply;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BotanicPlantae that = (BotanicPlantae) o;
        return idBotanicPlantae == that.idBotanicPlantae &&
                idPlantae == that.idPlantae &&
                idBotanic == that.idBotanic &&
                idSupply == that.idSupply;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBotanicPlantae, idPlantae, idBotanic, idSupply);
    }

    @ManyToOne
    @JoinColumn(name = "id_plantae", referencedColumnName = "id_plantae", nullable = false, insertable = false, updatable = false)
    public Plantae getPlantaeByIdPlantae() {
        return plantaeByIdPlantae;
    }

    public void setPlantaeByIdPlantae(Plantae plantaeByIdPlantae) {
        this.plantaeByIdPlantae = plantaeByIdPlantae;
    }

    @ManyToOne
    @JoinColumn(name = "id_botanic", referencedColumnName = "id_botanic", nullable = false , insertable = false, updatable = false)
    public Botanic getBotanicByIdBotanic() {
        return botanicByIdBotanic;
    }

    public void setBotanicByIdBotanic(Botanic botanicByIdBotanic) {
        this.botanicByIdBotanic = botanicByIdBotanic;
    }

    @ManyToOne
    @JoinColumn(name = "id_supply", referencedColumnName = "id_supply", nullable = false , insertable = false, updatable = false)
    public Supply getSupplyByIdSupply() {
        return supplyByIdSupply;
    }

    public void setSupplyByIdSupply(Supply supplyByIdSupply) {
        this.supplyByIdSupply = supplyByIdSupply;
    }
}
