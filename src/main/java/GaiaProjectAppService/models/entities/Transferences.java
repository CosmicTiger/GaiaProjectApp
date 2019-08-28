package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Transferences {
    private int idTransferences;
    private String transferenceCode;
    private String status;
    private int idProgram;
    private int idSpecie;
    private String name;
    private Date dateTransference;
    private int age;
    private Program programByIdProgram;
    private Specie specieByIdSpecie;
    private Collection<TransferencesAnimalia> transferencesAnimaliasByIdTransferences;
    private Collection<TransferencesPlantae> transferencesPlantaesByIdTransferences;

    @Id
    @Column(name = "id_transferences", nullable = false)
    public int getIdTransferences() {
        return idTransferences;
    }

    public void setIdTransferences(int idTransferences) {
        this.idTransferences = idTransferences;
    }

    @Basic
    @Column(name = "transference_code", nullable = false, length = 12)
    public String getTransferenceCode() {
        return transferenceCode;
    }

    public void setTransferenceCode(String transferenceCode) {
        this.transferenceCode = transferenceCode;
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
    @Column(name = "id_program", nullable = false)
    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

    @Basic
    @Column(name = "id_specie", nullable = false)
    public int getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(int idSpecie) {
        this.idSpecie = idSpecie;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "date_transference", nullable = false)
    public Date getDateTransference() {
        return dateTransference;
    }

    public void setDateTransference(Date dateTransference) {
        this.dateTransference = dateTransference;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transferences that = (Transferences) o;
        return idTransferences == that.idTransferences &&
                idProgram == that.idProgram &&
                idSpecie == that.idSpecie &&
                age == that.age &&
                Objects.equals(transferenceCode, that.transferenceCode) &&
                Objects.equals(status, that.status) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dateTransference, that.dateTransference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransferences, transferenceCode, status, idProgram, idSpecie, name, dateTransference, age);
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
    @JoinColumn(name = "id_specie", referencedColumnName = "id_specie", nullable = false , insertable = false, updatable = false)
    public Specie getSpecieByIdSpecie() {
        return specieByIdSpecie;
    }

    public void setSpecieByIdSpecie(Specie specieByIdSpecie) {
        this.specieByIdSpecie = specieByIdSpecie;
    }

    @OneToMany(mappedBy = "transferencesByIdTransferences")
    public Collection<TransferencesAnimalia> getTransferencesAnimaliasByIdTransferences() {
        return transferencesAnimaliasByIdTransferences;
    }

    public void setTransferencesAnimaliasByIdTransferences(Collection<TransferencesAnimalia> transferencesAnimaliasByIdTransferences) {
        this.transferencesAnimaliasByIdTransferences = transferencesAnimaliasByIdTransferences;
    }

    @OneToMany(mappedBy = "transferencesByIdTransferences")
    public Collection<TransferencesPlantae> getTransferencesPlantaesByIdTransferences() {
        return transferencesPlantaesByIdTransferences;
    }

    public void setTransferencesPlantaesByIdTransferences(Collection<TransferencesPlantae> transferencesPlantaesByIdTransferences) {
        this.transferencesPlantaesByIdTransferences = transferencesPlantaesByIdTransferences;
    }
}
