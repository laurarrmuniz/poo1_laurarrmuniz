public class Main {
    public static void main(String args[]) {

        //sem parametros
        C1 func1 = new C1();
        func1.mostrar_atributos();

        //com parametros
        C1 func2 = new C1("João", 151, "João Naves, 1500");
        func2.mostrar_atributos();
        func2.mostrar_atributos_super();

        //sem parametros
        C2 func3 = new C2();
        func3.mostrar_atributos();

        //com parametros
        C2 func4 = new C2("José",31528, " João Naves, 1502","03/06/1999", "0225", "25/09/2022");
        func4.mostrar_atributos();
        func4.mostrar_atributos_super();

        //sem parametros
        C3 func5 = new C3();
        func5.mostrar_atributos();

        //com parametros
        C3 func6 = new C3("07h30",0203, " 18h30","23/06/02", "0226",
                "26/10/2022", "Maria", 15128, "João Naves, 1503");
        func6.mostrar_atributos();
        func6.mostrar_atributos_super();

    }
}
