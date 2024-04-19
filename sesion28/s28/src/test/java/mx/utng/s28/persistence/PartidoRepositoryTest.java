package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PartidoRepositoryTest {

    @Autowired
    private EquipoRepository equiporepository;
    @Autowired
    private PartidoRepository partidorepository;

    
   @BeforeAll
    void cleanDatbase(){
        partidorepository.deleteAll();
    }
   // @Test
   // void canSave(){

        //instancio un equipo
       // Equipo equipo = new Equipo();
       // equipo.setNombre("America");
        
        //Guardo un equipo
       // equipo = repository.save(equipo);

        //Prueba que exista un id en ese equipo guardado
       // assertNotNull(equipo);

   // }

    @Test
    @DisplayName("Prueba guardar partido")
    void canSave(){
        

        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        equipo1.setNombre("Cruz azul");
        equipo2.setNombre("León");
        
        equiporepository.save(equipo1);
        equiporepository.save(equipo2);

        Partido partido = new Partido();
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        partido.setMarcadorEquipo1(0);
        partido.setMarcadorEquipo2(0);
        
        partidorepository.save(partido);
    }
}
        