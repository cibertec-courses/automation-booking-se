package pe.edu.cibertec.booking.models;

public enum Habitacion {
    SINGLE(1),
    DOUBLE(2),
    SUITE(3);

    private int id;
    Habitacion(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
