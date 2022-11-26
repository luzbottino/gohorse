package br.com.estabulo.dto;

public class AlunoDTO {

    private String nome;
    private Integer matricula;
    private Integer creditos;
    private String curso;

    public AlunoDTO(String nome, Integer matricula, Integer creditos, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.creditos = creditos;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public String getCurso() {
        return curso;
    }
}
