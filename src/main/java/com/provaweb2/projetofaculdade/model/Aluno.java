package com.provaweb2.projetofaculdade.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private Long id;

    @NotEmpty(message = "Por favor, digite o nome do aluno.")
    @NotNull(message = "Por favor, digite o nome do aluno.")
    private String nome;

    @NotNull(message = "Por favor, insira a data de nascimento do aluno.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;

    private String sexo;

    @ManyToMany(mappedBy = "listarAlunos")
    private Set<Turma> listarTurmas;
}


