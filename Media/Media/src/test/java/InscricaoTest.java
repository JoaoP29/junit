import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InscricaoTest {
    private Aluno aluno;
    private Turma turma;
    private List notas1;
    private List notas2;
    private List notas3;
    private List notas4;
    private List notas5;
    private List notas6;
    private List notas7;
    private Inscricao inscricao1;
    private Inscricao inscricao2;
    private Inscricao inscricao3;
    private Inscricao inscricao4;
    private Inscricao inscricao5;
    private Inscricao inscricao6;
    private Inscricao inscricao7;

    @BeforeEach
    public void setUp() {
        aluno = new Aluno("123456789", "João");
        turma = new Turma("2022.1", "Matemática");
        notas1 = Arrays.asList(7.0, 7.0, 8.0);
        notas2 = Arrays.asList(5.0, 5.0, 4.0);
        notas3 = Arrays.asList(1.0, 1.0, 1.0);
        notas4 = Arrays.asList(9.0, 9.0, 0.0);
        notas5 = Arrays.asList(6.0, 5.0, 4.5);
        notas6 = Arrays.asList(2.0, 2.0, 1.0);
        notas7 = Arrays.asList(7.0, 7.0, 3.5);

        inscricao1 = new Inscricao(aluno, turma, notas1);
        inscricao2 = new Inscricao(aluno, turma, notas2);
        inscricao3 = new Inscricao(aluno, turma, notas3);
        inscricao4 = new Inscricao(aluno, turma, notas4);
        inscricao5 = new Inscricao(aluno, turma, notas5);
        inscricao6 = new Inscricao(aluno, turma, notas6);
        inscricao7 = new Inscricao(aluno, turma, notas7);
    }

    @Test
    void testAprovado() {
        assertEquals("Aprovado", inscricao1.getAprovacao());
    }

    @Test
    void testProvaFinal() {
        assertEquals("Prova Final", inscricao2.getAprovacao());
    }

    @Test
    void testReprovado() {
        assertEquals("Reprovado", inscricao3.getAprovacao());
    }

    @Test
    void testAprovadoFaltandoNota() {
        assertEquals("Aprovado", inscricao4.getAprovacao());
    }

    @Test
    void testProvaFinalRegra1() {
        assertEquals("Prova Final", inscricao5.getAprovacao());
    }

    @Test
    void testReprovadoRegra2() {
        assertEquals("Reprovado", inscricao6.getAprovacao());
    }

    @Test
    void testAprovadoRegra3() {
        assertEquals("Aprovado", inscricao7.getAprovacao());
    }
}