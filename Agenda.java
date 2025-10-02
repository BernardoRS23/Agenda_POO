package agenda;
import java.util.HashMap;
import java.util.Set;

public class Agenda {
    
    private HashMap <String, Contato> contatos;
    
    public Agenda() {
        this.contatos = new HashMap<>();
    }
    
    public boolean adicionarItem(Contato x) {
        if(contatos.containsKey(x.getNome())) {
            return false;
        } else {
            contatos.put(x.getNome(), x);
            return true;
        }
    }
    
    public boolean removerItem(String nome) {
        if(contatos.containsKey(nome)) {
            return false;
        } else {
            contatos.remove(nome);
            return true;
        }
    }
    
    public String listarAgenda() {
        String lista = "------ CONTATOS ------\n\n";
        
        Set<String> chave = contatos.keySet();
        for(String x: chave) {
            Contato y = contatos.get(x);
            lista += ("Nome: " + y.getNome() + "\nTelefone: " + y.getTelefone() + "\nEmail: " + y.getEmail() + "\nEndereco: " + y.getEndereco());
        }
        
        return lista;
    }
    
    public Contato pesquisarContato(String nome) {
        
    }
    
    public boolean editarContato(Contato x) {
        
    }
}
