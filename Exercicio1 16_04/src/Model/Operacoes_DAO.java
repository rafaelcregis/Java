// 1) Solicite tres valores reais , obtenha a media e faça a seguinte comparação
//  nota < que 5  : Mensagem "Média I"
//  nota entre  5 e 6.9  : Mensagem "Média R"
//  nota entre  7 e 8.9  : Mensagem "Média B"
//  nota entre  9 e 10  : Mensagem "Média MB"
package Model;

    import javax.swing.JOptionPane;
   

public class Operacoes_DAO {
    public static double v1=0, v2=0, v3=0, media=0,res=0;
    public static String x="";
    
    public static void media(){
       
       x = JOptionPane.showInputDialog(null,"Digite o primeiro valor");
       v1 = Double.parseDouble(x);
       x = JOptionPane.showInputDialog(null,"Digite o segundo valor");
       v2 = Double.parseDouble(x);
       x = JOptionPane.showInputDialog(null,"Digite o terceiro valor");
       v3 = Double.parseDouble(x);
       
       media = (v1+v2+v3)/3;
                   
 
    while(media<5){
         JOptionPane.showMessageDialog(null, "Média I");
         }if(media>=5 && media<7){
             JOptionPane.showMessageDialog(null, "Média R");
             }else if(media>=7 && media<9){
                 JOptionPane.showMessageDialog(null, "Média B");
                }else if(media>=9 && media<=10){
                    JOptionPane.showMessageDialog(null, "Média MB");               
        }
    }

 }