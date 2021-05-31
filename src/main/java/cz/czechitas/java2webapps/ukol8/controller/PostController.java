package cz.czechitas.java2webapps.ukol8.controller;

import cz.czechitas.java2webapps.ukol8.service.PostService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
    private final PostService service;


    public PostController(PostService service) {
        this.service=service;
    }

    @GetMapping("/")
    public ModelAndView zakladniZobrazeni(@PageableDefault Pageable pageable) {
        return new ModelAndView("index")
                .addObject("post", service.list(pageable));
    }

    @GetMapping(value = "/post/{id}" )
    public  ModelAndView detailClanku(@PageableDefault Pageable pageable,
                                               @PathVariable("id") String slugPart ){
        return new ModelAndView("post")
                .addObject("post",service.singlePost(slugPart,pageable));
    }

}
