package dev.marcellus.Trackme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("/")
   public String index() {
     return "Greetings from Spring boot ! ahahahah";
   }
}
