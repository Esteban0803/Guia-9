//Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
//constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
//Método mostrarPersona que muestra la información de la persona deseada.
package Entidad;
import java.util.Date;

public class Persona {
    private Date fechaN;
    private String nombre;
    public Persona() {
    }

    public Persona(Date fechaN, String nombre) {
        this.fechaN = fechaN;
        this.nombre = nombre;
    }

    
    public Date getFechaN() {
        return fechaN;
    }
    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
