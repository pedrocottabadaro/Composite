import java.util.ArrayList;

public class General extends Militar{
    ArrayList<Militar>militaresSubordinados;
    public General(String nome, float salario) {
        super(nome, salario);
        militaresSubordinados= new ArrayList<>();
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
