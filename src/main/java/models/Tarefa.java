package models;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
public class Tarefa {
    private int id;
    private String nome;
    private String prioridade;
    private LocalDate dataVenciamento;
    private String status;
    private LocalDate dataConclusao;

    public Tarefa(int id, String nome, String prioridade, LocalDate dataVenciamento, String status, LocalDate dataConclusao, Projeto projeto, Projeto responsavel) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.dataVenciamento = dataVenciamento;
        this.status = status;
        this.dataConclusao = dataConclusao;
        this.projeto = projeto;
        this.responsavel = responsavel;
    }

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Projeto responsavel;

}
