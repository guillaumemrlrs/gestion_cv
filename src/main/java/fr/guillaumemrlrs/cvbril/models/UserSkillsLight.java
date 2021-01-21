package fr.guillaumemrlrs.cvbril.models;

public class UserSkillsLight {
    private int id;
    private String name;
    private String description;
    private Integer note;

    public UserSkillsLight(){

    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserSkillsLight{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", note=" + note +
                '}';
    }
}
