public class Pacientes {
    private String Nome;
    private int Idade;
    private String Diagnostico;
    
    public Pacientes() {
    }

    public Pacientes(String nome, int idade, String diagnostico) {
        Nome = nome;
        Idade = idade;
        Diagnostico = diagnostico;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Pacientes [Nome=" + Nome + ", Idade=" + Idade + ", Diagnostico=" + Diagnostico + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + Idade;
        result = prime * result + ((Diagnostico == null) ? 0 : Diagnostico.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pacientes other = (Pacientes) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (Idade != other.Idade)
            return false;
        if (Diagnostico == null) {
            if (other.Diagnostico != null)
                return false;
        } else if (!Diagnostico.equals(other.Diagnostico))
            return false;
        return true;
    }

    
}