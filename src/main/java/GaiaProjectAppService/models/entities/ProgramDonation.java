package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Program_Donation", schema = "GaiaDatabase", catalog = "")
public class ProgramDonation {
    private int idProgramDonation;
    private int idProgram;
    private int idDonation;
    private Program programByIdProgram;
    private Donation donationByIdDonation;

    @Id
    @Column(name = "id_program_donation", nullable = false)
    public int getIdProgramDonation() {
        return idProgramDonation;
    }

    public void setIdProgramDonation(int idProgramDonation) {
        this.idProgramDonation = idProgramDonation;
    }

    @Basic
    @Column(name = "id_program", nullable = false)
    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

    @Basic
    @Column(name = "id_donation", nullable = false)
    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramDonation that = (ProgramDonation) o;
        return idProgramDonation == that.idProgramDonation &&
                idProgram == that.idProgram &&
                idDonation == that.idDonation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProgramDonation, idProgram, idDonation);
    }

    @ManyToOne
    @JoinColumn(name = "id_program", referencedColumnName = "id_program", nullable = false , insertable = false, updatable = false)
    public Program getProgramByIdProgram() {
        return programByIdProgram;
    }

    public void setProgramByIdProgram(Program programByIdProgram) {
        this.programByIdProgram = programByIdProgram;
    }

    @ManyToOne
    @JoinColumn(name = "id_donation", referencedColumnName = "id_donation", nullable = false , insertable = false, updatable = false)
    public Donation getDonationByIdDonation() {
        return donationByIdDonation;
    }

    public void setDonationByIdDonation(Donation donationByIdDonation) {
        this.donationByIdDonation = donationByIdDonation;
    }
}
