public class Encapsulamiento {


        public static void main(String[] args){


            Persona persona = new Persona();


            persona.setEdad(20);
            persona.setNombre("Kevin");
            persona.setTelefono(999888777);

            System.out.println(persona.getEdad());
            System.out.println(persona.getNombre());
            System.out.println(persona.getTelefono());



        }
}

        class Persona {
            private int edad;
            private String nombre;
            private int telefono;
            public void setEdad(int edad){
                this.edad = edad;
            }
            public int getEdad(){
                return edad;

            }

            public void setNombre(String nombre){
                this.nombre = nombre;
            }

            public String getNombre(){
                return this.nombre;
            }

            public void setTelefono(int telefono){
                this.telefono = telefono;
            }

            public int getTelefono(){
                return this.telefono;
            }

        }




