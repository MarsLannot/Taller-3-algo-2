package aed;

public class Recordatorio {

    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha (fecha.dia(), fecha.mes()); 
        this.horario = new Horario(horario.hora(),horario.minutos()); 
    }

    public Horario horario() {
        return new Horario(horario.hora(),horario.minutos());
    }

    public Fecha fecha() {
        return new Fecha (fecha.dia(), fecha.mes());

    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        return this.mensaje + " @ " + this.fecha + " " + this.horario;
    }

    @Override
    public boolean equals(Object otro) {
        if (otro.getClass() != this.getClass()) {
            return false;
        } else{
            Recordatorio otroRecordatorio = (Recordatorio) otro;
            return mensaje == otroRecordatorio.mensaje && fecha == otroRecordatorio.fecha && horario == otroRecordatorio.horario; 
        }

    }

}
