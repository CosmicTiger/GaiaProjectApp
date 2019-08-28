package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class ProgramDonation {
    private int idProgramDonation;
    private int idProgram;
    private int idDonation;
    private Program programByIdProgram;
    private Donation donationByIdDonation;

    public int getIdProgramDonation() {
        return idProgramDonation;
    }

    public void setIdProgramDonation(int idProgramDonation) {
        this.idProgramDonation = idProgramDonation;
    }

    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

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

    public Program getProgramByIdProgram() {
        return programByIdProgram;
    }

    public void setProgramByIdProgram(Program programByIdProgram) {
        this.programByIdProgram = programByIdProgram;
    }

    public Donation getDonationByIdDonation() {
        return donationByIdDonation;
    }

    public void setDonationByIdDonation(Donation donationByIdDonation) {
        this.donationByIdDonation = donationByIdDonation;
    }
}
