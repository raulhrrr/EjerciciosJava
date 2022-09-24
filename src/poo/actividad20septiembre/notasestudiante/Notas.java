package poo.actividad20septiembre.notasestudiante;

public class Notas {

    private Float notaUno;
    private Float notaDos;
    private Float notaTres;

    public Notas(Float notaUno, Float notaDos, Float notaTres) {
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
    }

    public void mostrarResultado() {
        Float promedio = (notaUno + notaDos + notaTres) / 3;
        if (promedio > 4.5 && promedio <= 5F) {
            System.out.println("Felicitaciones");
        } else if (promedio > 4F && promedio <= 4.5) {
            System.out.println("Su nota es excelente");
        } else if (promedio > 3F && promedio <= 4F) {
            System.out.println("Su nota es aceptable");
        } else if (promedio >= 1F && promedio <= 3F) {
            System.out.println("Perdiste la asignatura");
        }
    }

    public Float getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(Float notaUno) {
        this.notaUno = notaUno;
    }

    public Float getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(Float notaDos) {
        this.notaDos = notaDos;
    }

    public Float getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(Float notaTres) {
        this.notaTres = notaTres;
    }
}
