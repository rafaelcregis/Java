// 1) Solicite tres valores reais , obtenha a media e faça a seguinte comparação
//  nota < que 5  : Mensagem "Média I"
//  nota entre  5 e 6.9  : Mensagem "Média R"
//  nota entre  7 e 8.9  : Mensagem "Média B"
//  nota entre  9 e 10  : Mensagem "Média MB"
package View;

import javax.swing.JOptionPane;

public class Menu_GUI {
    
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