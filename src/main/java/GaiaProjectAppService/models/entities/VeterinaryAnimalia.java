package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class VeterinaryAnimalia {
    private int idVeterinaryAnimalia;
    private int idAnimalia;
    private int idVeterinary;
    private int idSupply;
    private Animalia animaliaByIdAnimalia;
    private Veterinary veterinaryByIdVeterinary;
    private Supply supplyByIdSupply;

    public int getIdVeterinaryAnimalia() {
        return idVeterinaryAnimalia;
    }

    public void setIdVeterinaryAnimalia(int idVeterinaryAnimalia) {
        this.idVeterinaryAnimalia = idVeterinaryAnimalia;
    }

    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
    }

    public int getIdVeterinary() {
        return idVeterinary;
    }

    public void setIdVeterinary(int idVeterinary) {
        this.idVeterinary = idVeterinary;
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
        VeterinaryAnimalia that = (VeterinaryAnimalia) o;
        return idVeterinaryAnimalia == that.idVeterinaryAnimalia &&
                idAnimalia == that.idAnimalia &&
                idVeterinary == that.idVeterinary &&
                idSupply == that.idSupply;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVeterinaryAnimalia, idAnimalia, idVeterinary, idSupply);
    }

    public Animalia getAnimaliaByIdAnimalia() {
        return animaliaByIdAnimalia;
    }

    public void setAnimaliaByIdAnimalia(Animalia animaliaByIdAnimalia) {
        this.animaliaByIdAnimalia = animaliaByIdAnimalia;
    }

    public Veterinary getVeterinaryByIdVeterinary() {
        return veterinaryByIdVeterinary;
    }

    public void setVeterinaryByIdVeterinary(Veterinary veterinaryByIdVeterinary) {
        this.veterinaryByIdVeterinary = veterinaryByIdVeterinary;
    }

    public Supply getSupplyByIdSupply() {
        return supplyByIdSupply;
    }

    public void setSupplyByIdSupply(Supply supplyByIdSupply) {
        this.supplyByIdSupply = supplyByIdSupply;
    }
}
