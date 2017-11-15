package tugas.uts;

import java.util.Scanner;

public class main {

    public static void main (String[]args) {
                int pilihmenu;
                int menu;
                String nama;
                int nyawa;
                String warna_tubuh;
                String tipe;
         double physical_attack;
         double attack_speed;
         double movement_speed;
         double armor;
               int mana;
               int jumlah_kepala;
               int jumlah_ekor;
               int jumlah_kaki;
               int jumlah_sayap;


        Scanner  input = new Scanner(System.in);
        System.out.println("===buat mouster====");
        System.out.println(" masukan nama:");
        nama=input.next();
        System.out.println(" masukan nyawa:");
        nyawa=input.nextInt();
        System.out.println(" masukan warna tubuh monster:");
        warna_tubuh=input.next();
        System.out.println(" masukan tipe");
        tipe=input.next();
        System.out.println(" masukan physical attack");
        physical_attack=input.nextDouble();
        System.out.println(" masukan attack speed");
        attack_speed=input.nextDouble();
        System.out.println(" masukan movement speed");
        movement_speed=input.nextDouble();
        System.out.println(" masukan armor");
        armor=input.nextDouble();
        System.out.println(" masukan mana:");
        mana=input.nextInt();
        System.out.println(" masukan jumlah kepala:");
        jumlah_kepala=input.nextInt();
        System.out.println(" masukan jumlah ekor:");
        jumlah_ekor=input.nextInt();
        System.out.println(" masukan kaki:");
        jumlah_kaki=input.nextInt();
        System.out.println(" masukan jumlah sayap:");
        jumlah_sayap=input.nextInt();
        System.out.println();

        dragon dragonku = new dragon(nama,nyawa,warna_tubuh,tipe,physical_attack,attack_speed,movement_speed,armor,mana,jumlah_kepala,jumlah_ekor,jumlah_kaki,jumlah_sayap);

 do{
     System.out.println("\n\n=========menu==========");
     System.out.println(
                     "1  detail monster\n"+
                     "2  ngisi mana\n"+
                     "3  skill pertama\n"+
                     "4  skill kedua\n"+
                     "5  skill ulltimete\n"+
                     "6 exit\n\n\n"+
                     "masukan pilihan anda :");

     pilihmenu= input.nextInt();

     switch (pilihmenu){
         case 1:

             System.out.println("nama monster  : "+dragonku.getNama());
             System.out.println("nyawa  : "+dragonku.getNyawa());
             System.out.println("warna tubuh  : "+dragonku.getWarna_tubuh());
             System.out.println("tipe : "+dragonku.getTipe());
             System.out.println("physical attack  : "+dragonku.getPhysical_attack());
             System.out.println("attack speed  : "+dragonku.getAttack_speed());
             System.out.println("movement speed monster : "+dragonku.getMovement_speed());
             System.out.println("armor : "+dragonku.getArmor());
             System.out.println("mana : "+dragonku.getMana());
             System.out.println("jumlah kepala : "+dragonku.getJumlah_kepala());
             System.out.println("jumlah ekor : "+dragonku.getJumlah_ekor());
             System.out.println("jumlah kaki : "+dragonku.getJumlah_kaki());
             System.out.println("jumlah sayap: "+dragonku.getJumlah_sayap());
             break;
         case 2:
             dragonku.isi_mana();
             break;

         case 3:
             dragonku.skill_pertama();
             break;
         case 4:
             dragonku.skill_kedua();
             break;
         case 5:
             dragonku.ulltimate();
             break;


     }
 }while (pilihmenu!=6);


    }
}
