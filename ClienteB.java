import java.time.LocalDate;

public class ClienteB extends Cliente implements InterfaceClienteService {

    public ClienteB(long l, String nombre, String apellido, String telefono,
     String email, LocalDate fechaAlta, Cuenta[] cuentas, Float ingresoMensual, Prestamo[] prestamos) {
        super(l,nombre,apellido,telefono,email,fechaAlta,cuentas,ingresoMensual,prestamos);
    }

    @Override
    public Float calculoPrestamo() {
        Float maximoDisponible = getIngresoMensual() * 5;
        Prestamo[] prestamos = getPrestamos();
        Float deudaTotal = 0f;
        for (int i=0; i < prestamos.length; i++){
            deudaTotal += prestamos[i].getSaldo();
        }
        return maximoDisponible -deudaTotal; 
        }

    @Override
    public Float calculoBalance() {
        Cuenta[] cuentas = getCuentas();
        Float saldoTotal = 0f;
        for (int i=0; i < cuentas.length; i++){
            saldoTotal += cuentas[i].getBalance();
        }
        return saldoTotal;
    }

}
