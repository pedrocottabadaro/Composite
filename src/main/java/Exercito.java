public class Exercito {
    private General general;

    public void setGeneral(General general){
        this.general=general;
    }

    public String getNomeGeneral(){
        return (this.general!=null?this.general.getNome():"Sem General");
    }


}
