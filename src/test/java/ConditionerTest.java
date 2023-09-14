import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//создадим кондиционер
public class ConditionerTest {

    @Test
    public void test() {
        Conditioner cond = new Conditioner(-5, 5); { //передаем новые значения параметров указанных в конструкторе

            Assertions.assertEquals(-5, cond.getMinTemperature());
            Assertions.assertEquals(5, cond.getMaxTemperature());
            Assertions.assertEquals(-5, cond.getCurrentTemperature()); //сравним минимальную с текущей минимальной температоурой
        }
    }

    @Test
    public void test2() {
        Conditioner cond = new Conditioner(10); { //передаем новые значения параметров указанных в конструкторе

            Assertions.assertEquals(10, cond.getMinTemperature());
            Assertions.assertEquals(20, cond.getMaxTemperature());
            Assertions.assertEquals(10, cond.getCurrentTemperature()); //сравним минимальную с текущей минимальной температоурой
        }
    }



}