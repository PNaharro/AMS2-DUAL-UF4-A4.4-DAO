public class Forn extends Electrodomestic {
       int temperatura, autoneteja;
    public Forn() {
    }
    
    public Forn(Forn target) {
        super(target);
        if (target != null) {
            this.temperatura = target.temperatura;
            this.autoneteja = target.autoneteja;
        }
    }


    @Override
    public boolean equals(Object object2) {
        // TODO Auto-generated method stub
        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;
        Forn cast2 = (Forn) object2;
        return cast2.temperatura == temperatura && cast2.autoneteja == autoneteja;
        
    }

 

    @Override
    public Electrodomestic clone() {
        // TODO Auto-generated method stub
        return new Forn(this);
    }

    
}
