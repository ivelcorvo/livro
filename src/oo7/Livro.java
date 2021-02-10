package oo7;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //metodos publicos

    
    public String detalhes() {
        return "Livro{" + "\ntitulo= " + titulo + ",\n autor= " + autor + ",\n totPag= " + totPag + ",\n aberto= " + aberto + ", \npag atual= "+ pagAtual + 
                ",\n leitor= " + getLeitor().getNome() +",\n idade= "+ getLeitor().getIdade()+",\n sexo= "+leitor.getSexo()+ '}';
    }
    
    
    
    //construtor
    
    public Livro(String titulo, String autor, int totPag, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPag(totPag);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }
    
    //setter and gatters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //metodos implementados

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.setPagAtual(p);
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
    
}
