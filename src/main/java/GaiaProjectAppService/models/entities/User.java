package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    private int idUser;
    private int idStaff;
    private String profilePhoto;
    private String username;
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    private Staff staffByIdStaff;

    @Id
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "id_staff", nullable = false)
    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    @Basic
    @Column(name = "profile_photo", nullable = true, length = 100)
    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 30)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "security_question", nullable = false, length = 100)
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    @Basic
    @Column(name = "security_answer", nullable = false, length = 100)
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

    @ManyToOne
    @JoinColumn(name = "id_staff", referencedColumnName = "id_staff", nullable = false , insertable = false, updatable = false)
    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }
}
