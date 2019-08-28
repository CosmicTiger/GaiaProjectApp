package GaiaProjectAppService.models.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private int idUser;
    private int idStaff;
    private String profilePhoto;
    private String username;
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    private Staff staffByIdStaff;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser == user.idUser &&
                idStaff == user.idStaff &&
                Objects.equals(profilePhoto, user.profilePhoto) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(securityQuestion, user.securityQuestion) &&
                Objects.equals(securityAnswer, user.securityAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idStaff, profilePhoto, username, password, securityQuestion, securityAnswer);
    }

    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }
}
