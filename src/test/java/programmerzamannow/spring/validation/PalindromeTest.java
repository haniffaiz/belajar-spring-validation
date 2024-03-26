package programmerzamannow.spring.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import programmerzamannow.spring.validation.data.Foo;

import java.util.Set;

@SpringBootTest
public class PalindromeTest {
    
    @Autowired
    private Validator validator;

    @Test
    void palindromeValid() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("kodok"));
        Assertions.assertTrue(constraintViolations.isEmpty());
    }
    @Test
    void palindromeInvalid() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("hanif"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());
    }
}
