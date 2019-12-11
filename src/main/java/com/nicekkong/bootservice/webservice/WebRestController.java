package com.nicekkong.bootservice.webservice;

import com.nicekkong.bootservice.webservice.dto.PostsSaveRequestDto;
import com.nicekkong.bootservice.webservice.domain.PostsRepository;
import com.nicekkong.bootservice.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class WebRestController {

    private final PostsRepository postsRepository;
    private final PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello nicekkong in JE";
    }

    @PostMapping("/posts")
    public Map savePosts(@RequestBody PostsSaveRequestDto dto) {
        postsService.save(dto);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        
        return result;
    }
}
