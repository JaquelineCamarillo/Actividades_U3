package mx.utng.s30;

import java.util.List;

import org.assertj.core.api.Assertions;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio1Tests {
    @Test @DisplayName("Prueba para trasformar y sumar")
    void canTransformAndAdd (){
            Ejercicio1 e1 = new Ejercicio1();

            List<Integer> conjunto = Arrays.asList(1,4,-6,7,3,5,-1);

            Integer expectec = -27;

            Assertions.assertThat(e1.manipular(conjunto, i -> i < 0 ? i:-i)).isEqualTo(expectec);
    }
}
