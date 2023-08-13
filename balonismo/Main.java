public class Main {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Piloto piloto = new Piloto();
        Balao balao = new Balao();

        pessoa1.setNome("Guilherme");
        pessoa1.SetCpf("43336182824");
        pessoa1.SetRg("547179650");
        pessoa1.SetTel("11984873121");
        pessoa1.SetTelCtt("11965612495");
        pessoa1.SetEndereco("Rua cafelândia Nº494");

        pessoa2.setNome("Guilhermina");
        pessoa2.SetCpf("5222729395");
        pessoa2.SetRg("457179650");
        pessoa2.SetTel("11984873122");
        pessoa2.SetTelCtt("11965612496");
        pessoa2.SetEndereco("Rua chalândia Nº949");

        piloto.setNome("Tonhão");
        piloto.SetCpf("99999999999");
        piloto.SetNregistro("13");

        balao.setId("222");
        balao.setRegistro("55555");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
        System.out.println(piloto.getNome());
        System.out.println();


    }
}
