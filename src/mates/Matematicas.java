package mates;

public class Matematicas {
     static int r = 1;
    public static double generarNumeroPiIterativo(long pasos){
        int dentro=0;
        for (int i=0; i<pasos; i++) {


            double x = -r + Math.random() * r;
            double y = -r + Math.random() * r;
            double comprobacion = x * x + y * y;
            if (comprobacion <= r*r) {
                dentro++;

            }
        }
        double pi = 4.0*dentro/pasos;
        return pi;
    }



}
