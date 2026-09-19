package ao.MizTec.AppGestaoEscolar2.matricula.Entity;

import ao.MizTec.AppGestaoEscolar2.aluno.Entity.Aluno;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_aluno", nullable = false)
    private Aluno aluno;

    @Column(name = "numero_matricula", unique = true, length = 45)
    private String numeroMatricula;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    protected Matricula() {
    }

    public Matricula(Aluno aluno, String numeroMatricula, LocalDateTime dataCadastro) {
        this.aluno = aluno;
        this.numeroMatricula = numeroMatricula;
        this.dataCadastro = LocalDateTime.now();
    }


}
