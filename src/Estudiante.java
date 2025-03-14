public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public void desempeno() {
        if (promedio >= 30 && promedio < 40) {
            System.out.println(nombre + " está aprobado, pero podría mejorar.");
        } else if (promedio < 30) {
            System.out.println(nombre + " está perdiendo. Necesita estudiar más.");
        } else if (promedio > 40) {
            System.out.println(nombre + " tiene un buen promedio.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

    public void felicitaciones() {
        if (promedio >= 40) {
            System.out.println("¡Felicidades " + nombre + "! Tienes un buen promedio, sigue así.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}