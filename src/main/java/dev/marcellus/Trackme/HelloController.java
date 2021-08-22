package dev.marcellus.Trackme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("/")
   public String index() {
       String response = "";

       try {
           System.out.println(Endpoints.Chess.PROFILE);
           System.out.println(Endpoints.Chess.PROFILE + "Marcellus97");
           response = Helper.get(Endpoints.Chess.PROFILE + "Marcellus97");
       }
       catch(Exception e) {
           response = e.getMessage();
       }
     return response;
   }
}
