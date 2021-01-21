package fr.guillaumemrlrs.cvbril.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_skills")
public class UserSkills  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="note")
    private Integer note;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="skills_id")
    private Skill skill;

    public UserSkills(){

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNote() {
        return note;
    }

    public Skill getSkill() {
        return skill;
    }

    public User getUser() {
        return user;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
