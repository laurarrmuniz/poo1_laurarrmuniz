public class Item
{
    private String titulo, tempoDuracao, comentarios;

    public Item(String titulo, String tempoDuracao,String comentarios) {
        this.titulo = titulo;
        this.tempoDuracao = tempoDuracao;
        this.comentarios = comentarios;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getTempoDuracao() {
        return tempoDuracao;
    }


    public String getComentarios() {
        return comentarios;
    }


    public void print(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Tempo de Duração: " + getTempoDuracao());
        System.out.println("Cometários: " + getComentarios());
    }
}
