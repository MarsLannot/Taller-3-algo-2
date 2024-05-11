package aed;

public class Horario {

    private Integer hora;
    private Integer minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    @Override
    public String toString() {
        if(this.minutos == 0)
            return this.hora + ":" + this.minutos;
        else if (this.hora < 10 && this.minutos < 10 )
            return "0" + this.hora + ":" + "0" + this.minutos;
        else if (this.hora >= 10 && this.minutos < 10)
            return this.hora + ":" + "0" + this.minutos;
        else
        return this.hora + ":" + this.minutos;

    }

    @Override
    public boolean equals(Object otro) {

        if (otro.getClass() != this.getClass()) {
            return false;
        } else{
            Horario otroHorario = (Horario) otro;
            return hora == otroHorario.hora && minutos == otroHorario.minutos;
        }

    
    }



}
