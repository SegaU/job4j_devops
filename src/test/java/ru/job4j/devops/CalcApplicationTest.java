package ru.job4j.devops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatusCode;
import ru.job4j.devops.controllers.CalcController;
import ru.job4j.devops.models.Result;
import ru.job4j.devops.models.TwoArgs;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CalcApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void mainMethodTest() {
        CalcApplication.main(new String[] {});
    }

}