package fr.guillaumemrlrs.cvbril.routes;

import fr.guillaumemrlrs.cvbril.controllers.UserController;
import fr.guillaumemrlrs.cvbril.dao.UserRepository;
import fr.guillaumemrlrs.cvbril.models.User;
import fr.guillaumemrlrs.cvbril.models.UserLight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

//@Controller permet de renvoyer des pages HTML
@Controller
public class UserRouter {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value="/users")

    public String getUsers(Model model){
        String value="valeur à afficher";
        ArrayList<User> usersFromBdd =(ArrayList<User>) userRepository.findAll();
        ArrayList<UserLight> users = UserController.formatUsers(usersFromBdd);

        model.addAttribute("valeurDansTemplate",value);

//        ArrayList<User> users = (ArrayList<User>) userRepository.findAll();
        System.out.println(users);

        model.addAttribute("usersTab", users);
        return "users";
    }
    @RequestMapping(method=RequestMethod.GET, value="/users/{id}")
    public String getById(@PathVariable(name="id") String pId, Model model){
        int idInt = Integer.parseInt(pId);
        User userFromBdd = userRepository.findById(idInt).orElseThrow();
        UserLight user = UserController.formatUser(userFromBdd);
        model.addAttribute("title", user.getFirstname()+" " + user.getLastname());
        model.addAttribute("user",user);
    return "user";
    }
}
