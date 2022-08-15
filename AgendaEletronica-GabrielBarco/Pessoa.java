public class Pessoa {
    public String nome;
    public String cpf;
    public int idade;
    public String sexo;
    public String nacionalidade;
    public String estadoCivil;
    public String email;
    public String telefone;

    public Pessoa() {}
    
    public Pessoa(String nome, String cpf, int idade, String sexo, String nacionalidade, String estadoCivil, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo ) {
        this.sexo = sexo;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade ) {
        this.nacionalidade = nacionalidade;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
