package projects.grocery.store.enumertaion;

public enum Quantity {
    QUANTITY(86);
    private final int quantity;

    Quantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
    public int setQuantity() {
        return this.quantity;
    }
}
