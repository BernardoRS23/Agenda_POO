package agenda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner entrada = new Scanner(System.in);

        while (true) { 
            int escolhaMenu = 0;
            String nome = "";
            String telefone = "";
            String endereco = "";
            String email = "";
            
            System.out.println("------AGENDA------\n01. Adicionar contato\n02. Remover contato\n03. Editar contato\n04. Listar contatos\n05. Pesquisar contato\n00. SAIR");
            escolhaMenu = entrada.nextInt();

            switch(escolhaMenu) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite o nome: ");
                    nome = entrada.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = entrada.nextLine();
                    System.out.println("Digite o endereco: ");
                    endereco = entrada.nextLine();
                    System.out.println("Digite o email: ");
                    email = entrada.nextLine();
                    
                    Contato x = new Contato(nome, endereco, telefone, email);

                    if(agenda.adicionarItem(x)) {
                        System.out.println("Contato adicionado!");
                    } else {
                        System.out.println("Erro ao adicionar o contato!");
                    }

                    break;
                case 2: 
                    System.out.println("Digite o nome: ");
                    nome = entrada.nextLine();
                    if(agenda.removerItem(nome)) {
                        System.out.println("Contato removido!");
                    } else {
                        System.out.println("Erro ao remover contato!");
                    }

                    break;
                case 3: 
                    System.out.println("Digite o nome do contato que você deve editar"); 
                    nome = entrada.nextLine();

                    System.out.println("Digite o novo telefone: ");
                    telefone = entrada.nextLine();
                    System.out.println("Digite o novo endereco: ");
                    endereco = entrada.nextLine();
                    System.out.println("Digite o novo email: ");
                    email = entrada.nextLine();

                    Contato x = new Contato(nome, endereco, telefone, email);

                    if(agenda.editarContato(x)) {
                        System.out.println("Contato alterado!");
                    } else {
                        System.out.println("Erro ao alterar contato!");
                    }

                    break;
                case 4:
                    agenda.listarAgenda();
                    break;
                case 5: 
                    System.out.println("Digite o nome do contato:"); 
                    nome = entrada.nextLine();

                    Contato x = agenda.pesquisarContato(nome);
                    System.out.println("Nome: " + x.getNome() + "\nTelefone: " + x.getTelefone() + "\nEmail: " + x.getEmail() + "\nEndereco: " + x.getEndereco());
                    
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    break;
            }

            if (escolhaMenu == 0) {
                break;
            }
        }
    }
    
}
