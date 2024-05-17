public class Consultas {

    private String paciente;
    private int DataConsulta;
    private String MotivoConsulta;


    public Consultas() {
    }
    

    public Consultas(String paciente, int dataConsulta, String motivoConsulta) {
        this.paciente = paciente;
        DataConsulta = dataConsulta;
        MotivoConsulta = motivoConsulta;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getDataConsulta() {
        return DataConsulta;
    }

    public void setDataConsulta(int dataConsulta) {
        DataConsulta = dataConsulta;
    }

    public String getMotivoConsulta() {
        return MotivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        MotivoConsulta = motivoConsulta;
    }

    @Override
    public String toString() {
        return "Consultas [paciente=" + paciente + ", DataConsulta=" + DataConsulta + ", MotivoConsulta="
                + MotivoConsulta + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
        result = prime * result + DataConsulta;
        result = prime * result + ((MotivoConsulta == null) ? 0 : MotivoConsulta.hashCode());
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
        Consultas other = (Consultas) obj;
        if (paciente == null) {
            if (other.paciente != null)
                return false;
        } else if (!paciente.equals(other.paciente))
            return false;
        if (DataConsulta != other.DataConsulta)
            return false;
        if (MotivoConsulta == null) {
            if (other.MotivoConsulta != null)
                return false;
        } else if (!MotivoConsulta.equals(other.MotivoConsulta))
            return false;
        return true;
    }

    
    
    
}
