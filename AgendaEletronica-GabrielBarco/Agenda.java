import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

ArrayList<Pessoa> listaPess;

public Agenda() {
    
    listaPess = new ArrayList<>();
}

void AdicionarPessoa(String nome, String cpf, int idade, String sexo, String nacionalidade, String estadoCivil, String email, String telefone) {

    Pessoa pes = new Pessoa(nome, cpf, idade, sexo, nacionalidade, estadoCivil, email, telefone);
    listaPess.add(pes);
}

void BuscarPessoa() {

    Scanner ent = new Scanner(System.in);
    String nomeBus;
    System.out.println("Buscar Pessoa por Nome: ");
    nomeBus = ent.next();
    Pessoa pessoaRetorno = null;
    for (Pessoa pessoa : listaPess) {
        if (pessoa.getNome().equalsIgnoreCase(nomeBus)) {
            pessoaRetorno = pessoa;
            break;
        }
    }
    if(pessoaRetorno != null) {
        System.out.println("Nome: " + pessoaRetorno.nome + "\nCPF: " + pessoaRetorno.cpf + "\nIdade: " + pessoaRetorno.idade + "\nSexo: " + pessoaRetorno.sexo + "\nNacionalidade: " + pessoaRetorno.nacionalidade + "\nEstado Civil: " + pessoaRetorno.estadoCivil + "\nEmail: " + pessoaRetorno.email + "\nTelefone: " + pessoaRetorno.telefone);
    }else {
        System.out.println("Sem Cadastro!");
    }
}

void RemoverPessoa() {

    Scanner ent = new Scanner(System.in);
    String nomeBus;
    System.out.println("Remover Pessoa por Nome: ");
    nomeBus = ent.next();
    Pessoa pessoaRetorno = null;
    for (Pessoa pessoa : listaPess) {
        if (pessoa.getNome().equalsIgnoreCase(nomeBus)) {
            pessoaRetorno = pessoa;
            break;
        }
    }
    if(pessoaRetorno != null) {
        listaPess.remove(pessoaRetorno);
        System.out.println("Pessoa removida! \n");
    }else {
        System.out.println("Pessoa não encontrada! \n");
    }
    }
}