public class Nevera extends Electrodomestic{
    int frigories,soroll;

    public Nevera(Nevera target) {
        super(target);
        if (target != null) {
            this.frigories = target.frigories;
            this.soroll = target.soroll;
        }
    }

    public Nevera() {
    }

    @Override
    public Electrodomestic clone() {
        // TODO Auto-generated method stub
        return new Nevera(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;
        Nevera cast2 = (Nevera) object2;
        return cast2.frigories == frigories && cast2.soroll == soroll;
    }
    
}
