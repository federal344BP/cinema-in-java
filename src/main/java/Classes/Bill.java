/*
 * Este archivo define la clase Bill, que representa una factura de venta para un cine.
 * Contiene información sobre el cliente, la película, la fecha y hora de la función,
 * las entradas vendidas, el precio y el cálculo del IVA.
 */
package Classes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 * La clase Bill representa una factura de venta para un cine.
 */
public class Bill {

    private String nit;
    private User cashier;
    private Showtime showtime;
    private String dateShow;
    private List<String> seats;
    private double price;
    private final double iva;
    private double totalPrice;
    private LocalDateTime purchaseDate;
    private String nameClient;
    private String identification;

    /**
     * Constructor de la clase Bill. Inicializa los atributos con valores
     * predeterminados.
     */
    public Bill() {
        nit = "00000000000";
        seats = new ArrayList<>();
        cashier = null;
        showtime = null;
        price = 0.0;
        iva = 0.19;
        totalPrice = 0.0;
        purchaseDate = null;
        nameClient = "";
        identification = "";
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param name El nombre del cliente.
     */
    public void setNameClient(String name) {
        nameClient = name;
    }

    /**
     * Establece la identificación del cliente.
     *
     * @param identification La identificación del cliente.
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    // Getters and setters
    /**
     * Establece la fecha de la función.
     *
     * @param date La fecha de la función.
     */
    public void setDateShow(String date) {
        dateShow = date;
    }

    /**
     * Obtiene la fecha de la función.
     *
     * @return La fecha de la función.
     */
    public String getDateShow() {
        return dateShow;
    }

    /**
     * Obtiene el NIT.
     *
     * @return El NIT.
     */
    public String getNit() {
        return nit;
    }

    /**
     * Obtiene el cajero.
     *
     * @return El cajero (Class User).
     */
    public User getCashier() {
        return cashier;
    }

    /**
     * Establece el cajero.
     *
     * @param cashier El cajero (Class User).
     */
    public void setCashier(User cashier) {
        this.cashier = cashier;
    }

    /**
     * Establece la función/presentación de cine.
     *
     * @param showtime La funcion (Class Showtime).
     */
    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    /**
     * Obtiene los asientos comprados.
     *
     * @return La lista de asientos.
     */
    public List<String> getSeats() {
        return seats;
    }

    /**
     * Establece los asientos vendidos.
     *
     * @param seats La lista de asientos.
     */
    public void setSeats(List<String> seats) {
        this.seats = seats;
    }

    /**
     * Obtiene el precio sin IVA.
     *
     * @return El precio.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio total de la venta, incluyendo el IVA.
     *
     * @param price El precio sin impuestos.
     */
    public void setPrice(double price) {
        this.price = price;
        totalPrice = price + (price * iva);
    }

    /**
     * Obtiene el IVA.
     *
     * @return El IVA.
     */
    public double getIva() {
        return iva;
    }

    /**
     * Obtiene el precio total.
     *
     * @return El precio total.
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Obtiene la fecha de compra en la zona horaria de Colombia. Si la fecha de
     * compra no está establecida, se devuelve la fecha y hora actual.
     *
     * @return La fecha y hora actual de Colombia.
     */
    public LocalDateTime getPurchaseDate() {
        if (purchaseDate != null) {
            LocalDateTime date = LocalDateTime.now();
            ZoneId zone = ZoneId.of("America/Bogota");
            ZonedDateTime zonaHoraria = date.atZone(zone);
            LocalDateTime localDate = zonaHoraria.toLocalDateTime();
            purchaseDate = localDate;
        }
        return purchaseDate;
    }

    /**
     * Convierte la factura en una cadena de caracteres.
     *
     * @return La representación de la factura como cadena de caracteres.
     */
    public String toString() {
        return "Cueva de Ana \n"
                + "NIT: " + nit
                + "\nDirección: Calle 85 # 87 CC Cometa Local 105-110 \n"
                + "Cajero/a: " + cashier.getName() + "\nCaja: " + cashier.getCashRegister()
                + "\nCliente: " + nameClient + "\nIdentificación: " + identification + "\n"
                + "--------Información de la compra-------\n"
                + "Película: " + showtime.getMovie() + "\n"
                + "Fecha de la función: " + dateShow + " " + showtime.getStartHour() + " - " + showtime.getEndHour() + "\n"
                + "Sala: " + showtime.getTheater() + "\n"
                + "Asientos: " + seats + "\n"
                + "Valor: " + price + "  IVA: 19% \n"
                + "Valor total: " + totalPrice
                + "\n--------------------------------------\n"
                + "Fecha de la compra: " + getPurchaseDate();
    }

    /**
     * Convierte la factura en un documento BSON para su almacenamiento en la
     * base de datos.
     *
     * @return El documento BSON.
     */
    public Document converter() {
        Document document = new Document("CashRegister", cashier.getCashRegister())
                .append("Cashier", cashier.getName())
                .append("NameClient", nameClient)
                .append("Identification", identification)
                .append("Movie", showtime.getMovie())
                .append("Date", dateShow)
                .append("StartTime", showtime.getStartHour())
                .append("EndHour", showtime.getEndHour())
                .append("Theater", showtime.getTheater())
                .append("Seats", seats)
                .append("Price", price)
                .append("Tax", iva)
                .append("TotalPrice", totalPrice)
                .append("PurchaseDate", getPurchaseDate());
        return document;
    }
}
