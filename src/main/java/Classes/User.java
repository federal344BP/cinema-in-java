/*
 * Este archivo define la clase User, que representa un usuario del sistema con su información asociada.
 */
package Classes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import org.bson.Document;

/**
 * La clase User representa un usuario del sistema con su información asociada.
 */
public class User {

    private String userName;
    private String id;
    private String password;
    private String name;
    private String identification;
    private String rol;
    private String cashRegister;

    /**
     * Crea una instancia de User con valores predeterminados.
     */
    public User() {
        userName = "";
        id = "";
        password = "";
        name = "";
        identification = "";
        rol = "Cajero";
        cashRegister = "";
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param name El nombre del usuario.
     */
    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param userName El nombre de usuario.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Establece la identificación del usuario.
     *
     * @param identification La identificación del usuario.
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * Establece el registro de efectivo del usuario.
     *
     * @param cashRegister El registro de efectivo del usuario.
     */
    public void setCashRegister(String cashRegister) {
        this.cashRegister = cashRegister;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param id El ID del usuario.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password La contraseña del usuario.
     */
    public void setPassword(String password) {
        this.password = hashPassword(password);
    }

    /**
     * Establece el rol del usuario.
     *
     * @param rol El rol del usuario.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El nombre de usuario.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Obtiene el ID del usuario.
     *
     * @return El ID del usuario.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Obtiene el rol del usuario.
     *
     * @return El rol del usuario.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Obtiene la identificación del usuario.
     *
     * @return La identificación del usuario.
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el registro de efectivo del usuario.
     *
     * @return El registro de efectivo del usuario.
     */
    public String getCashRegister() {
        return cashRegister;
    }

    // Métodos
    /**
     * Genera un hash de la contraseña utilizando el algoritmo SHA-256.
     *
     * @param password La contraseña a hashear.
     * @return La contraseña hasheada.
     */
    public String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = digest.digest(password.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /**
     * Crea un nombre de usuario basado en el nombre del usuario.
     */
    public void createUserName() {
        String[] partsName = name.split(" ");
        String temp = (rol.equals("Administrador") ? "AD" : "CR") + "";
        Random random = new Random();
        for (String text : partsName) {
            temp += text.substring(0, text.length() - random.nextInt(1, text.length() - 1));
        }
        System.out.println(temp);
        userName = temp;
    }

    // Convertidores
    /**
     * Convierte el usuario en un documento BSON para su almacenamiento en una
     * base de datos.
     *
     * @return El documento BSON.
     */
    public Document convert() {
        return new Document().append("UserName", userName)
                .append("Name", name)
                .append("Identification", identification)
                .append("Rol", rol)
                .append("CashRegister", rol.equals("Administrador") ? null : cashRegister)
                .append("Password", password);
    }
}
