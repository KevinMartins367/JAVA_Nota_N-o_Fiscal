package Bean;

public class RelacaoBean {
    
    private int CodRela, Rela_Tipo_Serv, Rela_Tipo_Entrega;
    private String Rela_dt, Rela_id_Cli, Rela_Paciente, Rela_Serv, Rela_Obs, Rela_Cor, Rela_Entrega, Rela_Total, Total;

    public int getCodRela() {
        return CodRela;
    }

    public void setCodRela(int CodRela) {
        this.CodRela = CodRela;
    }

    public int getRela_Tipo_Serv() {
        return Rela_Tipo_Serv;
    }

    public void setRela_Tipo_Serv(int Rela_Tipo_Serv) {
        this.Rela_Tipo_Serv = Rela_Tipo_Serv;
    }

    public int getRela_Tipo_Entrega() {
        return Rela_Tipo_Entrega;
    }

    public void setRela_Tipo_Entrega(int Rela_Tipo_Entrega) {
        this.Rela_Tipo_Entrega = Rela_Tipo_Entrega;
    }

    public String getRela_dt() {
        return Rela_dt;
    }

    public void setRela_dt(String Rela_dt) {
        this.Rela_dt = Rela_dt;
    }

    public String getRela_id_Cli() {
        return Rela_id_Cli;
    }

    public void setRela_id_Cli(String Rela_id_Cli) {
        this.Rela_id_Cli = Rela_id_Cli;
    }

    public String getRela_Paciente() {
        return Rela_Paciente;
    }

    public void setRela_Paciente(String Rela_Paciente) {
        this.Rela_Paciente = Rela_Paciente;
    }

    public String getRela_Serv() {
        return Rela_Serv;
    }

    public void setRela_Serv(String Rela_Serv) {
        this.Rela_Serv = Rela_Serv;
    }

    public String getRela_Cor() {
        return Rela_Cor;
    }

    public void setRela_Cor(String Rela_Cor) {
        this.Rela_Cor = Rela_Cor;
    }

    public String getRela_Entrega() {
        return Rela_Entrega;
    }

    public void setRela_Entrega(String Rela_Entrega) {
        this.Rela_Entrega = Rela_Entrega;
    }

    public String getRela_Total() {
        return Rela_Total;
    }

    public void setRela_Total(String Rela_Total) {
        this.Rela_Total = Rela_Total;
    }

    public String getRela_Obs() {
        return Rela_Obs;
    }

    public void setRela_Obs(String Rela_Obs) {
        this.Rela_Obs = Rela_Obs;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String toString(){
        return Rela_dt+"//"+Rela_Entrega+"//"+Rela_Paciente+"//"+Rela_Serv+"//"+Rela_Total;
    }
    
}
