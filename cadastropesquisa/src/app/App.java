package app;

import Pesquisa4.Page4;
import pesquisa1.Page1;
import pesquisa2.Page2;
import pesquisa3.Page3;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aplicativo de Pesquisa");
        Page1 p1 = new Page1();
        Page2 p2 = new Page2();
        Page3 p3 = new Page3();
        Page4 p4 = new Page4();
        p1.pessoa();
        p2.imovel();
        p3.automovel();
        p4.servico();
    }
  
}
