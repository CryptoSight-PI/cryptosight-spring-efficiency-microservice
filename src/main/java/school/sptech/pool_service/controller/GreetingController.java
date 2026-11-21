package school.sptech.pool_service.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import school.sptech.pool_service.entity.Greeting;
import school.sptech.pool_service.entity.HelloMessage;

@Controller
public class GreetingController {

    @MessageMapping("/hello")   
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage helloMessage) throws Exception {
        Thread.sleep(2000);
        return new Greeting("Hello " + helloMessage.getHello() + "!");
    }
}
