package Modelo;

public class CuentaCorriente {
    private int id;
    private String iban;
    private double saldo;

    public CuentaCorriente() {}

    public CuentaCorriente(int id, String iban, double saldo) {
        this.id = id;
        this.iban = iban;
        this.saldo = saldo;
    }

    public CuentaCorriente(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "id=" + id +
                ", iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}


