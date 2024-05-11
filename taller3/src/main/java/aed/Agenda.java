package aed;

public class Agenda {

    private Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios recordatorios; 

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();

    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        if (recordatorios.estaLleno()){
            recordatorios.redimensionar();
            recordatorios.agregarAtras(recordatorio);
        } else{
            recordatorios.agregarAtras(recordatorio);

        }

    }



    @Override
public String toString() {
    String result = fechaActual.toString() + "\n";
    result += "=====\n";
    for (int i = 0; i < recordatorios.longitud(); i++) {
        if (recordatorios.obtener(i) != null && recordatorios.obtener(i).fecha().equals(fechaActual)) {

                result += recordatorios.obtener(i).toString() + "\n";
        }
    }
    return result;
}



    public void incrementarDia() {
        fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return fechaActual;
    }

}
