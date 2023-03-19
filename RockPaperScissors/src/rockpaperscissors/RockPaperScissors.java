package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("*** TAŞ-KAĞIT-MAKAS OYUNUNA HOŞGELDİNİZ ***");
        kurallar();
    }
    
    public static void kurallar(){
        
        System.out.println("- KURALLAR -" + "\n");
        System.out.println("1) KAĞIT TAŞI SARAR");
        System.out.println("2) TAŞ MAKASI KIRAR ");
        System.out.println("3) MAKAS KAĞIDI KESER " + "\n");
        basla();
        
    }
    
    public static void basla(){
        
        Scanner s=new Scanner(System.in);
        System.out.println("Başlamak için ENTER tuşuna çıkmak için herhangi bir tuşa basınız.");
        String tus=s.nextLine();
        kontrol(tus);
        
    }
    
    public static void kontrol(String tus){
        
        if(tus.equals("")){
            System.out.println("Oyun başlıyor...");
            ilkSecim();
        }
        
        else    System.exit(1);
        
    }
    
    public static void ilkSecim(){
        Scanner s=new Scanner(System.in);
        
        int oyuncuPuan=0, bilgisayarPuan=0;
        
        System.out.println("TAŞ için '1'");
        System.out.println("KAĞIT için '2'");
        System.out.println("MAKAS için '3'");
        
        System.out.print("Seçiminiz = ");
        int oyuncuSecimi=s.nextInt();
        
        while(oyuncuSecimi<1 || oyuncuSecimi>3){
            
            System.out.println("Geçersiz seçim!");
            System.out.println("--------------");
            System.out.println("TAŞ için '1'");
            System.out.println("KAĞIT için '2'");
            System.out.println("MAKAS için '3'");
        
            System.out.print("Seçiminiz = ");
            oyuncuSecimi=s.nextInt();
        
        }
        
        int bilSecimi=(int)(Math.random()*3+1);
        System.out.print("Bilgisayar = " + bilSecimi + "\n");
        
        sonuc(oyuncuPuan, bilgisayarPuan, oyuncuSecimi, bilSecimi);
        
    }
    
    public static void secim(int playerPoint, int computerPoint){
        Scanner s=new Scanner(System.in);
        
        System.out.println("TAŞ için '1'");
        System.out.println("KAĞIT için '2'");
        System.out.println("MAKAS için '3'");
        
        System.out.print("Seçiminiz = ");
        int oyuncuSecimi=s.nextInt();
        
        while(oyuncuSecimi<1 || oyuncuSecimi>3){
            
            System.out.println("Geçersiz seçim!");
            System.out.println("--------------");
            System.out.println("TAŞ için '1'");
            System.out.println("KAĞIT için '2'");
            System.out.println("MAKAS için '3'");
        
            System.out.print("Seçiminiz = ");
            oyuncuSecimi=s.nextInt();
        
        }
        
        int bilSecimi=(int)(Math.random()*3+1);
        
        System.out.print("Bilgisayar = " + bilSecimi + "\n");
        
        sonuc(playerPoint, computerPoint, oyuncuSecimi, bilSecimi);
        
    }
    
    public static void sonuc(int playerPoint, int computerPoint, int playerChoise, int computerChoise){
        
        if(playerChoise==1 && computerChoise==2){
            
            System.out.println("KAĞIT TAŞI sardı.");
            System.out.println("Bilgisayar Kazandı");
            computerPoint+=1;
            System.out.print("Oyuncu = " + playerPoint + "\n");
            System.out.print("Bilgisayar = " + computerPoint + "\n");
            System.out.println("--------------");
            
        }
        
        else if(playerChoise==1 && computerChoise==3){
            
            System.out.println("TAŞ MAKASI kırdı.");
            System.out.println("Oyuncu Kazandı");
            playerPoint+=1;
            System.out.print("Oyuncu = " + playerPoint + "\n");
            System.out.print("Bilgisayar = " + computerPoint + "\n");
            System.out.println("--------------");
            
        }
        
        else if(playerChoise==2 && computerChoise==3){
            
            System.out.println("MAKAS KAĞIDI kesti.");
            System.out.println("Bilgisayar Kazandı");
            computerPoint+=1;
            System.out.print("Oyuncu = " + playerPoint + "\n");
            System.out.print("Bilgisayar = " + computerPoint + "\n");
            System.out.println("--------------");
            
        }
        
        else if(playerChoise==2 && computerChoise==1){
            
            System.out.println("KAĞIT TAŞI sardı.");
            System.out.println("Oyuncu Kazandı");
            playerPoint+=1;
            System.out.print("Oyuncu = " + playerPoint + "\n");
            System.out.print("Bilgisayar = " + computerPoint + "\n");
            System.out.println("--------------");
            
        }
        
        else if(playerChoise==3 && computerChoise==1){
            
            System.out.println("TAŞ MAKASI kırdı.");
            System.out.println("Bilgisayar Kazandı");
            computerPoint+=1;
            System.out.print("Oyuncu = " + playerPoint + "\n");
            System.out.print("Bilgisayar = " + computerPoint + "\n");
            System.out.println("--------------");
            
        }
        
        else if(playerChoise==3 && computerChoise==2){
            
            System.out.println("MAKAS KAĞIDI kesti.");
            System.out.println("Oyuncu Kazandı");
            playerPoint+=1;
            System.out.print("Oyuncu = " + playerPoint + "\n");
            System.out.print("Bilgisayar = " + computerPoint + "\n");
            System.out.println("--------------");
            
        }
        
        else{
            
            System.out.println("Berabere");
            System.out.print("Oyuncu = " + playerPoint + "\n");
            System.out.print("Bilgisayar = " + computerPoint + "\n");
            System.out.println("--------------");
            
        }
        
        if(playerPoint==3)  playerWin(playerPoint, computerPoint);
        
        
        else if(computerPoint==3)   computerWin(playerPoint, computerPoint);
        
        else{
            
            while(playerPoint!=3 || computerPoint!=3){
                secim(playerPoint, computerPoint);
            }
            
        }
        
    }
    
    public static void computerWin(int playerPoint, int computerPoint){
            System.out.println("Bilgisayar " + computerPoint + "-" + playerPoint + " kazandı.");
            System.exit(1);
    }
    
    public static void playerWin(int playerPoint, int computerPoint){
            System.out.println("Oyuncu " + playerPoint + "-" + computerPoint + " kazandı.");
            System.exit(1);
    }
}
