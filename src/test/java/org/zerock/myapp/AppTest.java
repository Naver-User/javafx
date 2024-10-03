package org.zerock.myapp;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.*;

// Enum Constant
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;


@Log4j2
@NoArgsConstructor

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {


    @BeforeAll
    void beforeAll() {
        log.trace("beforeAll() invoked.");

    } // beforeAll

    @BeforeEach
    void beforeEach() {
        log.trace("beforeEach() invoked.");

    } // beforeEach

    @AfterEach
    void afterEach() {
        log.trace("afterEach() invoked.");

    } // afterEach

    @AfterAll
    void afterAll() {
        log.trace("afterAll() invoked.");

    } // afterAll


    @Tag("fast")
//    @Disabled("The reason this annotated test class or test method is disabled")
    @Test
    @Order(2)
    @DisplayName("contextLoads1")
    @Timeout(value = 1, unit = MINUTES)
    void contextLoads1() {
        log.trace("contextLoads1() invoked.");

    } // contextLoads1


    @Tag("fast")
//    @Disabled("The reason this annotated test class or test method is disabled")
    @Test
    @Order(1)
    @DisplayName("contextLoads2")
    @Timeout(value = 1, unit = SECONDS)
    void contextLoads2() {
        log.trace("contextLoads2() invoked.");

    } // contextLoads2



} // end class
