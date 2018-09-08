/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarioscc;

import java.util.ArrayList;

/**
 *
 * @author Cliente
 */
public class Professor 
{
    String nome;
    int carga_horaria[] = new int[5];
    
    
    public Professor(String nome)
    {
        this.nome = nome;
        for(int i = 0; i < 5; i++)
        {
            this.carga_horaria[i] = 8;
        }
                
    }
    
}
