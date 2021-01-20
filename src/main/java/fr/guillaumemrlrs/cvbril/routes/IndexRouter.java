package fr.guillaumemrlrs.cvbril.routes;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRouter {
    //JSON : {clef:valeur, clef:valeur}

    @RequestMapping(method = RequestMethod.GET, value="/")
    public String getIndex(Model model){
        return "Welcome !";
    }

}
