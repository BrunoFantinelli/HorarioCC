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
public class HorariosCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controle control = new Controle();
        Horario grade = new Horario();
        
        control.buscarVazio(grade.grade1, 4);
        control.buscarVazio(grade.grade1, 3);
        control.buscarVazio(grade.grade1, 2);
        control.buscarVazio(grade.grade1, 1);
        
        
        System.out.println(grade.toString(4));
        System.out.println(grade.toString(3));
        System.out.println(grade.toString(2));
        System.out.println(grade.toString(1));
        
    }
    
}
