public class Leitos {
    private String Status;
    private int DataInternacao;
    private String Observacoes;

    public Leitos() {
    }

    public Leitos(String status, int dataInternacao, String observacoes) {
        Status = status;
        DataInternacao = dataInternacao;
        Observacoes = observacoes;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getDataInternacao() {
        return DataInternacao;
    }
    public void setDataInternacao(int dataInternacao) {
        DataInternacao = dataInternacao;
    }

    public String getObservacoes() {
        return Observacoes;
    }
    public void setObservacoes(String observacoes) {
        Observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Leitos [Status=" + Status + ", DataInternacao=" + DataInternacao + ", Observacoes=" + Observacoes + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Status == null) ? 0 : Status.hashCode());
        result = prime * result + DataInternacao;
        result = prime * result + ((Observacoes == null) ? 0 : Observacoes.hashCode());
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
        Leitos other = (Leitos) obj;
        if (Status == null) {
            if (other.Status != null)
                return false;
        } else if (!Status.equals(other.Status))
            return false;
        if (DataInternacao != other.DataInternacao)
            return false;
        if (Observacoes == null) {
            if (other.Observacoes != null)
                return false;
        } else if (!Observacoes.equals(other.Observacoes))
            return false;
        return true;
    }

    

}
