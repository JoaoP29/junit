import java.util.List;

public class Inscricao {
    private Aluno aluno;
    private Turma turma;
    private List<Double> notas;
    private double media;
    private String aprovacao;

    public Inscricao(Aluno aluno, Turma turma, List notas) {
        this.aluno = aluno;
        this.turma = turma;
        this.notas = notas;
        this.media = calcularMedia();
        this.aprovacao = calcularAprovacao();
    }

    private double calcularMedia() {
        double soma = 0.0;
        for (Double nota : this.notas) {
            soma += nota;
        }
        double media = soma / this.notas.size();
        media = arredondarMedia(media);
        return media;
    }

    private String calcularAprovacao() {
        if (this.media >= 6) {
            return "Aprovado";
        } else if (this.media >= 2 && this.media < 6) {
            return "Prova Final";
        } else {
            return "Reprovado";
        }
    }

    private double arredondarMedia(double media) {
        double parteDecimal = media - Math.floor(media);
        if (parteDecimal <= 0.25) {
            media = Math.floor(media);
        } else if (parteDecimal >= 0.26 && parteDecimal <= 0.75) {
            media = Math.floor(media) + 0.5;
        } else {
            media = Math.ceil(media);
        }
        return media;
    }

    //Getters e Setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List getNotas() {
        return notas;
    }

    public void setNotas(List notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(String aprovacao) {
        this.aprovacao = aprovacao;
    }
}