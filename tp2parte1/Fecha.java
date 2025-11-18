package tp2parte1;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() { 
        return dia; }
    public int getMes() { 
        return mes; }
    public int getAnio() { 
        return anio; }

    public void setDia(int dia) { 
        this.dia = dia; }
    public void setMes(int mes) { 
        this.mes = mes; }
    public void setAnio(int anio) { 
        this.anio = anio; }

    public String getNombreMes() {
        String[] nombres = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        if (mes >= 1 && mes <= 12) {
            return nombres[mes - 1];
        } else {
            return "Mes inválido";
        }
    }

    public String mostrarFecha() {
        return dia + " de " + getNombreMes() + " de " + anio;
    }
}