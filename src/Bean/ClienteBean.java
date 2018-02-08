package Bean;

public class ClienteBean {
    
    private int CodCli;
    private String Cli_Nome, Cli_Fixo, Cli_Celular, Cli_Local, Cli_Secretaria, Cli_CRO, Cli_saldo;
    private int Cli_Tipo;

    public int getCodCli() {
        return CodCli;
    }

    public void setCodCli(int CodCli) {
        this.CodCli = CodCli;
    }

    public String getCli_Nome() {
        return Cli_Nome;
    }

    public void setCli_Nome(String Cli_Nome) {
        this.Cli_Nome = Cli_Nome;
    }

    public String getCli_Fixo() {
        return Cli_Fixo;
    }

    public void setCli_Fixo(String Cli_Fixo) {
        this.Cli_Fixo = Cli_Fixo;
    }

    public String getCli_Celular() {
        return Cli_Celular;
    }

    public void setCli_Celular(String Cli_Celular) {
        this.Cli_Celular = Cli_Celular;
    }

    public String getCli_Local() {
        return Cli_Local;
    }

    public void setCli_Local(String Cli_Local) {
        this.Cli_Local = Cli_Local;
    }

    public String getCli_Secretaria() {
        return Cli_Secretaria;
    }

    public void setCli_Secretaria(String Cli_Secretaria) {
        this.Cli_Secretaria = Cli_Secretaria;
    }
    
    public String getCli_CRO() {
        return Cli_CRO;
    }

    public void setCli_CRO(String Cli_CRO) {
        this.Cli_CRO = Cli_CRO;
    }

    public int getCli_Tipo() {
        return Cli_Tipo;
    }

    public void setCli_Tipo(int Cli_Tipo) {
        this.Cli_Tipo = Cli_Tipo;
    }

    public String getCli_saldo() {
        return Cli_saldo;
    }

    public void setCli_saldo(String Cli_saldo) {
        this.Cli_saldo = Cli_saldo;
    }
    
    public String toString(){
        return Cli_Nome; 
    }
    
}
