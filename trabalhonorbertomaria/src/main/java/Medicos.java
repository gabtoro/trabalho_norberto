public class Medicos {
    private String Nome;
    private String Especialidade;
    private String ConsultasAgendadas;
    
    public Medicos() {

    }

    public Medicos(String nome, String especialidade, String consultasAgendadas) {
        Nome = nome;
        Especialidade = especialidade;
        ConsultasAgendadas = consultasAgendadas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

    public String getConsultasAgendadas() {
        return ConsultasAgendadas;
    }

    public void setConsultasAgendadas(String consultasAgendadas) {
        ConsultasAgendadas = consultasAgendadas;
    }

    @Override
    public String toString() {
        return "Medicos [Nome=" + Nome + ", Especialidade=" + Especialidade + ", ConsultasAgendadas="
                + ConsultasAgendadas + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((Especialidade == null) ? 0 : Especialidade.hashCode());
        result = prime * result + ((ConsultasAgendadas == null) ? 0 : ConsultasAgendadas.hashCode());
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
        Medicos other = (Medicos) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (Especialidade == null) {
            if (other.Especialidade != null)
                return false;
        } else if (!Especialidade.equals(other.Especialidade))
            return false;
        if (ConsultasAgendadas == null) {
            if (other.ConsultasAgendadas != null)
                return false;
        } else if (!ConsultasAgendadas.equals(other.ConsultasAgendadas))
            return false;
        return true;
    }

    
}