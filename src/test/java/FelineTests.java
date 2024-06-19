import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
    @Spy
    Feline feline;

    @Test
    public void FelineGetKittensTest(){
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void FelineGetCountKittensTest(){ assertEquals(2, feline.getKittens(2)); } // не проверяет ошибку в переданных данных, так как метод не предусматривает проверку данных

    @Test
    public void FelineGetFamilyTest(){
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void FelineEatMeatTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }


}
