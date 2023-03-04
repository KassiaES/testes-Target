package exerc3;

public class VendaDoDia {

    Integer dia;
    static double valor;

    public VendaDoDia(Integer dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public static double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "VendaDoDia{" +
                "dia=" + dia +
                ", valor=" + valor +
                '}';
    }
}
