public class Contato {
    private String name;
    private String phone;
    private TipoNumero numberType;

    public Contato(String name, String phone, TipoNumero numberType) {
        this.name = name;
        this.phone = phone;
        this.numberType = numberType;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public TipoNumero getNumberType() {
        return numberType;
    }
}
