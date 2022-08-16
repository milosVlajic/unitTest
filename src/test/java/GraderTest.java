import org.junit.jupiter.api.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Running grader test")
class GraderTest {
    Grader grader;
    Grader mockGrade;
    @BeforeEach
    void init(){
        mockGrade = mock(Grader.class);
    }
    static final Logger logger = Logger.getLogger(GraderTest.class.getName());
    @BeforeAll
    public static void beforeAll(){
        logger.log(Level.INFO, "starting test in class GraderTest");

    }
    @Test
    void fiftyOneShouldReturn1(){
        logger.log(Level.INFO, "started fiftyOneShouldReturn1");
         grader = new Grader();
        assertEquals(1, grader.determineLetterGrade(51));
        logger.log(Level.INFO, "ended fiftyOneShouldReturn1");
    }

    @Test
    void sixtyNineShouldREturn2(){
        logger.log(Level.INFO, "started sixtyNineShouldREturn2");
         grader = new Grader();
        assertEquals(2, grader.determineLetterGrade(69) );
        logger.log(Level.INFO, "ended sixtyNineShouldREturn2");
    }

    @Test
    void seventyNineShouldREturn3(){
        logger.log(Level.INFO, "started seventyNineShouldREturn3");
        grader = new Grader();
        assertEquals(3, grader.determineLetterGrade(79) );
        logger.log(Level.INFO, "ended seventyNineShouldREturn3");

    }

    @Test
    void eightyNineShouldREturn4(){
        logger.log(Level.INFO, "started eightyNineShouldREturn4");
         grader = new Grader();
        assertEquals(4, grader.determineLetterGrade(89) );
        logger.log(Level.INFO, "ended eightyNineShouldREturn4");
    }

    @Test
    void ninetyOneShouldREturn5(){
        logger.log(Level.INFO, "started ninetyOneShouldREturn5");
         grader = new Grader();
        assertEquals(5, grader.determineLetterGrade(91) );
        logger.log(Level.INFO, "ended ninetyOneShouldREturn5");

    }

    @Test
    void eightyShouldREturn4(){
        logger.log(Level.INFO, "started eightyShouldREturn4");
         grader = new Grader();
        assertEquals(4, grader.determineLetterGrade(80) );
        logger.log(Level.INFO, "ended eightyShouldREturn4");
    }

    @Test
    void zeroShouldREturn1(){
        logger.log(Level.INFO, "started zeroShouldREturn1");
        grader = new Grader();
        assertEquals(1, grader.determineLetterGrade(0) );
        logger.log(Level.INFO, "ended zeroShouldREturn1");
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        logger.log(Level.INFO, "started negativeOneShouldReturnIllegalArgumentException");
         grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {grader.determineLetterGrade(-1);});
        logger.log(Level.INFO, "ended negativeOneShouldReturnIllegalArgumentException");

    }

    @Test
    void mockedTest(){
        logger.log(Level.INFO, "started mockedTest");
        when(mockGrade.determineLetterGrade(80)).thenReturn(4);
        int expected = 4;
        int actual = mockGrade.determineLetterGrade(80);
        assertEquals(expected, actual );
        logger.log(Level.INFO, "ended mockedTest");
    }

    @AfterAll
    public static void afterAll(){
        logger.log(Level.INFO, "ending test in class GraderTest");}
}