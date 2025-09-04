public class receta {
        private String nombre;
        private int tiempo; 
        private String dificultad;
        private int cantIngredientes;

        public receta ( String nombre, int tiempo, String dificultad, int cantIngredientes) {
        this.nombre= nombre;
        this.tiempo= tiempo;
        this.dificultad= dificultad;
        this.cantIngredientes= cantIngredientes;
        }                                   
        public void setNombre (String nombre){
        this.nombre= nombre ;
        }
        public String getNombre (){
                 return this.nombre ;
        }
        public void setTiempo ( int tiempo){
                this.tiempo= tiempo ;
        }
        public int getTiempo (){
                return this.tiempo ;
        }
        public void setDificultad (String dificultad){
        this.dificultad= dificultad;
        }
        public String getDificultad (){
        return this.dificultad;
        }
        public void setCantIngredientes (int cantIngredientes) {
        this.cantIngredientes= cantIngredientes;
        }
        public int getCantIngredientes (){
        return this.cantIngredientes;
        }
        public String esTiempo() {
                if (this.tiempo < 30 ){
                        return "receta rapida";
                }else if (this.tiempo < 60) {
                        return "receta intermedia";
                }else{
                        return "receta larga";
                }
                }
                public void aumentarTiempo(int minutos) {
                        this.tiempo += minutos;
                }   
         public static void main(String[] args) {
                receta receta1, receta2;
                receta1 = new receta ("tarta de manzana", 45, "media", 5);
                receta2 = new receta ("pizza casera", 90, "media", 7) ;
                System.out.println("el nombre de la receta es: " + receta1.getNombre());
                System.out.println("el tiempo de la receta es: " + receta1.getTiempo());
                System.out.println("la dificultad de la receta es: " + receta1.getDificultad());
                System.out.println("la cantidad de ingredientes de la receta es: " + receta1.getCantIngredientes());
                System.out.println(receta1.esTiempo());
                receta1.aumentarTiempo(20);
                System.out.println("el nuevo tiempo de la receta es: " + receta1.getTiempo());
                System.out.println(receta1.esTiempo());

                System.out.println("el nombre de la receta es: " + receta2.getNombre());
                System.out.println("el tiempo de la receta es: " + receta2.getTiempo());
                System.out.println("la dificultad de la receta es: " + receta2.getDificultad());
                System.out.println("la cantidad de ingredientes de la receta es: " + receta2.getCantIngredientes());
                System.out.println(receta2.esTiempo());
                receta1.aumentarTiempo(0);
                System.out.println("el nuevo tiempo de la receta es: " + receta2.getTiempo());
                System.out.println(receta2.esTiempo());
         }
}