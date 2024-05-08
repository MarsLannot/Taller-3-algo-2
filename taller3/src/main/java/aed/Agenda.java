package aed;

public class Agenda {

    private Fecha fechaActual;
    private Recordatorio recordatorio;
    private ArregloRedimensionableDeRecordatorios recordatorios; 

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();

    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        recordatorios.agregarAtras(recordatorio);
    }
        
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(fechaActual.toString()).append("\n");
    sb.append("=====\n");
    for (int i = 0; i < recordatorios.longitud(); i++) {
        Recordatorio rec = recordatorios.obtener(i);
        if (rec != null) {
            sb.append(rec.mensaje()).append(" @ ")
              .append(rec.fecha().toString()).append(" ")
              .append(rec.horario().toString()).append("\n");
        }
    }
    return sb.toString();
}



    public void incrementarDia() {
        fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return fechaActual;
    }

}
