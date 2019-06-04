/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author u17168
 */
public class Aluno {
    private String nome;
    private String RA;
    private String email;

    public Aluno(String RA, String nome, String Email) {
        this.nome = nome;
        this.RA = RA;
        this.email = Email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", RA=" + RA + ", Email=" + email + '}';
    }
    
}
