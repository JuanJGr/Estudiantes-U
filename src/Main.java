
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Luis Pérez", 18, "Ingeniería de Industrial", 39);
        Estudiante estudiante2 = new Estudiante("Ana Alvarez", 26, "Contaduría", 27);
        Estudiante estudiante3 = new Estudiante("Carlos Fernandez", 20, "Administración", 36);

        System.out.println("""
                         
                         Información inicial de los estudiantes 
                         """);
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();


        estudiante1.setEdad(19);
        estudiante1.setPromedio(42);
        estudiante1.setCarrera("Ingeniería de Sistemas");

        estudiante2.setEdad(26);
        estudiante2.setPromedio(29);
        estudiante2.setCarrera("Contaduria");

        estudiante3.setEdad(21);
        estudiante3.setPromedio(39);
        estudiante3.setCarrera("Administracion");

        System.out.println("""
                               
                               Información actualizada de los estudiantes 
                                      """);

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();

        System.out.println("""
                              
                              Desempeño de los estudiantes 
                              """);
        estudiante1.desempeno();
        estudiante2.desempeno();
        estudiante3.desempeno();

        System.out.println("""
                             
                             Felicitaciones 
                             """);
        estudiante1.felicitaciones();
        estudiante2.felicitaciones();
        estudiante3.felicitaciones();
    }
}