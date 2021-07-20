import Adolecente.moca;
import Adolecente.rapaz;
import Adulto.homem;
import Adulto.lgb;
import Adulto.mulher;
import Crianca.menina;
import Crianca.menino;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Questionario Aplicativo");
        System.out.println("=======================");
        System.out.println("                       ");

        // Primeiro nivel
               
        menino q1 = new menino();
       
        menina q2 = new menina();
        mulher q3 = new mulher();
        lgb    q4 = new lgb();
        homem  q5 = new homem();
        rapaz  q6 = new rapaz();
        moca   q7 = new moca();
        
        
        // Segundo nivel
        menino q11 = new menino();
        menina q21 = new menina();
        mulher q31 = new mulher();
        lgb    q41 = new lgb();
        homem  q51 = new homem();
        rapaz  q61 = new rapaz();
        moca   q71 = new moca();
        
        // Terceiro nivel
        //menino q12 = new menino();
        //menina q22 = new menina();
        mulher q32 = new mulher();
        //lgb    q42 = new lgb();
        homem  q52 = new homem();
        rapaz  q62 = new rapaz();
        moca   q72 = new moca();

        q1.meninoPueril();
        q11.meninoPuberdade();
        //q12.
        q2.meninaPueril();
        q21.meninaPuberdade();
        //q22.

        q3.mulherJovem();
        q31.mulherJovem();
        q32.senhora();

        q4.jovemPuerilLgb();
        q41.jovemLgb();
        //q42.

        q5.homemJovem();
        q51.homemJovem();
        q52.senhor();

        q6.rapazinho();
        q61.rapazJovem();
        q62.rapagao();

        q7.mocinha();
        q71.deputante();
        q72.senhorita();
        
    }
}
