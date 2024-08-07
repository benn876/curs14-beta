import org.assertj.core.api.Assertions;
import org.beta.curs14.code.NullParameterException;
import org.beta.curs14.code.Operations;
import org.junit.jupiter.api.*;

public class OperationsTest {
    private Operations operations;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Welcome to the testing area");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test");
        this.operations = new Operations();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Testing area has been closed");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each test");
    }

    @Test
    public void sumPositiveTest() {
        System.out.println("Testing positive numbers");
        // SETUP
        Integer par1 = 44;
        Integer par2 = 22;

        //TEST RUN
        Integer result = operations.sum(par1, par2);

        //ASSERTIONS
        Assertions.assertThat(result).isEqualTo(66);
    }

    @Test
    public void sumNegativeTest() {
        System.out.println("Testing negative numbers");
        // SETUP
        Integer par1 = -44;
        Integer par2 = 22;

        //TEST RUN
        Integer result = operations.sum(par1, par2);

        //ASSERTIONS
        Assertions.assertThat(result).isEqualTo(-22);
    }

    @Test
    public void sumWithNull() {
        System.out.println("Testing null numbers");
        //SETUP
        Integer par1 = null;
        Integer par2 = 22;

        //TEST RUN
        org.junit.jupiter.api.Assertions.assertThrows(NullParameterException.class, () -> operations.sum(par1, par2));
    }

}
