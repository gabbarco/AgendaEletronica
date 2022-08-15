import java.util.ArrayList;
import java.util.Scanner;

public class ExAgenda {
    public static void main(String[] args) {
        String nome, cpf, sexo, nacionalidade, estadoCivil, email, telefone;
        int idade;
        int op;
        ArrayList<Pessoa> listaPessoa;
        listaPessoa = new ArrayList();
        Scanner ent = new Scanner(System.in);
        Agenda agenda = new Agenda();
    
        do {
            System.out.println("1 - Cadastro");
            System.out.println("2 - Buscar Pessoa");
            System.out.println("3 - Excluir Pessoa");
            System.out.println("0 - Sair");
            op = ent.nextInt();
    
            if (op == 1) {
                ent.nextLine();
                System.out.print("Nome da Pessoa: ");
                nome = ent.next();
                System.out.print("CPF da Pessoa: ");
                cpf = ent.next();
                System.out.print("Idade da Pessoa: ");
                idade = ent.nextInt();
                System.out.println("Sexo da Pessoa: ");
                sexo = ent.next();
                System.out.println("Nacionalidade da Pessoa: ");
                nacionalidade = ent.next();
                System.out.println("Estado Civil da Pessoa: ");
                estadoCivil = ent.next();
                System.out.println("Email da Pessoa: ");
                email = ent.next();
                System.out.println("Telefone da Pessoa: ");
                telefone = ent.next();
                Pessoa pessoa = new Pessoa(nome, cpf, idade, sexo, nacionalidade, estadoCivil, email, telefone);
                agenda.AdicionarPessoa(nome, cpf, idade, sexo, nacionalidade, estadoCivil, email, telefone);
                System.out.println("\n** Contato Cadastrado **\n");
            } else if (op == 2) {
    
                agenda.BuscarPessoa();
                System.out.println("\n");
            } 
            else if (op == 3) {
                agenda.RemoverPessoa();
            } 
        }
        while (op != 0); {}
}
}

