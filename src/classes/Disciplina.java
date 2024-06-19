package classes;

public class Disciplina {
    private String nome;
    private String professor;
    private int horas;
    private int semestre;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Disciplina(String nome, String professor, int horas, int semestre) {
        this.nome = nome;
        this.professor = professor;
        this.horas = horas;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Disciplina" + nome + ", Professor: " + professor + ", Quantidade de Horas: " + horas + ", Semestre: " + semestre + "\n";
    }
    
    
}
