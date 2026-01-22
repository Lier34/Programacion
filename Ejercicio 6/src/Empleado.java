public class Empleado extends Persona {
    private int SueldoBruto;

    public Empleado(int edad, String nombre, int sueldoBruto) {
        super(edad, nombre);
        SueldoBruto = sueldoBruto;
    }

    public int getSueldoBruto() {
        return SueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        SueldoBruto = sueldoBruto;
    }

    public String mostrar(){
        return "Sueldo Bruto: " + SueldoBruto;
    }

    public String calcularSalario(){
        double descuento = SueldoBruto * 0.18;
        double sueldoNeto = SueldoBruto - descuento;
        return "Sueldo Neto: " + sueldoNeto;
    }
}
