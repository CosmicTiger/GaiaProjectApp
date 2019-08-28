package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class BotanicPlantae {
    private int idBotanicPlantae;
    private int idPlantae;
    private int idBotanic;
    private int idSupply;
    private Plantae plantaeByIdPlantae;
    private Botanic botanicByIdBotanic;
    private Supply supplyByIdSupply;

    public int getIdBotanicPlantae() {
        return idBotanicPlantae;
    }

    public void setIdBotanicPlantae(int idBotanicPlantae) {
        this.idBotanicPlantae = idBotanicPlantae;
    }

    public int getIdPlantae() {
        return idPlantae;
    }

    public void setIdPlantae(int idPlantae) {
        this.idPlantae = idPlantae;
    }

    public int getIdBotanic() {
        return idBotanic;
    }

    public void setIdBotanic(int idBotanic) {
        this.idBotanic = idBotanic;
    }

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

    public Plantae getPlantaeByIdPlantae() {
        return plantaeByIdPlantae;
    }

    public void setPlantaeByIdPlantae(Plantae plantaeByIdPlantae) {
        this.plantaeByIdPlantae = plantaeByIdPlantae;
    }

    public Botanic getBotanicByIdBotanic() {
        return botanicByIdBotanic;
    }

    public void setBotanicByIdBotanic(Botanic botanicByIdBotanic) {
        this.botanicByIdBotanic = botanicByIdBotanic;
    }

    public Supply getSupplyByIdSupply() {
        return supplyByIdSupply;
    }

    public void setSupplyByIdSupply(Supply supplyByIdSupply) {
        this.supplyByIdSupply = supplyByIdSupply;
    }
}
