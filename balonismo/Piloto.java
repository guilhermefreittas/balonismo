public class Piloto {

    public String Nome;
    public String Cpf;
    public String Nregistro;

  //Constructor Pattern
    public Piloto(){
        this.Nome = "Francicsco";
        this.Cpf = "56281037180";
        this.Nregistro = "6583";
    }

    //Custom Constructor
    public Piloto(String Nome, String Cpf, String Nregistro){
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Nregistro = Nregistro;
    }

    //My custom Constructor
    public Piloto(String nome){
        this.Nome = "Guillermo";
        this.Cpf = "25155184267";
        this.Nregistro = "240806";
    }

    //Encapsulamento
    //Get and Set - Nome
    public void setNome(String nome){
        this.Nome = Nome;
    }
    public String getNome(){
        return Nome;
    }


    //Get and Set - Cpf
    public void SetCpf(String Cpf){
        this.Cpf = Cpf;
    }
    public String getCpf(){
        return Cpf;
    }



    //Get And Set - Registro
    public void SetNregistro(String Nregistro){
        this.Nregistro = Nregistro;
    }
    public String getNregistro(){
        return Nregistro;
    }
}
