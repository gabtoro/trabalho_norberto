public class Enfermeiros {
    private String Nome;
    private String Turno;
    private String Experiencia;

    public Enfermeiros() {
    }



    public Enfermeiros(String nome, String turno, String experiencia) {
        Nome = nome;
        Turno = turno;
        Experiencia = experiencia;
    }



    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String experiencia) {
        Experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Enfermeiros [Nome=" + Nome + ", Turno=" + Turno + ", Experiencia=" + Experiencia + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((Turno == null) ? 0 : Turno.hashCode());
        result = prime * result + ((Experiencia == null) ? 0 : Experiencia.hashCode());
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
        Enfermeiros other = (Enfermeiros) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (Turno == null) {
            if (other.Turno != null)
                return false;
        } else if (!Turno.equals(other.Turno))
            return false;
        if (Experiencia == null) {
            if (other.Experiencia != null)
                return false;
        } else if (!Experiencia.equals(other.Experiencia))
            return false;
        return true;
    }

    
}
