
public class Empleado {
    private int legajo;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtra;
    private boolean casado;
    private int numeroHijos;

    public Empleado(int legajo, double sueldoBase, double pagoHoraExtra, int horasExtra, boolean casado, int numeroHijos) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtra = horasExtra;
        this.casado = casado;
        this.numeroHijos = numeroHijos;

    }
    public int getLegajo() {
        return legajo;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public boolean isCasado() {
        return casado;
    }
    public int getNumeroHijos() {
        return numeroHijos;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    public int CalcularHorasExtra(int horas) {
        if (horas >= 0) {
            this.horasExtra += horas;
        }
        return this.horasExtra;
    }
    public double CalcularSueldoBruto() {
        return sueldoBase + (pagoHoraExtra * horasExtra);
    }
    public  double CalcularRetenciones() {
        double retencion = 10.00;
        if (casado) {
            retencion += 1.00; 
        } else {
            retencion += 10.00; 
        }
        retencion += numeroHijos * 1.00; 
        return CalcularSueldoBruto() * retencion;
    }
    public String toString() {
        return "Legajo: " + legajo + ", SueldoBase: " + sueldoBase + ", PagoHoraExtra: " + pagoHoraExtra +
               ", HorasExtra: " + horasExtra + ", Casado: " + casado + ", NumeroHijos: " + numeroHijos;
    } 
}


