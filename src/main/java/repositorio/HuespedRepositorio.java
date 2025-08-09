package repositorio;

import modelo.dominio.Huesped;

import java.util.ArrayList;
import java.util.List;

public class HuespedRepositorio {


List<ArrayList<String>> listahuespedes = new ArrayList<>();




    public void crearHuespedRepositorio(Huesped huesped) {
        // Lógica para crear el repositorio de huéspedes
        ArrayList<String> listaHuesped = new ArrayList<>();

        String id = String.valueOf(huesped.getId());
        String nombre = huesped.getNombre();
        String apellido = huesped.getApellido();
        String direccion = huesped.getDireccion();
        String telefono = huesped.getTelefono();
        String ocupacion = huesped.getOcupacion();
        String origen = huesped.getOrigen();
        String tipoHuesped = huesped.getTipoHuesped();



        listaHuesped.add(id);
        listaHuesped.add(nombre);
        listaHuesped.add(apellido);
        listaHuesped.add(direccion);
        listaHuesped.add(telefono);
        listaHuesped.add(ocupacion);
        listaHuesped.add(origen);
        listaHuesped.add(tipoHuesped);

        listahuespedes.add(listaHuesped);
        System.out.println("Huesped agregado: " + listaHuesped);
    }





}
