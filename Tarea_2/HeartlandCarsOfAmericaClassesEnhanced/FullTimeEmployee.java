package Tarea_2.HeartlandCarsOfAmericaClassesEnhanced;
/**
 * Representa a un empleado de tiempo completo con salario base.
 * Esta clase extiende la funcionalidad de la clase Employee.
 * * @author Alecitos
 * @version 2.0
 */
public class FullTimeEmployee extends Employee {
	// Atributos privados específicos del diagrama UML mejorado
    private double baseSalary;
    private int hoursWorked;
    /**
     * Constructor por defecto requerido.
     */
    public FullTimeEmployee() {
        super();
    }
	/**
     * Constructor con parámetros.
     * * @param firstName Nombre del empleado.
     * @param lastName Apellido del empleado.
     * @param baseSalary Salario base anual.
     * @param hoursWorked Horas totales trabajadas.
     */
	public FullTimeEmployee(String firstName, String lastName, double baseSalary, int hoursWorked) {
		super (firstName,lastName); // Envía los datos a la superclase Employee
		this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
	}
	/**
     * Calcula la compensación total para empleados de tiempo completo.
     * En este sistema, se devuelve el salario base directamente.
     * * @return El salario base del empleado.
     */
    @Override
	public double computeCompensation() {
		
		return baseSalary;
	}
    /**
     * Genera el recibo de pago con el formato solicitado.
     * * @return String con el detalle del pago.
     */
    @Override
	public String createPayStub() {
		
    	return "FULL TIME EMPLOYEE: " + getFirstName() + " " + getLastName() + 
                "\nTotal Pay: $" + String.format("%.2f", computeCompensation());
     }

 // Getters y Setters específicos
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}