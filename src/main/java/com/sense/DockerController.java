package com.sense;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: docker-demo
 * @description:
 * @author: John Jiang
 * @create: 2020/9/24 14:39
 **/
@RestController
public class DockerController {

    @RequestMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}
