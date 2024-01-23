package aulaheranca;

import javax.swing.JOptionPane;

public class AulaHeranca {

    public static void main(String[] args) {
        //instancia da superclasse Pessoa
        Pessoa p = new Pessoa(); 
        p.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Pessoa")));
        p.setNome(JOptionPane.showInputDialog("Informe o nome da Pessoa"));
        JOptionPane.showMessageDialog(null, "Pessoa: "+p.getId()+"\nNome: "+p.getNome());
        //instancia da subclasse PessoaFisica
        PessoaFisica pf = new PessoaFisica();
        pf.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da P. Física")));
        pf.setNome(JOptionPane.showInputDialog("Informe o nome da P. Física"));
        pf.setCpf(JOptionPane.showInputDialog("Informe o CPF da P. Física"));
        pf.setSexo(JOptionPane.showInputDialog("Informe o gênero da P. Física"));
        //mostra os dados na tela
        JOptionPane.showMessageDialog(null, "Pessoa: "+pf.getId()+
                "\nNome: "+pf.getNome()+
                "\nGênero: "+pf.getSexo()+
                "\nCPF: "+pf.getCpf());
        
        
    }
    
}
