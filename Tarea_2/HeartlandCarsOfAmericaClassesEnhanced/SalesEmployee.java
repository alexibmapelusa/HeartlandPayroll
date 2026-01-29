package Tarea_2.HeartlandCarsOfAmericaClassesEnhanced;

/**
 * Representa a un empleado de ventas con salario base y comisión.
 * * @author Alecitos
 * @version 2.0
 */
public class SalesEmployee extends Employee {

    private double baseSalary;
    private double salesVolume;
  

    /**
     * Constructor por defecto.
     */
    public SalesEmployee() {
        super();
    }

    /**
     * Constructor con parámetros.
     * * @param firstName Nombre del empleado.
     * @param lastName Apellido del empleado.
     * @param baseSalary Salario base.
     * @param commissionRate Tasa de comisión (ej. 0.05 para 5%).
     */
    public SalesEmployee(String firstName, String lastName, double baseSalary, 
                         double salesVolume) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
        this.salesVolume = salesVolume;
      
    }

    /**
     * Calcula la compensación sumando el salario base más la comisión.
     * * @return El total de compensación.
     */
    @Override
    public double computeCompensation() {
        return baseSalary + (salesVolume *0.05);
    }

    /**
     * Genera el recibo de pago para el empleado de ventas.
     * * @return Detalle del pago incluyendo comisión.
     */
    @Override
    public String createPayStub() {
      
        return "SALES EMPLOYEE: " + getFirstName() + " " + getLastName() + 
               "\nBase Salary: $" + String.format("%.2f", baseSalary) +
               "\nSales Volume: $" + String.format("%.2f", salesVolume) +
               "\nTotal Pay: $" + String.format("%.2f", computeCompensation());
    }

 // Getters y Setters según UML
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public double getSalesVolume() { return salesVolume; }
    public void setSalesVolume(double salesVolume) { this.salesVolume = salesVolume; }
}
