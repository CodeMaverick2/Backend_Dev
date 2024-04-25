package Modules;
import java.util.List;
import java.sql.Time;
public class Bill {
    private int id;
    private int TictetNumber;
    private Time exitTime;
    private double amount;
    private List<Payment> payments;
    private Status status;

}
