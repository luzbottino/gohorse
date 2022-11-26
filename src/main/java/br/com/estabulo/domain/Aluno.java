package br.com.estabulo.domain;

import javax.persistence.*;

@Entity
@Table(name = "ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="NOME", length=50, nullable=false)
    private String nome;
    @Column(name="MATRICULA", nullable=false)
    private Integer matricula;
    @Column(name="CREDITOS", nullable=false)
    private Integer creditos;
    @Column(name="CURSO", length=100, nullable=false)
    private String curso;

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
