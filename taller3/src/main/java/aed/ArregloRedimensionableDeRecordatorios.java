package aed;


class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {
    private Recordatorio[] recordatorios;
    private int longitud;




    public ArregloRedimensionableDeRecordatorios() {
        this.recordatorios = new Recordatorio[10];
        this.longitud = 0;


    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.recordatorios = new Recordatorio[vector.recordatorios.length];
        for (int i = 0; i < vector.longitud; i++) {
            this.recordatorios[i] = new Recordatorio(vector.recordatorios[i].mensaje(), vector.recordatorios[i].fecha(), vector.recordatorios[i].horario());
        }
        this.longitud = vector.longitud;
    }




    public int longitud() {
        return longitud;
    }


    public void agregarAtras(Recordatorio i) {
        Recordatorio[] newRecordatorios = new Recordatorio[longitud + 1];

        for (int j = 0; j < longitud; j++ ){
            newRecordatorios[j] = recordatorios[j];
        }
        
        newRecordatorios[longitud] = i;
        longitud ++;
        recordatorios = newRecordatorios;

    }


    public Recordatorio obtener(int i) {
       return recordatorios[i];

    }
    

    public void quitarAtras() {
        longitud --;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        recordatorios[indice] = valor;
    }

    
    public boolean estaLleno() {
        return longitud == recordatorios.length;
    }

    public void redimensionar() {
        int nuevaCapacidad = recordatorios.length * 2;
        Recordatorio[] nuevoArreglo = new Recordatorio[nuevaCapacidad];
        for (int i = 0; i < longitud; i++) {
            nuevoArreglo[i] = recordatorios[i];
        }
        recordatorios = nuevoArreglo;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios copia = new ArregloRedimensionableDeRecordatorios();
        copia.recordatorios = new Recordatorio[longitud];
        
        for (int i = 0; i < longitud; i++) {
            copia.recordatorios[i] = recordatorios[i];
        }
        copia.longitud = longitud;
        
        return copia;
        
        //usé dos operaciones new en este ejercicio

    }

}
