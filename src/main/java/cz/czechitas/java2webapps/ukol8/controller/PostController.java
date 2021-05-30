package cz.czechitas.java2webapps.ukol8.controller;

import cz.czechitas.java2webapps.ukol8.service.PostService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
    private final PostService service;


    public PostController(PostService service) {
        this.service=service;
    }

    @GetMapping("/")
    public ModelAndView zakladniZobrazeni(@PageableDefault Pageable pageable) {
        return new ModelAndView("posty")
                .addObject("posty", service.list(pageable));
    }

}
//    Vytvoř controller a v něm dvě metody, pro zobrazení úvodí stránky se seznamem postů a
//    pro zobrazení jednoho kompletního postu. Controller bude používat službu PostService,
//        kterou získá pomocí @Autowired.
//        Nemusíš řešit případ, když si uživatel vymyslí URL postu, který neexistuje.
