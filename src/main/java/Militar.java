import java.util.ArrayList;

public abstract class Militar {
    public String nome;
    public float Salario;

    public Militar(String nome, float salario) {
        this.nome = nome;
        Salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public abstract void addSupervisar(Militar militar);
    public  abstract ArrayList<Militar>supervisar();


}
