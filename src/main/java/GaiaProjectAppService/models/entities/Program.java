package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Program {
    private int idProgram;
    private int programCode;
    private String status;
    private String programName;
    private String description;
    private String programType;
    private Date initialDate;
    private Date finalDate;
    private Collection<ProgramDonation> programDonationsByIdProgram;
    private Collection<Transferences> transferencesByIdProgram;

    @Id
    @Column(name = "id_program", nullable = false)
    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

    @Basic
    @Column(name = "program_code", nullable = false)
    public int getProgramCode() {
        return programCode;
    }

    public void setProgramCode(int programCode) {
        this.programCode = programCode;
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
    @Column(name = "program_name", nullable = false, length = 70)
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 90)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "program_type", nullable = false, length = 90)
    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return idProgram == program.idProgram &&
                programCode == program.programCode &&
                Objects.equals(status, program.status) &&
                Objects.equals(programName, program.programName) &&
                Objects.equals(description, program.description) &&
                Objects.equals(programType, program.programType) &&
                Objects.equals(initialDate, program.initialDate) &&
                Objects.equals(finalDate, program.finalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProgram, programCode, status, programName, description, programType, initialDate, finalDate);
    }

    @OneToMany(mappedBy = "programByIdProgram")
    public Collection<ProgramDonation> getProgramDonationsByIdProgram() {
        return programDonationsByIdProgram;
    }

    public void setProgramDonationsByIdProgram(Collection<ProgramDonation> programDonationsByIdProgram) {
        this.programDonationsByIdProgram = programDonationsByIdProgram;
    }

    @OneToMany(mappedBy = "programByIdProgram")
    public Collection<Transferences> getTransferencesByIdProgram() {
        return transferencesByIdProgram;
    }

    public void setTransferencesByIdProgram(Collection<Transferences> transferencesByIdProgram) {
        this.transferencesByIdProgram = transferencesByIdProgram;
    }
}
