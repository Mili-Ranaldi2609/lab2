package ejercicio1;




    public class Flota {

        private Avion avion ;/*agregacion por composicion */

        public Flota(Avion avion) {

            this.avion= avion;
        }

        public Avion getAvion() {
            return avion;
        }

        public void setAvion(Avion avion) {
            this.avion = avion;
        }
        public void datosAvion(){
            System.out.println("Datos del avion: ");
            System.out.println("Nombre del avion: "+avion.getNombreA());
            System.out.println("Cantidad max pasajeros: "+avion.getCantPasajeros());
            System.out.println("Cantidad max de maletas: "+avion.getCapMaletas());

        }
    }


