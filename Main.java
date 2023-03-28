import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        ArrayList<Cliente> clientes1 = new ArrayList<>();

        // If Statements
            
             // Nuevo cliente

             Long id = (long) 3;
             String nombre = "Daniel";
             String apellido = "Bohorquez";
             String telefono = "25836925";
             String email = "daniel.bohorquez@gmail.com";
             LocalDate fechaAlta = LocalDate.of(2020,05,10);;
             LocalDate fechaActual = LocalDate.now();
             Cuenta cuentaI = new Cuenta(3, true, 300.0f);
             Cuenta[] cuentas = {cuentaI};
             Float ingresoMensual = 0f;
             Prestamo prestamo1E = new Prestamo(3,200.0f);
             Prestamo[] prestamoEjercicio = {prestamo1E};
             float ingresoMin= 2000f;
             long antiguedad = ChronoUnit.MONTHS.between(fechaActual, fechaAlta);
    

             // Ejercicio 1

            if(antiguedad >= 12 && ingresoMensual > 2000){
                ClienteA ClienteA1 = new ClienteA(id, nombre, apellido, telefono, email, fechaAlta, cuentas, ingresoMensual, prestamoEjercicio);
                System.out.println(ClienteA1);
                System.out.println("------------------------------------------");
                clientes.add(ClienteA1);
            } else if(ingresoMensual > 0){
                ClienteB ClienteB1 = new ClienteB(id, nombre, apellido, telefono, email, fechaAlta, cuentas, ingresoMensual, prestamoEjercicio);
                System.out.println(ClienteB1);
                System.out.println("------------------------------------------");
                clientes.add(ClienteB1);
            } else {
                Estudiante clienteEstudiante = new Estudiante(id, nombre, apellido, telefono, email, fechaAlta, cuentaI);
                System.out.println(clienteEstudiante);
                System.out.println("------------------------------------------");
                clientes.add(clienteEstudiante);
            }
      
        Long idBuscado= 1l;

        LocalDate fecha1 = LocalDate.of(2022, 04, 15);
        
        LocalDate fecha2 = LocalDate.of(2021, 05, 30);        

        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);

        Prestamo prestamo1 = new Prestamo(1, 2000f);

        Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
        Cuenta cuenta4 = new Cuenta(2, true, 550.0f);

        Prestamo prestamo2 = new Prestamo(1, 5000f);
        
        Prestamo[] prestamos2 = {prestamo2};
        Cuenta[] cuentas2 = {cuenta3, cuenta4};

        ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha2, cuentas2, 1000.0f, prestamos2);

         if(clienteB1.getIngresoMensual()>2000 && clienteB1.calculoAntiguedad()>=12){
            System.out.println("Cliente A");
        } else if(clienteB1.getIngresoMensual()>0){
            System.out.println("Cliente B");
        } else {
            System.out.println("Estudiante");
        }

        Prestamo[] Prestamo1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};

        ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha1, cuentas1, 2000.0f, Prestamo1);

        System.out.println("El balance total de cuentas del cliente es: " + clienteA1.calculoBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + clienteA1.calculoPrestamo());

        clientes.add(clienteA1);
        clientes.add(clienteB1);
        System.out.println(clientes);

        for(int x=2; x < clientes.size(); x++){
            if(clientes.get(x).getIdCliente() == idBuscado){
                clientes.remove(x);
            }
        }
        System.out.println("------------------------------------------");
        System.out.println(clientes);
    }
  
}