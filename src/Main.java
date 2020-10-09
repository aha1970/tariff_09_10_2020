public class Main {
    public static void main(String[] args) {
        Tariff tele2= new Tariff();

        tele2.statusOnline="Везде онлайн";
        tele2.hitSales=1;
        tele2.numberMinutes=500;
        tele2.unLimitProvider="+ безлимит на Tele2 России";
        tele2.numberTraffic=40;
        tele2.UnLimitApps="+ безлимитные";
        tele2.unLimitFb=true;

        System.out.println(tele2.statusOnline);



    }
}
