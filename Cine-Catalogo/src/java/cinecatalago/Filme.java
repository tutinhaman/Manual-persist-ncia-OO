package cinecatalago;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "filmes")
public class Filme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titulo;
    private String diretor;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "ano_lancamento")
    private Calendar anoLancamento;
    
    private String genero;
    private int duracaoEmMinutos;
    
    @Column(columnDefinition="TEXT")
    private String sinopse;

    /**
     * Construtor vazio (obrigatório pelo JPA).
     */
    public Filme() {}

    /**
     * NOVO CONSTRUTOR: Adicionado para corresponder ao seu código de teste.
     * @param titulo O título do filme.
     * @param diretor O diretor do filme.
     * @param ano O ano de lançamento do filme.
     */
    public Filme(String titulo, String diretor, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        
        // Converte o ano (int) para o tipo Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, ano);
        // Define apenas o ano, mantendo dia e mês como padrão
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        this.anoLancamento = cal;
    }
    
    // Getters e Setters...
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }
    public Calendar getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(Calendar anoLancamento) { this.anoLancamento = anoLancamento; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public int getDuracaoEmMinutos() { return duracaoEmMinutos; }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) { this.duracaoEmMinutos = duracaoEmMinutos; }
    public String getSinopse() { return sinopse; }
    public void setSinopse(String sinopse) { this.sinopse = sinopse; }
}