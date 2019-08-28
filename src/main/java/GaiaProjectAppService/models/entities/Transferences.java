package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Transferences {
    private int idTransferences;
    private int idProgram;
    private int idSpecie;
    private String name;
    private String transferenceCode;
    private Date dateTransference;
    private int age;
    private Program programByIdProgram;
    private Specie specieByIdSpecie;
    private Collection<TransferencesAnimalia> transferencesAnimaliasByIdTransferences;
    private Collection<TransferencesPlantae> transferencesPlantaesByIdTransferences;

    public int getIdTransferences() {
        return idTransferences;
    }

    public void setIdTransferences(int idTransferences) {
        this.idTransferences = idTransferences;
    }

    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

    public int getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(int idSpecie) {
        this.idSpecie = idSpecie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransferenceCode() {
        return transferenceCode;
    }

    public void setTransferenceCode(String transferenceCode) {
        this.transferenceCode = transferenceCode;
    }

    public Date getDateTransference() {
        return dateTransference;
    }

    public void setDateTransference(Date dateTransference) {
        this.dateTransference = dateTransference;
    }

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
                Objects.equals(name, that.name) &&
                Objects.equals(transferenceCode, that.transferenceCode) &&
                Objects.equals(dateTransference, that.dateTransference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransferences, idProgram, idSpecie, name, transferenceCode, dateTransference, age);
    }

    public Program getProgramByIdProgram() {
        return programByIdProgram;
    }

    public void setProgramByIdProgram(Program programByIdProgram) {
        this.programByIdProgram = programByIdProgram;
    }

    public Specie getSpecieByIdSpecie() {
        return specieByIdSpecie;
    }

    public void setSpecieByIdSpecie(Specie specieByIdSpecie) {
        this.specieByIdSpecie = specieByIdSpecie;
    }

    public Collection<TransferencesAnimalia> getTransferencesAnimaliasByIdTransferences() {
        return transferencesAnimaliasByIdTransferences;
    }

    public void setTransferencesAnimaliasByIdTransferences(Collection<TransferencesAnimalia> transferencesAnimaliasByIdTransferences) {
        this.transferencesAnimaliasByIdTransferences = transferencesAnimaliasByIdTransferences;
    }

    public Collection<TransferencesPlantae> getTransferencesPlantaesByIdTransferences() {
        return transferencesPlantaesByIdTransferences;
    }

    public void setTransferencesPlantaesByIdTransferences(Collection<TransferencesPlantae> transferencesPlantaesByIdTransferences) {
        this.transferencesPlantaesByIdTransferences = transferencesPlantaesByIdTransferences;
    }
}
