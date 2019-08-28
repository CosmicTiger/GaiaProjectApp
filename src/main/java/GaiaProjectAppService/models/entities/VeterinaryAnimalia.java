package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Veterinary_Animalia", schema = "GaiaDatabase", catalog = "")
public class VeterinaryAnimalia {
    private int idVeterinaryAnimalia;
    private int idAnimalia;
    private int idVeterinary;
    private int idSupply;
    private Animalia animaliaByIdAnimalia;
    private Veterinary veterinaryByIdVeterinary;
    private Supply supplyByIdSupply;

    @Id
    @Column(name = "id_veterinary_animalia", nullable = false)
    public int getIdVeterinaryAnimalia() {
        return idVeterinaryAnimalia;
    }

    public void setIdVeterinaryAnimalia(int idVeterinaryAnimalia) {
        this.idVeterinaryAnimalia = idVeterinaryAnimalia;
    }

    @Basic
    @Column(name = "id_animalia", nullable = false)
    public int getIdAnimalia() {
        return idAnimalia;
    }

    public void setIdAnimalia(int idAnimalia) {
        this.idAnimalia = idAnimalia;
    }

    @Basic
    @Column(name = "id_veterinary", nullable = false)
    public int getIdVeterinary() {
        return idVeterinary;
    }

    public void setIdVeterinary(int idVeterinary) {
        this.idVeterinary = idVeterinary;
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

    @ManyToOne
    @JoinColumn(name = "id_animalia", referencedColumnName = "id_animalia", nullable = false , insertable = false, updatable = false)
    public Animalia getAnimaliaByIdAnimalia() {
        return animaliaByIdAnimalia;
    }

    public void setAnimaliaByIdAnimalia(Animalia animaliaByIdAnimalia) {
        this.animaliaByIdAnimalia = animaliaByIdAnimalia;
    }

    @ManyToOne
    @JoinColumn(name = "id_veterinary", referencedColumnName = "id_veterinary", nullable = false , insertable = false, updatable = false)
    public Veterinary getVeterinaryByIdVeterinary() {
        return veterinaryByIdVeterinary;
    }

    public void setVeterinaryByIdVeterinary(Veterinary veterinaryByIdVeterinary) {
        this.veterinaryByIdVeterinary = veterinaryByIdVeterinary;
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
