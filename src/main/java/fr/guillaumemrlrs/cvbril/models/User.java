package fr.guillaumemrlrs.cvbril.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="lastname")
    private String lastname;

    @Column(name="firstname")
    private String firstname;

    @Column(name="created_At")
    private LocalDate createdAt;

    @Column(name="updated_At")
    private LocalDate updatedAt;

    @Column(name="cv")
    private String cv;

    @Column(name="gitlab_id")
    private String gitlabId;

    @Column(name="birthdate")
    private LocalDate birthdate;

    public User(){

    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public String getGitlabId() {
        return gitlabId;
    }

    public String getCv() {
        return cv;
    }

    public String getLastname() {
        return lastname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setGitlabId(String gitlabId) {
        this.gitlabId = gitlabId;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", cv='" + cv + '\'' +
                ", gitlabId='" + gitlabId + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
