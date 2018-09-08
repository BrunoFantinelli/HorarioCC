/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarioscc;

/**
 *
 * @author Cliente
 */
public class Horario {
    
    Disciplina grade1[][][] = new Disciplina [8][5][4];
    Disciplina grade2[][][] = new Disciplina [8][5][4];
    
    public Horario()
    {
        Professor temp = new Professor("Vazio");
        Disciplina vazio = new Disciplina("Vazio", 4, false, temp);
        
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                for(int k = 0; k < 4;k++)
                {
                    grade1[i][j][k] = vazio;
                    grade2[i][j][k] = vazio;
                }
            }       
        }
    }
    
    public String toString(int ano)
    {
        String texto = "";
        
        for(int j=0; j<5; j++)
        {
            texto += "Dia da semana: " + j + "\n";
            for(int i = 0; i < 8; i++)
            {
                texto += "Horario " + i + " : " + grade1[i][j][ano-1].nome + "| Professor: " + grade1[i][j][ano-1].professor.nome +"\n";
            }
        }
        
        return texto;
    }
}
