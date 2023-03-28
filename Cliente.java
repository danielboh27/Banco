import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente {
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaAlta;
    private Cuenta[] cuentas;
    private Float ingresoMensual;
    private Prestamo[] prestamos;

    public Cliente() {}

    public Cliente(long l, String nombre, String apellido, 
    String telefono, String email, LocalDate fechaAlta, Cuenta[] cuentas, 
    Float ingresoMensual, Prestamo[] prestamos) {
        this.idCliente = l;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.cuentas = cuentas;
        this.ingresoMensual = ingresoMensual;
        this.prestamos = prestamos;
    }

    public Cliente(Long idCliente, String nombre, String apellido, String telefono, 
    String email, LocalDate fechaAlta) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = fechaAlta;
    }


    public Long getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Cuenta[] getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public Float getIngresoMensual() {
        return this.ingresoMensual;
    }

    public void setIngresoMensual(Float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Prestamo[] getPrestamos() {
        return this.prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    public abstract Float calculoBalance();

    public Long calculoAntiguedad(){
        LocalDate momentoActual = LocalDate.now();
        long antiguedad = ChronoUnit.MONTHS.between(getFechaAlta(), momentoActual);
        return antiguedad;
    }

    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", email='" + getEmail() + "'" +
            ", fechaAlta='" + getFechaAlta() + "'" +
            ", tipoCliente='" + getClass().getName() + "'" +
            ", ingresoMensual='" + getIngresoMensual() + "'" +
            "}";
    }


}