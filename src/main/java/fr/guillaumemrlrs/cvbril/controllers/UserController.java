package fr.guillaumemrlrs.cvbril.controllers;

import fr.guillaumemrlrs.cvbril.models.User;
import fr.guillaumemrlrs.cvbril.models.UserLight;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
        return userLight;
    }
}
