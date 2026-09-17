package ao.MizTec.AppGestaoEscolar2.alunoResponsavel.Entity;

import ao.MizTec.AppGestaoEscolar2.aluno.Entity.Aluno;
import ao.MizTec.AppGestaoEscolar2.responsavel.Entity.Responsavel;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "aluno_responsavel")
public class AlunoResponsavel {

    @EmbeddedId
    private AlunoResponsavelId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idAluno")
    @JoinColumn(name = "id_aluno", nullable = false)
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idResponsavel")
    @JoinColumn(name = "id_responsavel", nullable = false)
    private Responsavel responsavel;

    @Column(name = "parentesco", nullable = false,length = 50)
    private String parentesco;

    @Column(name = "responsavel_financeiro", nullable = false)
    private boolean responsavelFinanceiro;

    @Column(name = "responsavel_pedagogico", nullable = false)
    private boolean responsavelPedagogico;

    @Column(name = "autorizado_retirar", nullable = false)
    private boolean autorizadoRetirar;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    public AlunoResponsavel() {
    }

    public AlunoResponsavel(Aluno aluno, Responsavel responsavel, String parentesco, boolean responsavelFinanceiro,
                            boolean responsavelPedagogico, boolean autorizadoRetirar, LocalDate dataInicio, LocalDate dataFim) {
        this.aluno = aluno;
        this.responsavel = responsavel;
        this.parentesco = parentesco;
        this.responsavelFinanceiro = responsavelFinanceiro;
        this.responsavelPedagogico = responsavelPedagogico;
        this.autorizadoRetirar = autorizadoRetirar;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public AlunoResponsavelId getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public String getParentesco() {
        return parentesco;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public boolean isResponsavelFinanceiro() {
        return responsavelFinanceiro;
    }

    public boolean isResponsavelPedagogico() {
        return responsavelPedagogico;
    }

    public boolean isAutorizadoRetirar() {
        return autorizadoRetirar;
    }

    // Métodos de alteração

    public void alterarParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void definirResponsavelFinanceiro(boolean responsavelFinanceiro) {
        this.responsavelFinanceiro = responsavelFinanceiro;
    }

    public void definirResponsavelPedagogico(boolean responsavelPedagogico) {
        this.responsavelPedagogico = responsavelPedagogico;
    }

    public void definirAutorizadoRetirar(boolean autorizadoRetirar) {
        this.autorizadoRetirar = autorizadoRetirar;
    }

    public void alterarDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
