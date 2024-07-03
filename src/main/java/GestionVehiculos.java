import java.util.ArrayList;
import java.util.List;
public class GestionVehiculos {

        private List<Vehiculo> vehiculos;

        public GestionVehiculos() {
            vehiculos = new ArrayList<>();
        }

        public void anadirVehiculo(Vehiculo vehiculo) {
            vehiculos.add(vehiculo);
        }

        public void eliminarVehiculo(String modelo) {
            vehiculos.removeIf(vehiculo -> vehiculo.getModelo().equals(modelo));
        }

        public Vehiculo buscarVehiculo(String modelo) {
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getModelo().equals(modelo)) {
                    return vehiculo;
                }
            }
            return null;
        }

    //public static void main(String[] args) {

    }




