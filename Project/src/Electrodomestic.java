public abstract class Electrodomestic {
   
    public String nom,color,marca, eficienci;
    public int preu;
    
    public Electrodomestic(){};
    
    public abstract Electrodomestic clone();

    public Electrodomestic(Electrodomestic target) {
        if (target != null) {
            this.nom = target.nom;
            this.color = target.color;
            this.marca = target.marca;
            this.eficienci = target.eficienci;
            this.preu = target.preu;
        }
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic)) return false;
        Electrodomestic cast2 = (Electrodomestic) object2;
        return cast2.preu == preu && cast2.color.equals(color) && cast2.nom.equals(nom) && cast2.marca.equals(marca) && cast2.eficienci.equals(eficienci);
    }
}
