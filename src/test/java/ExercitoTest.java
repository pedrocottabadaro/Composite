import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class ExercitoTest {

    @Test
    void deveRetornarExercito(){
        General general = new General("Matheys",10000);
        Sargento sargentoExperiente= new Sargento("Joaquin",8000);
        Sargento sargentoNovato= new Sargento("Felipe",6000);
        general.addSupervisar(sargentoExperiente);
        general.addSupervisar(sargentoNovato);

        Exercito exercito = new Exercito();
        exercito.setGeneral(general);
        ArrayList<Militar>subordinadosGeneral=general.supervisar();
        assertEquals("Joaquin",subordinadosGeneral.get(0).getNome());
        assertEquals("Felipe",subordinadosGeneral.get(1).getNome());
    }

    @Test
    void deveRetornarExercitoSemGerente(){
            Exercito exercito=new Exercito();
            assertEquals("Sem General", exercito.getNomeGeneral());
    }
}