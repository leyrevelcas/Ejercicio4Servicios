package Modelo;

import java.time.LocalDate;

public class RevisionAlarma  extends Servicio{

     protected int numeroAlarmas;

    public RevisionAlarma( String cliente, int numeroAlarmas) {
        super( cliente);
        this.numeroAlarmas = numeroAlarmas;
        this.trabajador="Revisor especialista contraincendios";
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (numeroAlarmas/3)*40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        return null;
    }
}
