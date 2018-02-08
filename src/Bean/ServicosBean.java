package Bean;

public class ServicosBean {
    
    private int CodServ;
    private String Serv_Nome, Serv_Preco, Serv_id_Cat;

    public int getCodServ() {
        return CodServ;
    }

    public void setCodServ(int CodServ) {
        this.CodServ = CodServ;
    }

    public String getServ_Nome() {
        return Serv_Nome;
    }

    public void setServ_Nome(String Serv_Nome) {
        this.Serv_Nome = Serv_Nome;
    }

    public String getServ_Preco() {
        return Serv_Preco;
    }

    public void setServ_Preco(String Serv_Preco) {
        this.Serv_Preco = Serv_Preco;
    }

    public String getServ_id_Cat() {
        return Serv_id_Cat;
    }

    public void setServ_id_Cat(String Serv_id_Cat) {
        this.Serv_id_Cat = Serv_id_Cat;
    }

    
    
    public String toString(){
        return Serv_Nome;
    }
    
}
