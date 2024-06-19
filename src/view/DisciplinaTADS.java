package view;

import classes.Disciplina;
import classes.DisciplinaLista;
import classes.SemestreLetivo;
import classes.SemestreLetivoLista;
import java.text.SimpleDateFormat;

public class DisciplinaTADS {

    public static DisciplinaLista listaD;
    public static SemestreLetivoLista listaSL;

    public static void main(String[] args) {
        try{
        listaD = new DisciplinaLista();
        listaSL = new SemestreLetivoLista();
        listaD.add(new Disciplina("Língua Inglesa I", "Débora", 30, 1));
        listaD.add(new Disciplina("Introdução à Informática", "Geison", 75, 1));
        listaD.add(new Disciplina("Língua Portuguesa", "Joseline", 45, 1));
        listaD.add(new Disciplina("Informática e Sociedade", "Daniel A.", 45, 1));
        listaD.add(new Disciplina("Lógica de Programação", "Daniel P.", 75, 1));
        listaD.add(new Disciplina("Matemática Discreta", "Anderson", 75, 1));

        listaD.add(new Disciplina("Língua Inglesa II", "Débora", 30, 2));
        listaD.add(new Disciplina("Engenharia de Software", "Geison", 45, 2));
        listaD.add(new Disciplina("Informática e Sociedade", "Leandro", 30, 2));
        listaD.add(new Disciplina("Estatística e Álgebra Booleana", "Josiane S.", 45, 2));
        listaD.add(new Disciplina("Linguagem de Programação I", "Daniel P.", 75, 2));
        listaD.add(new Disciplina("Arquitetura e Organização de Computadores", "Herrmann", 60, 2));

        listaD.add(new Disciplina("Linguagem de Programação II", "Herrmann", 75, 3));
        listaD.add(new Disciplina("Sistemas Operacionais", "Miguel", 60, 3));
        listaD.add(new Disciplina("Banco de Dados", "Marlon", 75, 3));
        listaD.add(new Disciplina("Interface Humano Computador", "Leandro", 30, 3));
        listaD.add(new Disciplina("Gerência de Projeto de Software", "Daniel P.", 45, 3));
        listaD.add(new Disciplina("Informática e Sociedade III", "Geovane", 60, 3));

        listaD.add(new Disciplina("Direito Aplicado à Informática", "Josiane L.", 45, 4));
        listaD.add(new Disciplina("Língua Alemã", "Adilsom", 30, 4));
        listaD.add(new Disciplina("Banco de Dados II", "Marlon", 30, 4));
        listaD.add(new Disciplina("Programação Web I", "Marlon", 45, 4));
        listaD.add(new Disciplina("Redes de Computadores", "Daniel A.", 75, 4));
        listaD.add(new Disciplina("Linguagem de Programação III", "Geison", 60, 4));
        
        listaSL.add(new SemestreLetivo(2022, 
                                       2, 
                                       new SimpleDateFormat("dd/MM/yyyy").parse("21/10/2022"), 
                                       new SimpleDateFormat("dd/MM/yyyy").parse("22/03/2023")));
        listaSL.addDisciplina(listaD.get(6), 0);
        listaSL.addDisciplina(listaD.get(7), 0);
        listaSL.addDisciplina(listaD.get(8), 0);
        listaSL.addDisciplina(listaD.get(9), 0);
        listaSL.addDisciplina(listaD.get(10), 0);
        listaSL.addDisciplina(listaD.get(11), 0);
        
        listaSL.add(new SemestreLetivo(2023, 
                                       1, 
                                       new SimpleDateFormat("dd/MM/yyyy").parse("27/03/2023"), 
                                       new SimpleDateFormat("dd/MM/yyyy").parse("24/07/2023")));
        listaSL.addDisciplina(listaD.get(0), 1);
        listaSL.addDisciplina(listaD.get(1), 1);
        listaSL.addDisciplina(listaD.get(2), 1);
        listaSL.addDisciplina(listaD.get(3), 1);
        listaSL.addDisciplina(listaD.get(4), 1);
        listaSL.addDisciplina(listaD.get(5), 1);
        listaSL.addDisciplina(listaD.get(12), 1);
        listaSL.addDisciplina(listaD.get(13), 1);
        listaSL.addDisciplina(listaD.get(14), 1);
        listaSL.addDisciplina(listaD.get(15), 1);
        listaSL.addDisciplina(listaD.get(16), 1);
        listaSL.addDisciplina(listaD.get(17), 1);
        
        listaSL.add(new SemestreLetivo(2023, 
                                       2, 
                                       new SimpleDateFormat("dd/MM/yyyy").parse("27/07/2023"), 
                                       new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2023")));
        listaSL.addDisciplina(listaD.get(6), 2);
        listaSL.addDisciplina(listaD.get(7), 2);
        listaSL.addDisciplina(listaD.get(8), 2);
        listaSL.addDisciplina(listaD.get(9), 2);
        listaSL.addDisciplina(listaD.get(10), 2);
        listaSL.addDisciplina(listaD.get(11), 2);
        listaSL.addDisciplina(listaD.get(18), 2);
        listaSL.addDisciplina(listaD.get(19), 2);
        listaSL.addDisciplina(listaD.get(20), 2);
        listaSL.addDisciplina(listaD.get(21), 2);
        listaSL.addDisciplina(listaD.get(22), 2);
        listaSL.addDisciplina(listaD.get(23), 2);
        //VAMOS POSTERIORMENTE CRIAR E MOSTAR O FORM DE LOGIN
        TelaLogin tlLogin = new TelaLogin();
        tlLogin.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
