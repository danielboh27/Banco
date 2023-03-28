public class Cuenta {

    private Integer idCuenta;
    private Boolean status;
    private Float balance;

    public Cuenta() {}

    public Cuenta(Integer id, Boolean status, Float balance) {
        this.idCuenta = id;
        this.status = status;
        this.balance = balance;
    }

    public Integer getId() {
        return this.idCuenta;
    }

    public void setId(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Boolean isStatus() {
        return this.status;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Float getBalance() {
        return this.balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", status='" + isStatus() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }
}