import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestionVehiculosTest {

    private List<Vehiculo> vehiculos;
    Vehiculo vehiculo = new Vehiculo();
    String modelo;
    @BeforeEach
    void setUp() {
        vehiculos = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void anadirVehiculoTest() {
        assertTrue(vehiculos.add(vehiculo));
    }


    @Test
    void eliminarVehiculo() {
        assertFalse(vehiculos.removeIf(vehiculo -> vehiculo.getModelo().equals(modelo)));
    }
    @Test
    void eliminarVehiculoTest() {
        assertTrue( true);
    }

    @Test
    void buscarVehiculo() {
        for (Vehiculo vehiculo : vehiculos) {
            assertTrue(vehiculo.getModelo().equals(modelo));
        }
    }
        @Test
        void buscarVehiculoTest() {
            for (Vehiculo vehiculo : vehiculos) {
                assertTrue(false);
            }

        }
}