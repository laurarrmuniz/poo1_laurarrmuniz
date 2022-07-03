public class DVD extends Item
{
    private String diretor;

    public DVD(String titulo, String tempoDuracao, String comentarios, String diretor) {
        super(titulo, tempoDuracao, comentarios);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
        System.out.println();
    }

    public void print(){
        super.print();
        System.out.println("Diretor: " + getDiretor());

    }

}
