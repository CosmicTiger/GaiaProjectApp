package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Program {
    private int idProgram;
    private int programCode;
    private String programName;
    private String description;
    private String programType;
    private Date initialDate;
    private Date finalDate;
    private String statusProgram;
    private Collection<ProgramDonation> programDonationsByIdProgram;
    private Collection<Transferences> transferencesByIdProgram;

    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

    public int getProgramCode() {
        return programCode;
    }

    public void setProgramCode(int programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
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

    public String getStatusProgram() {
        return statusProgram;
    }

    public void setStatusProgram(String statusProgram) {
        this.statusProgram = statusProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return idProgram == program.idProgram &&
                programCode == program.programCode &&
                Objects.equals(programName, program.programName) &&
                Objects.equals(description, program.description) &&
                Objects.equals(programType, program.programType) &&
                Objects.equals(initialDate, program.initialDate) &&
                Objects.equals(finalDate, program.finalDate) &&
                Objects.equals(statusProgram, program.statusProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProgram, programCode, programName, description, programType, initialDate, finalDate, statusProgram);
    }

    public Collection<ProgramDonation> getProgramDonationsByIdProgram() {
        return programDonationsByIdProgram;
    }

    public void setProgramDonationsByIdProgram(Collection<ProgramDonation> programDonationsByIdProgram) {
        this.programDonationsByIdProgram = programDonationsByIdProgram;
    }

    public Collection<Transferences> getTransferencesByIdProgram() {
        return transferencesByIdProgram;
    }

    public void setTransferencesByIdProgram(Collection<Transferences> transferencesByIdProgram) {
        this.transferencesByIdProgram = transferencesByIdProgram;
    }
}
