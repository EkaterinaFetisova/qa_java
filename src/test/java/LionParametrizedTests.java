import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTests {
    Feline feline = Mockito.mock(Feline.class);
    private final String sex;
    private final boolean expected;

    public LionParametrizedTests(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals(expected, lion.doesHaveMane());
    }

}
