import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int jumlahpembelian, soto, ayamgoreng, babiguling, baksosetan, sateunta, nasi, plastik, totalharga, sempolcicak, pudinglele, miegoreng, nasigorengmaut, sayurkangtheconqueror;
        String beli;

        soto = 10000;
        ayamgoreng = 12000;
        babiguling = 48000;
        baksosetan = 18000;
        sateunta = 50000;
        nasi = 5000;
        plastik = 1000;
        pudinglele = 25000;
        sempolcicak = 2500;
        miegoreng = 7000;
        nasigorengmaut = 90000;
        sayurkangtheconqueror = 9999999;


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
        if("sempolcicak".equals(beli)) {
            System.out.println("Kamu membeli = Sempol Cicak");
            totalharga = sempolcicak * jumlahpembelian;
            System.out.println("Total harga = " + totalharga);
        }         
        if("pudinglele".equals(beli)) {
            System.out.println("Kamu membeli = Puding Lele");
            totalharga = pudinglele * jumlahpembelian;
            System.out.println("Total harga = " + totalharga);
        }         
        if("miegoreng".equals(beli)) {
            System.out.println("Kamu membeli = Mie Goreng");
            totalharga = miegoreng * jumlahpembelian;
            System.out.println("Total harga = " + totalharga);
        }         
        if("nasgor".equals(beli)) {
            System.out.println("Kamu membeli = Nasi Goreng Maut");
            totalharga = nasigorengmaut * jumlahpembelian;
            System.out.println("Total harga = " + totalharga);
        }         
        if("sayurkangkung".equals(beli)) {
            System.out.println("Kamu membeli = Sayur Kang The Conqueror");
            totalharga = sayurkangtheconqueror * jumlahpembelian;
            System.out.println("Total harga = " + totalharga);
        }         
        
    }
}
