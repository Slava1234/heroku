package com.heroku.sequence;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gnedko Vyacheslav
 * @project sequence
 * @created 30.12.2020 15:41
 */



@RestController
public class HerokuRestController {


    @GetMapping("/check")
    public Object check() {
        return Boolean.TRUE;
    }


}
