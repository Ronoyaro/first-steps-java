package com.ronoyaro.javacore.associacao.associacaoExercicio.teste;

import com.ronoyaro.javacore.associacao.associacaoExercicio.dominio.Aluno;
import com.ronoyaro.javacore.associacao.associacaoExercicio.dominio.Local;
import com.ronoyaro.javacore.associacao.associacaoExercicio.dominio.Professor;
import com.ronoyaro.javacore.associacao.associacaoExercicio.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ronald", 27);
        Aluno aluno2 = new Aluno("José", 25);

        Aluno[] alunos = new Aluno[]{aluno1, aluno2};

        Local local = new Local("Campus Lapa");
        Local local2 = new Local("Campus Tancredo Neves");

        Seminario seminario2 = new Seminario("Modelagem de Software", alunos, local2);
        Seminario seminario1 = new Seminario("Introdução ao Java", alunos, local);

        Seminario[] seminarios = new Seminario[]{seminario1, seminario2};

        Professor professor1 = new Professor("Adailton", "Palestrante", seminarios);
        Professor professor2 = new Professor("Alan Tiago", "Palestrante", seminarios);

        seminario1.setProfessor(professor1);
        seminario2.setProfessor(professor2);

        seminario1.imprime();
        System.out.println("------------------------");
        seminario2.imprime();

    }
}
