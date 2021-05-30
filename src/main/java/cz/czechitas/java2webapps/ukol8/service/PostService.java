package cz.czechitas.java2webapps.ukol8.service;

import cz.czechitas.java2webapps.ukol8.entity.Post;
import cz.czechitas.java2webapps.ukol8.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
      public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
public Page<Post> list(Pageable pageable){
        return postRepository.findAll(pageable);
}


 public String singlePost(String slug){
     return null;
 }
 
 
//    Ve službě PostService vytvoř metodu list(),
//    která bude vracet seznam všech postů (zatím bez stránkování a řazení).
//    Dále tam vytvoř metodu singlePost(String slug),
//    která najde jeden post podle zadaného slug a ten vrátí.
}
