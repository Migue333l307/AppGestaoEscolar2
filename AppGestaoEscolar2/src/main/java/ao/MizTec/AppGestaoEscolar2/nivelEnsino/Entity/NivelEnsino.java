package ao.MizTec.AppGestaoEscolar2.nivelEnsino.Entity;

import ao.MizTec.AppGestaoEscolar2.curso.Entity.Curso;
import jakarta.persistence.*;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "nivel_ensino")
public class NivelEnsino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nivel")
    private Long id;

    @OneToMany(mappedBy = "nivelEnsino")
    private List<Curso> cursos = new ArrayList<>();

    @Column(name = "nome", nullable = false, unique = true, length = 150)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "ordem", nullable = false)
    private Integer ordem;


    protected NivelEnsino() {
    }

    public NivelEnsino(String nome, String descricao, Integer ordem) {
        this.nome = nome;
        this.descricao = descricao;
        this.ordem = ordem;
    }

}
