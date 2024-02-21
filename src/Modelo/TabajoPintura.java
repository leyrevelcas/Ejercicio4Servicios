package Modelo;

import Modelo.Servicio;

import java.time.LocalDate;

public class TabajoPintura extends Servicio {
    protected double Superficie;
    protected double PrceioPintura;


    public TabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double prceioPintura) {
        super(trabajador, fechaInicio, cliente);
        Superficie = superficie;
        PrceioPintura = prceioPintura;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double superficie) {
        Superficie = superficie;
    }

    public double getPrceioPintura() {
        return PrceioPintura;
    }

    public void setPrceioPintura(double prceioPintura) {
        PrceioPintura = prceioPintura;
    }
    public   double costeMaterial(){
        return ((this.Superficie/7.8)*PrceioPintura);


    }

    @Override
    public double costeManoObra() {
        return ((this.Superficie/10)*9.5);
    }

    @Override
    public double costeTotal() {
        if(this.Superficie<50) {
            return (this.costeMaterial() + costeManoObra() * 1.15);
        }
        else {
            return (this.costeMaterial() + costeManoObra());
        }
    }

    @Override
    public String detalleServicio() {
        return null;
    }
}
