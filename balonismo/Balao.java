public class Balao {

    public String Id;
    public String Registro;

    //Constructor pattern
    public Balao() {
        this.Id = "Id";
        this.Registro = "Registro";
    }

    //custom Constructor
    public Balao(String Id, String Registro) {
        this.Id = Id;
        this.Registro = Registro;
    }

    //my custom Constructor
    public Balao(String Id) {
        this.Id = "929";
        this.Registro = "3456789";
    }

    //Encapsulamento
    //Get and Set - Id
    public void setId(String Id){
        this.Id = Id;
    }
    public String getId(){
        return Id;
    }

    //get and set - registro
    public void setRegistro(String Registro){
        this.Registro = Registro;
    }
    public String getRegistro(){
        return Registro;
    }


}

