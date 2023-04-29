import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private String disciplina;
    private boolean ativo;
    private List inscricoes;

    public Turma(String codigo, String disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.ativo = ativo;
        this.inscricoes = new ArrayList<>();
    }

    public void addInscricao(Inscricao inscricao) {
        this.inscricoes.add(inscricao);
    }

    //Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }
}