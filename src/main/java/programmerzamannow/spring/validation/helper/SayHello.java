package programmerzamannow.spring.validation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class SayHello {

    public String sayHello(@NotBlank String name){
        return "Hello "+name;
    }

}
