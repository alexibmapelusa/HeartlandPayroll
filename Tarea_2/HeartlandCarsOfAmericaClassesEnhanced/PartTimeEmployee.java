package Tarea_2.HeartlandCarsOfAmericaClassesEnhanced;
/**
 * Representa a un empleado de medio tiempo.
 * Calcula la compensación basada en una tarifa por hora.
 * * @author Alecitos
 * @version 2.0
 */
public class PartTimeEmployee extends Employee {
	// Atributos específicos según el diagrama UML
    private double payPerHour;
    private int hoursWorked;

    /**
     * Constructor por defecto.
     */
    public PartTimeEmployee() {
        super();
    }
    /**
     * Constructor con parámetros.
     * * @param firstName Nombre del empleado.
     * @param lastName Apellido del empleado.
     * @param hourlyRate Tarifa por hora.
     * @param hoursWorked Horas trabajadas.
     */
    public PartTimeEmployee(String firstName, String lastName, double payPerHour, int hoursWorked) {
        super(firstName, lastName);
        this.payPerHour = payPerHour;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Calcula la compensación multiplicando horas por tarifa.
     * * @return El total de pago bruto.
     */
    @Override
    public double computeCompensation() {
        return payPerHour * hoursWorked;
    }
    /**
     * Genera el recibo de pago para el empleado de medio tiempo.
     * * @return String con el detalle del pago.
     */
    @Override
    public String createPayStub() {
        return "PART TIME EMPLOYEE: " + getFirstName() + " " + getLastName() + 
               "\nHours Worked: " + hoursWorked +
               "\nHourly Rate: $" + String.format("%.2f", payPerHour) +
               "\nTotal Pay: $" + String.format("%.2f", computeCompensation());
    }

    // Getters y Setters
    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}