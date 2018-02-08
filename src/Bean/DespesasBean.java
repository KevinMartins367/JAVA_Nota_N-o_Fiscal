package Bean;

public class DespesasBean {
    
    private int CodDesp;
    private String Desp_Titulo, Desp_Tipo, Desp_Preco, Desp_dt;

    public int getCodDesp() {
        return CodDesp;
    }

    public void setCodDesp(int CodDesp) {
        this.CodDesp = CodDesp;
    }

    public String getDesp_Titulo() {
        return Desp_Titulo;
    }

    public void setDesp_Titulo(String Desp_Titulo) {
        this.Desp_Titulo = Desp_Titulo;
    }

    public String getDesp_Tipo() {
        return Desp_Tipo;
    }

    public void setDesp_Tipo(String Desp_Tipo) {
        this.Desp_Tipo = Desp_Tipo;
    }

    public String getDesp_Preco() {
        return Desp_Preco;
    }

    public void setDesp_Preco(String Desp_Preco) {
        this.Desp_Preco = Desp_Preco;
    }

    public String getDesp_dt() {
        return Desp_dt;
    }

    public void setDesp_dt(String Desp_dt) {
        this.Desp_dt = Desp_dt;
    }

    public String toString(){
        return Desp_Tipo+"//"+Desp_Titulo+"//"+Desp_Preco+"//"+Desp_dt+"//";
    }
}
