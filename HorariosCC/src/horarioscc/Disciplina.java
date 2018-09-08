/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarioscc;


public class Disciplina {
    String nome;
    int cargaHoraria;
    boolean necessitaLab;
    Professor professor;
    
    public Disciplina(String nome, int cargaHoraria, boolean necessitaLab,Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.necessitaLab = necessitaLab;
        this.professor = professor;
    }
    
    
}
