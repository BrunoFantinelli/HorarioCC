/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarioscc;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cliente
 */
public class Controle {
    
   // public Controle(){
        
        ArrayList<Disciplina> disciplinas;
        
        //Professores
        Professor bruno = new Professor("Bruno");
        Professor maisa = new Professor("Maisa");
        Professor mauricio = new Professor("Maurício");
        Professor cristiane = new Professor("Cristiane");
        Professor glauco = new Professor("Glauco");
        Professor ailton = new Professor("Ailton");
        Professor fernando = new Professor("Fernando");
        Professor carlos = new Professor("Carlos");
        Professor dellamura = new Professor("Dellamura");
        Professor tamara = new Professor("Tamara");
        Professor merlin = new Professor("Merlin");
        Professor hasegawa = new Professor("Hasegawa");
        Professor thiago = new Professor("Thiago");
        Professor luiz = new Professor("Luiz Renato");
        Professor menolli = new Professor("Menolli");
        Professor ricardo = new Professor("Ricardo");
        Professor daniela = new Professor("Daniela");
        Professor fabio = new Professor("Fabio");
        Professor biluka = new Professor("Biluka");
        
        
        
        
        //Primeiro Ano
        
        Disciplina calculo1 = new Disciplina("Cálculo 1",4, false, maisa);
        Disciplina comunicacaoExpressao = new Disciplina("Comunicação e Expressão",4, false, maisa);
        Disciplina programacao1 = new Disciplina("Programação 1",4, true, bruno);
        Disciplina sistemasDigitais = new Disciplina("Sistemas Digitais",4, true, mauricio);
        Disciplina sociologia = new Disciplina("Sociologia",4, false, cristiane);
        Disciplina teoriaPratica = new Disciplina("Teoria e Prática",2, false, glauco);
        Disciplina introducaoCC = new Disciplina("Introdução a CC",2, false, ailton);
        Disciplina matematicaDiscreta = new Disciplina("Matemática Discreta",3, true, fernando);
        Disciplina administracao = new Disciplina("Administração",2, false, carlos);
        Disciplina computadorSociedade = new Disciplina("Computador e Sociedade",4, false, mauricio);
        
        //Segundo Ano
        Disciplina teoriaComputacao = new Disciplina("Teoria da Computação",4, true, dellamura);
        Disciplina calculo2 = new Disciplina("Cálculo 2",4, false, maisa);
        Disciplina estruturaDados = new Disciplina("Estrutura de Dados",4, true, tamara);
        Disciplina metodologiaPesquisa = new Disciplina("Metodologia e Pesquisa",4, false, tamara);
        Disciplina programacao2 = new Disciplina("Programação 2",4, true, merlin);
        Disciplina algebraLinear = new Disciplina("Algebra Linear",4, false, maisa);
        Disciplina fisica = new Disciplina("Física",3, true, hasegawa);
        Disciplina arquiteturaComputadores = new Disciplina("Arquitetura de Computadores",2, true, thiago);
        Disciplina engenhariaSoftware = new Disciplina("Engenharia de Software",4, true, mauricio);
        Disciplina estatistica = new Disciplina("Probabilidade e Estatica",4, false, luiz);
        
        //Terceiro Ano
        Disciplina engenhariaSoftware2 = new Disciplina("Engenharia de Software 2",3, true, menolli);
        Disciplina LinguagensProgamacao = new Disciplina("Linguagens de Programação",4, true, bruno);
        Disciplina bancoDados = new Disciplina("Banco de Dados",4, true, ailton);
        Disciplina compiladores = new Disciplina("Compiladores",4, true, dellamura);
        Disciplina sistemasOperacionais = new Disciplina("Sistemas Operacionais",4, false, thiago);
        Disciplina redes = new Disciplina("Redes",4, false, ricardo);
        Disciplina inteligenciaArtificial = new Disciplina("Inteligência Artificial",4, true, glauco);
        Disciplina projetoAnalise = new Disciplina("Projeto Análise de Algoritmo",2, true, bruno);
        
        //Quarto Ano
        Disciplina empreendedorismo = new Disciplina("Empreendedorismo",2, false, carlos);
        Disciplina gerenciamentoProjeto = new Disciplina("Prática de Gerenciamento de Projeto",4, false, daniela);
        Disciplina interfaceHomemMaquina = new Disciplina("Interface Homem Máquina",4, true, thiago);
        Disciplina sistemasDistribuidos = new Disciplina("Sistemas Distribuidos",4, true, ricardo);
        Disciplina computacaoGrafica = new Disciplina("Computação Gráfica",4, true, dellamura);
        Disciplina engenhariaSoftware3 = new Disciplina("Engenharia de Software 3",2, true, fabio);
        Disciplina segurancaAuditoria = new Disciplina("Segurança Auditoria",4, false, biluka);
        Disciplina computacaoSimbolica = new Disciplina("Computação Símbolica",4, false, fernando);
        Disciplina informaticaEducacao = new Disciplina("Informática e Educação",4, false, fabio);
        
    //}
    public Controle()
    {
        disciplinas = new ArrayList();
        disciplinas.add(calculo1);
        disciplinas.add(comunicacaoExpressao);
        disciplinas.add(programacao1);
        disciplinas.add(sistemasDigitais);
        disciplinas.add(sociologia);
        disciplinas.add(teoriaPratica);
        disciplinas.add(introducaoCC);
        disciplinas.add(matematicaDiscreta);
        disciplinas.add(administracao);
        disciplinas.add(computadorSociedade);
        disciplinas.add(teoriaComputacao);
        disciplinas.add(calculo2);
        disciplinas.add(estruturaDados);
        disciplinas.add(metodologiaPesquisa);
        disciplinas.add(programacao2);
        disciplinas.add(algebraLinear);
        disciplinas.add(fisica);
        disciplinas.add(arquiteturaComputadores);
        disciplinas.add(engenhariaSoftware);
        disciplinas.add(estatistica);
        disciplinas.add(engenhariaSoftware2);
        disciplinas.add(LinguagensProgamacao);
        disciplinas.add(bancoDados);
        disciplinas.add(compiladores);
        disciplinas.add(sistemasOperacionais);
        disciplinas.add(redes);
        disciplinas.add(inteligenciaArtificial);
        disciplinas.add(projetoAnalise);
        disciplinas.add(empreendedorismo);
        disciplinas.add(gerenciamentoProjeto);
        disciplinas.add(interfaceHomemMaquina);
        disciplinas.add(sistemasDistribuidos);
        disciplinas.add(computacaoGrafica);
        disciplinas.add(engenhariaSoftware3);
        disciplinas.add(segurancaAuditoria);
        disciplinas.add(computacaoSimbolica);
        disciplinas.add(informaticaEducacao);
        
    }
        
        
    public void buscarVazio(Disciplina grade[][][], int ano )
    {
        for(int i = 0; i < 8; i++) 
        {
            for(int j = 0; j < 5; j++)
            {
                if(checarCargaHoraria(ano) == true)
                {
                    if(grade[i][j][ano -1].nome == "Vazio")
                    {
                    atribuirHora(grade, i, j, ano-1);
                    } 
                }
                else
                {
                    
                    break;
                }

            }
        }
            
    }
    
    public int selecionarDisciplina(int ano)
    {
        Random rand = new Random();
        int numero = 0;
        if (ano == 1)
        {
            numero = rand.nextInt(10);
        }
        else if (ano == 2)
        {
            numero = 10 + rand.nextInt(12);
        }
        else if (ano == 3)
        {
            numero = 22 + rand.nextInt(8);
        }
        else if (ano == 4)
        {
            numero = 30 + rand.nextInt(7);
        }
        
        /*switch(numero){
            case 0:
                return calculo1;
            case 1:
                return comunicacaoExpressao;
            case 2:
                return programacao1;
            case 3:
                return sistemasDigitais;
            case 4:
                return sociologia;
            case 5:
                return teoriaPratica;
            case 6:
                return introducaoCC;
            case 7:
                return matematicaDiscreta;
            case 8:
                return administracao;
            case 9:
                return computadorSociedade;
            case 10:
                return teoriaComputacao;
            case 11:
                return calculo2;
            case 12:
                return estruturaDados;
            case 13:
                return metodologiaPesquisa;
            case 14:
                return programacao2;
            case 15:
                return algebraLinear;
            case 16:
                return fisica;
            case 17:
                return arquiteturaComputadores;
            case 18:
                return engenhariaSoftware;
            case 19:
                return estatistica;
            case 20:
                return engenhariaSoftware2;
            case 21:
                return LinguagensProgamacao;
            case 22:
                return bancoDados;
            case 23:
                return compiladores;
            case 24:
                return sistemasOperacionais;
            case 25:
                return redes;
            case 26:
                return inteligenciaArtificial;
            case 27:
                return projetoAnalise;
            case 28:
                return empreendedorismo;
            case 29:
                return gerenciamentoProjeto;
            case 30:
                return interfaceHomemMaquina;
            case 31:
                return sistemasDistribuidos;
            case 32:
                return computacaoGrafica;
            case 33:
                return engenhariaSoftware3;
            case 34:
                return segurancaAuditoria;
            case 35:
                return computacaoSimbolica;
            case 36:
                return informaticaEducacao; 
        }*/
        return numero;
    }
    
    
    
    public void atribuirHora(Disciplina grade[][][],int posX, int posY, int posZ)
    {
        int num;
        boolean pass = true;
        do
        {
           pass = true;
           num = selecionarDisciplina(posZ +1);
           if(disciplinas.get(num).professor.carga_horaria[posY] == 0)
           {
               pass = false;
               System.out.println("Carga de Professor estourada!");
           }
           if(disciplinas.get(num).cargaHoraria == 0)
           {
               pass = false;
               if(checarCargaHoraria(posZ+1) == false)
                   break;

           }

           
        }while(pass == false);

        if (pass == true)
        {
            disciplinas.get(num).cargaHoraria--;
            disciplinas.get(num).professor.carga_horaria[posY]--;
            grade[posX][posY][posZ] = disciplinas.get(num);
        }

    }
    
    public boolean checarCargaHoraria(int ano)
    {
        boolean disponivel = false;
        if ( ano == 1)
        {
            for(int i = 0; i < 10; i++)
            {
                if (disciplinas.get(i).cargaHoraria != 0)
                {
                    System.out.println("Disciplina " + disciplinas.get(i).nome + " possui vagas!");
                    disponivel = true;                  
                }
            }
        }
        if ( ano == 2)
        {
            for(int i = 11; i < 22; i++)   
            {
                if (disciplinas.get(i).cargaHoraria != 0)
                {
                    System.out.println("Disciplina " + disciplinas.get(i).nome + " possui vagas!");
                    disponivel = true;                  
                }
            }
        }
        if ( ano == 3)
        {
            for(int i = 23; i < 30; i++)
            {
                if (disciplinas.get(i).cargaHoraria != 0)
                {
                    System.out.println("Disciplina " + disciplinas.get(i).nome + " possui vagas!");
                    disponivel = true;                  
                }
            }
        }
        if ( ano == 4)
        {
            for(int i = 31; i < 37; i++)
            {
                if (disciplinas.get(i).cargaHoraria != 0)
                {
                    System.out.println("Disciplina " + disciplinas.get(i).nome + " possui vagas!");
                    disponivel = true;                  
                }
            }
        }
        if (disponivel == false)
        {
            System.out.println("Todos Ocupados!");
        }
        return disponivel;
    }
    
    
}
