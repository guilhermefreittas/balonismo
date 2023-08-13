public class Pessoa {
    public String Nome;
    public String Cpf;
    public String Rg;
    public String Tel;
    public String TelCtt;
    public String Endereco;


    //Constructor Pattern
    public Pessoa(){
        this.Nome = "Nome";
        this.Cpf = "Cpf";
        this.Rg = "Rg";
        this.Tel = "Telefone";
        this.TelCtt = "Telefone de contato";
        this.Endereco = "Endereço";
    }

    //Custom Constructor
    public Pessoa(String Nome, String Cpf,String Rg,String Tel,String TelCtt,String Endereco){
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Rg = Rg;
        this.Tel = Tel;
        this.TelCtt = TelCtt;
        this.Endereco = Endereco;
    }

    //My Custom Constructor
    public Pessoa(String Nome, String Endereco){
        this.Nome = Nome;
        this.Cpf = "";
        this.Rg = "";
        this.Tel = "";
        this.TelCtt = "";
        this.Endereco = Endereco;
    }



    //Encapsulamento
    //Get and Set - Nome
    public void setNome(String Nome){
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



    //Get and Set - Rg
    public void SetRg(String Rg){
        this.Rg = Rg;
    }
    public String getRg(){
        return Rg;
    }



    //Get and Set - Telefone
    public void SetTel(String Tel){
        this.Tel = Tel;
    }
    public String getTel(){
        return Tel;
    }



    //Get and Set - Telefone de Contato
    public void SetTelCtt(String TelCtt){
        this.TelCtt = TelCtt;
    }
    public String getTelCtt(){
        return TelCtt;
    }




    //Get and Set - Telefone de Contato
    public void SetEndereco(String Endereco){
        this.Endereco = Endereco;
    }
    public String getEndereco(){
        return Endereco;
    }





}
