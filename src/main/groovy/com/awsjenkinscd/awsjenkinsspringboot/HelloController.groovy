package com.awsjenkinscd.awsjenkinsspringboot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping('/hello')
    String hello()
    {
        return 'Hello from jenkins'
    }
    @RequestMapping('/welcome')
    String welcome()
    {
        return 'Hello world fgjlkdfjgldg'
    }
}
