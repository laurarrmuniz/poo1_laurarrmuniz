public class CD extends Item
{
    private String artista;

    public CD(String titulo, String tempoDuracao, String comentarios, String artista) {
        super(titulo, tempoDuracao, comentarios);
        this.artista = artista;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void print(){
        super.print();
        System.out.println("Artista: " + getArtista());
        System.out.println();
    }

}
