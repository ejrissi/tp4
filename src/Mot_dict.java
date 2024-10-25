public class Mot_dict {

    private String mot;
    private String def;

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

   
    Boolean synonyme(String a) {
        return this.def.equals(a);
    }
}
