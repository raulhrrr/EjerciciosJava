package poo.galletas;

import poo.vehiculos.TransporteBase;

public class GalletasMain {

    public static void main(String[] args) {
        GalletaBase[] galletas = new GalletaBase[4];

        galletas[0] = new GalletaChocolate("Cafe", "Chocolate Amargo", "Circular", 150F, 120F, 50F,50F,6,100F,2F,150F,"Amargo");
        galletas[1] = new GalletaIntegral("Cafe", "Chocolate Amargo", "Circular", 150F, 120F, 50F,50F,6,100F,2F);
        galletas[2] = new GalletaVainilla("Cafe", "Chocolate Amargo", "Circular", 150F, 120F, 50F,50F,6,100F,2F);
        galletas[3] = new GalletaChips("Cafe", "Chocolate Amargo", "Circular", 150F, 120F, 50F,50F,6,100F,2F,150,"Dulce");

        for (GalletaBase galleta : galletas) {
            galleta.mezclarIngredientes();
            galleta.preparar();
            galleta.darForma();
            galleta.hornear();

            System.out.println(galleta);
            System.out.println("");
        }

        MoldeBase[] moldes = new MoldeBase[4];

        moldes[0] = new MoldeCuadrado("Plastico", 25F, "Azúl");
        moldes[1] = new MoldeCircular("Plastico", 20F, "Rojo");
        moldes[2] = new MoldeEstrella("Plastico", 15F, "Amarillo", 5);
        moldes[3] = new MoldeTriangular("Plastico", 30F, "Blanco", "Equilatero");

        for (MoldeBase molde : moldes) {
            molde.crearMolde();
            molde.romperse();

            System.out.println(molde);
            System.out.println("");
        }

    }

}
