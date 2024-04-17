// 2) Receba a idade do usuário e faça as seguintes perguntas: Você Fuma? Você Bebe? Você perde noites de Sono? 
//  Logo após subtraia a idade do usuário de 65 (que é a idade média de uma pessoa) e o provavel restante de anos de vida.
//  Se o usuário disser sim a primeira pergunta , subtraia do tempo restante  5 
//  Se o usuário disser sim a segunda pergunta , subtraia do tempo restante  7
//  Se o usuário disser sim a terceira pergunta , subtraia do tempo restante  6
 
//  Se o tempo que sobrar for < 3  : Mensagem : "Você tem " + Tempo de vida + "anos  de vida e esta com o Pé na Cova"
 
//  Se o tempo que sobrar estiver entre 4 e 10  :Você tem " + Tempo de vida+ "anos  de vida Cuidade , vc esta com um pé na cova"
 
//  Se o tempo que sobrar estiver entre 11 e 20 :Você tem " + Tempo de vida + "anos  de vida  Durma mais , pare de fumar e manere no alcool"

//  Se o tempo que sobrar estiver acima de 20  :"Você tem " + Tempo de vida + "anos  de vida E isso ai continue assim"

package Model;

import javax.swing.JOptionPane;


public class Operacoes_DAO2 {
    public static int idade=0, fuma=0, bebe=0, sono=0, res=0;
    public static String x="";
    
    public static void idade(){
       
       x = JOptionPane.showInputDialog(null,"Digite a sua idade");
       idade = Integer.parseInt(x);
       x = JOptionPane.showInputDialog(null,"Você Fuma?\n1-Sim\n2-Não");
       fuma = Integer.parseInt(x);
       x = JOptionPane.showInputDialog(null,"Você Bebe?\n1-Sim\n2-Não");
       bebe = Integer.parseInt(x);
       x = JOptionPane.showInputDialog(null,"Você perde noites de Sono?\n1-Sim\n2-Não");
       sono = Integer.parseInt(x);
       
     res = 65 - idade - fuma - bebe - sono;            
 
    while(res<3){
         JOptionPane.showMessageDialog(null, "Você tem" + res + "anos  de vida e esta com o Pé na Cova");
         }if(res>=4 && res<=10){
             JOptionPane.showMessageDialog(null, "Você tem" + res + "anos  de vida. Cuidado, vc está com um pé na cova");
             }else if(res>=11 && res<=20){
                 JOptionPane.showMessageDialog(null, "Você tem" + res + "anos  de vida. Durma mais , pare de fumar e manere no álcool");
                }else if(res>20){
                    JOptionPane.showMessageDialog(null, "Você tem" + res + "anos  de vida. É isso ai continue assim");               
        }
    }
    
}
