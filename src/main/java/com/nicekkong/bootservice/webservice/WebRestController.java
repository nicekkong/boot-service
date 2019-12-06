package com.nicekkong.bootservice.webservice;

import com.nicekkong.bootservice.webservice.domain.PostSaveRequestDto;
import com.nicekkong.bootservice.webservice.domain.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class WebRestController {

    private final PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello nicekkong in JE";
    }

    @PostMapping("/posts")
    public Map savePosts(@RequestBody PostSaveRequestDto dto) {
        postsRepository.save(dto.toEntity());

        HashMap<String, String> result = new HashMap<String, String>();
        result.put("result", "success");
        
        return result;
    }
}
