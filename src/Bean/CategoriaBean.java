package Bean;

public class CategoriaBean {
    
    private int CodCat;
    private String Cat_Nome;

    public int getCodCat() {
        return CodCat;
    }

    public void setCodCat(int CodCat) {
        this.CodCat = CodCat;
    }

    public String getCat_Nome() {
        return Cat_Nome;
    }

    public void setCat_Nome(String Cat_Nome) {
        this.Cat_Nome = Cat_Nome;
    }
    
    public String toString(){
        return Cat_Nome;
    }
}
