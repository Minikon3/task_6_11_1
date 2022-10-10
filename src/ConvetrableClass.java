public class ConvetrableClass implements Convertable {
    double grd;
    ConvetrableClass(double grd){
        this.grd=grd;
    }

    public double getGrd() {
        return grd;
    }

    @Override
    public void convert() {
        System.out.println("Кельвин: "+(grd+273));
        System.out.println("Фаренгейт: "+(grd*4.5+32));
    }
}
