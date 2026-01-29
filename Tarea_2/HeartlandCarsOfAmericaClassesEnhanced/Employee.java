package Tarea_2.HeartlandCarsOfAmericaClassesEnhanced;


/**
 * Superclase abstracta que define los atributos y métodos comunes 
 * para todos los tipos de empleados en Heartland Cars of America.
 * * @author Tu Nombre
 * @version 2.0
 */
public abstract class Employee {

    // Atributos privados definidos en el diagrama UML mejorado
    private String firstName;
    private String lastName;

    /**
     * Constructor por defecto sin parámetros requerido por la tarea.
     */
    public Employee() {
    }

    /**
     * Constructor con parámetros para inicializar nombre y apellido.
     * * @param firstName El nombre del empleado.
     * @param lastName El apellido del empleado.
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Método abstracto para calcular la compensación del empleado.
     * Cada subclase debe implementar su propia lógica.
     * * @return El monto total de la compensación.
     */
    public abstract double computeCompensation();

    /**
     * Método abstracto para generar el recibo de pago del empleado.
     * * @return Una cadena con el formato del recibo de pago.
     */
    public abstract String createPayStub();

    // Métodos Accesorios (Getters y Setters) segun UML

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Devuelve la representación en texto del empleado (Nombre Completo).
     * * @return String con nombre y apellido.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}