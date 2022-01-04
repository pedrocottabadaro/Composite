import java.util.ArrayList;

public class Sargento extends Militar{
    ArrayList<Militar>militaresSubordinados;
    public Sargento(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public void addSupervisar(Militar militar) {
        militaresSubordinados.add(militar);

    }

    @Override
    public ArrayList<Militar> supervisar() {
        return this.militaresSubordinados;

    }
}
