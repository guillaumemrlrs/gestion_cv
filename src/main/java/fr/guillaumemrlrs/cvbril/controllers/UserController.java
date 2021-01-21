package fr.guillaumemrlrs.cvbril.controllers;

import fr.guillaumemrlrs.cvbril.models.User;
import fr.guillaumemrlrs.cvbril.models.UserLight;
import fr.guillaumemrlrs.cvbril.models.UserSkills;
import fr.guillaumemrlrs.cvbril.models.UserSkillsLight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    public static ArrayList<UserLight> formatUsers(ArrayList<User> pUsers) {
        ArrayList<UserLight> userLights = new ArrayList<>();

        for (User user : pUsers) {
            userLights.add(formatUser(user));
        }

        return userLights;
    }

    public static UserLight formatUser(User pUser){
        UserLight userLight = new UserLight();
        userLight.setId(pUser.getId());
        userLight.setBirthdate(pUser.getBirthdate());
        userLight.setFirstname(pUser.getFirstname());
        userLight.setLastname(pUser.getLastname());
        userLight.setGitlabId(pUser.getGitlabId());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        userLight.setFormattedBirthdate(pUser.getBirthdate().format(dtf));
        List<UserSkillsLight> skills = formatUsersSkills(pUser.getUserSkills());
        userLight.setUserSkillsLights(skills);
        return userLight;
    }

    private static List<UserSkillsLight> formatUsersSkills(List<UserSkills> userSkills) {
        List<UserSkillsLight> list = new ArrayList<>();
        for(UserSkills us : userSkills){
            UserSkillsLight light = new UserSkillsLight();
            light.setId(us.getSkill().getId());
            light.setName(us.getSkill().getName());
            light.setDescription(us.getSkill().getDescription());
            light.setNote(us.getNote());
            list.add(light);

        }
//        for(int i=0; i<userSkills.size();i++){
//            UserSkills us = userSkills.get(i);
//        }
        return list;
    }

    public static User formatUserForBdd(UserLight pUser) {
        User u = new User();
        u.setLastname(pUser.getLastname());
        u.setFirstname(pUser.getFirstname());
        u.setGitlabId(pUser.getGitlabId());
        u.setBirthdate(LocalDate.parse(pUser.getFormattedBirthdate()));

        u.setCreatedAt(LocalDate.now());
        u.setUpdatedAt(LocalDate.now());
        return u;
    }
}
