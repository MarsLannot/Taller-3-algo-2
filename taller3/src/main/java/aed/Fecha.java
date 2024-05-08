package aed;

public class Fecha {

    private Integer dia;
    private Integer mes;


    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;

    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia;
        this.mes = fecha.mes;
    }

    public Integer dia() {
        return this.dia;
    }

    public Integer mes() {
        return this.mes;
    }


    @Override
    public String toString() {
        return this.dia + "/" + this.mes;
    }

    @Override
    public boolean equals(Object otra) {
        
        if (otra.getClass() != this.getClass()){
            return false;
        }else{
        Fecha otraFecha = (Fecha) otra;
        return dia == otraFecha.dia && mes == otraFecha.mes;
        }
        

        }

    public void incrementarDia() {
        if (this.dia < diasEnMes(this.mes)) {
            this.dia++;
        } else {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
            } else {
                this.mes++;
            }
        }

    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
