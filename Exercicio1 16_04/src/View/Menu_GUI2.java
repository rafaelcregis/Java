// 2) Receba a idade do usuário e faça as seguintes perguntas: Você Fuma? Você Bebe? Você perde noites de Sono? 
//  Logo após subtraia a idade do usuário de 65 (que é a idade média de uma pessoa) e o provavel restante de anos de vida.
//  Se o usuário disser sim a primeira pergunta , subtraia do tempo restante  5 
//  Se o usuário disser sim a segunda pergunta , subtraia do tempo restante  7
//  Se o usuário disser sim a terceira pergunta , subtraia do tempo restante  6
 
//  Se o tempo que sobrar for < 3  : Mensagem : "Você tem " + Tempo de vida + "anos  de vida e esta com o Pé na Cova"
 
//  Se o tempo que sobrar estiver entre 4 e 10  :Você tem " + Tempo de vida+ "anos  de vida Cuidade , vc esta com um pé na cova"
 
//  Se o tempo que sobrar estiver entre 11 e 20 :Você tem " + Tempo de vida + "anos  de vida  Durma mais , pare de fumar e manere no alcool"

//  Se o tempo que sobrar estiver acima de 20  :"Você tem " + Tempo de vida + "anos  de vida E isso ai continue assim"

package View;

import javax.swing.JOptionPane;


public class Menu_GUI2 {
    
public static void Tela(){
         
        int op =0;
        String x ="";
                
        while(op !=3 ){
            
         x = JOptionPane.showInputDialog(null, "Escolha a operação\n1-Exercicio 1\n2-Exercicio 2\n3-Sair");
         op = Integer.parseInt(x);
            
         switch(op){
             
             case 1 :
                 Model.Operacoes_DAO.media();
                 break;
             case 2 :
                 Model.Operacoes_DAO.media();
                 break;          
             case 3 :
                JOptionPane.showMessageDialog(null," Saindo do sistema..." ); 
                break;
             default :
                JOptionPane.showMessageDialog(null," Opção Inválida" );
                break;
         }   
            
        }
        
        
        
    } 
    
    
}
