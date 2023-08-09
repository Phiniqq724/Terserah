import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int jumlahpembelian, soto, ayamgoreng, babiguling, baksosetan, sateunta, nasi, plastik, totalharga;
        String beli;
        soto = 10000;
        ayamgoreng = 12000;
        babiguling = 48000;
        baksosetan = 18000;
        sateunta = 50000;
        nasi = 5000;
        plastik = 1000;

        System.out.print("Beli apa? ");
        beli = myObj.nextLine();

        System.out.print("Beli berapa? ");
        jumlahpembelian = myObj.nextInt();

        if("soto".equals(beli)) {
            System.out.println("Kamu membeli = SOTO");
            System.out.println("Harga Soto = " + soto * jumlahpembelian);
            totalharga = soto*jumlahpembelian;
        } 
        if("ayamgoreng".equals(beli)) {
            System.out.println("Kamu membeli = Ayam goreng");
            System.out.println("Harga Soto = " + ayamgoreng*jumlahpembelian);
            totalharga = ayamgoreng*jumlahpembelian;
        } 
        if("babiguling".equals(beli)) {
            System.out.println("Kamu membeli = Babi Guling");
            System.out.println("Harga Soto = " + babiguling*jumlahpembelian);
            totalharga = babiguling*jumlahpembelian;
        } 
        if("baksoSetan".equals(beli)) {
            System.out.println("Kamu membeli = Bakso Setan");
            System.out.println("Harga Soto = " + baksosetan*jumlahpembelian);
            totalharga = baksosetan*jumlahpembelian;
        } 
        if("sateUnta".equals(beli)) {
            System.out.println("Kamu membeli = Sate Unta");
            System.out.println("Harga Soto = " + sateunta*jumlahpembelian);
            totalharga = sateunta*jumlahpembelian;
        }         
    }
}