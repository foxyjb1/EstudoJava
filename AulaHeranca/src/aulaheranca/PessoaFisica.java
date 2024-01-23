package aulaheranca;
//extends - comando de ligacao entre subclasse e superclasse
public class PessoaFisica extends Pessoa{
    //atributos
    private String cpf;
    private String sexo;
    //metodos
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
