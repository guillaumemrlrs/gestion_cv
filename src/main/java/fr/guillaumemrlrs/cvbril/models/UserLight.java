package fr.guillaumemrlrs.cvbril.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class UserLight {
    private int id;
    private String lastname;
    private String firstname;
    private LocalDate birthdate;
    private String gitlabId;
    private int age;

    private String formattedBirthdate;

    public UserLight() {
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getId() {
        return id;
    }

    public String getFormattedBirthdate() {
        return formattedBirthdate;
    }

    public void setFormattedBirthdate(String formattedBirthdate) {
        this.formattedBirthdate = formattedBirthdate;
    }

    public void setGitlabId(String gitlabId) {
        this.gitlabId = gitlabId;
    }

    public String getGitlabId() {
        return gitlabId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        //periode et localdate
            int age= Period.between(birthdate,LocalDate.now()).getYears();
        return age;
    }

    @Override
    public String toString() {
        return "UserLight{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthdate=" + birthdate +
                ", gitlabId='" + gitlabId + '\'' +
                ", formattedBirthdate='" + formattedBirthdate + '\'' +
                '}';
    }


}
