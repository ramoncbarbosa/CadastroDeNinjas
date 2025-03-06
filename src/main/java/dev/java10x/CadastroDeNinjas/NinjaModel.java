package dev.java10x.CadastroDeNinjas;
import jakarta.persistence.*;

//Entity transformar uma class em uma entidade do banco de dados
@Entity
//Table
@Table(name = "tb_cadastro")
public class NinjaModel {
    //definindo o primeiro dado logo abaixo da anotação como id
    @Id
    //definindo como quero gerar o id, a lógica para gerar o id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
