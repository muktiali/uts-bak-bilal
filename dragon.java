package tugas.uts;

import java.lang.invoke.MethodHandles;

public class dragon extends monster {

    private int jumlah_kepala;
    private int jumlah_ekor;
    private int jumlah_kaki;
    private int jumlah_sayap;

    public dragon(String nama, int nyawa, String warna_tubuh, String tipe, double physical_attack, double attack_speed, double movement_speed, double armor, int mana, int jumlah_kepala, int jumlah_ekor, int jumlah_kaki, int jumlah_sayap) {
        super(nama, nyawa, warna_tubuh, tipe, physical_attack, attack_speed, movement_speed, armor, mana);
        this.jumlah_kepala = jumlah_kepala;
        this.jumlah_ekor = jumlah_ekor;
        this.jumlah_kaki = jumlah_kaki;
        this.jumlah_sayap = jumlah_sayap;
        System.out.println("monster sudah bangkit untuk menghancurkan dunia!");
        System.out.println("\n" +
                "\n" +
                "                                                 /===-_---~~~~~~~~~------____\n" +
                "                                                |===-~___                _,-'\n" +
                "                 -==\\\\                         `//~\\\\   ~~~~`---.___.-~~\n" +
                "             ______-==|                         | |  \\\\           _-~`\n" +
                "       __--~~~  ,-/-==\\\\                        | |   `\\        ,'\n" +
                "    _-~       /'    |  \\\\                      / /      \\      /\n" +
                "  .'        /       |   \\\\                   /' /        \\   /'\n" +
                " /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'\n" +
                "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`\n" +
                "                  \\_|      /        _)   ;  ),   __--~~\n" +
                "                    '~~--_/      _-~/-  / \\   '-~ \\\n" +
                "                   {\\__--_/}    / \\\\_>- )<__\\      \\\n" +
                "                   /'   (_/  _-~  | |__>--<__|      | \n" +
                "                  |0  0 _/) )-~     | |__>--<__|      |\n" +
                "                  / /~ ,_/       / /__>---<__/      |  \n" +
                "                 o o _//        /-~_>---<__-~      /\n" +
                "                 (^(~          /~_>---<__-      _-~              \n" +
                "                ,/|           /__>--<__/     _-~                 \n" +
                "             ,//('(          |__>--<__|     /                  .----_ \n" +
                "            ( ( '))          |__>--<__|    |                 /' _---_~\\\n" +
                "         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\\n" +
                "        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||\n" +
                "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'\n" +
                "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/ \n" +
                "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~ \n" +
                "   ;'( ')/ ,)(                              ~~~~~~~~~~ \n" +
                "  ' ') '( (/\n" +
                "    '   '  `  ");
    }

    @Override
    public void skill_pertama() {
        if (this.getMana()<10){
            System.out.println("mana tidak cukup minim 10\n"+
            "silahkan isi mana");
        }else{
            System.out.println("mencakar musuh");
            this.setMana(getMana()-10);
        }

    }

    @Override
    public void skill_kedua() {
        if (this.getMana()<15){
            System.out.println("mana tidak cukup minim 15\n"+
            "silahkan isi mana");
        }else{
            System.out.println("mengibaskan ekor ke musuh");
            this.setMana(getMana()-15);
        }
    }

    @Override
    public void ulltimate() {
        if (this.getMana()<30){
            System.out.println("mana tidak cukup minim 30\n"+
            "silahkan isi mana");
        }else{
            System.out.println("menyembur api ke musuh");
            this.setMana(getMana()-30);
        }
    }

    public int getJumlah_kepala() {
        return jumlah_kepala;
    }

    public void setJumlah_kepala(int jumlah_kepala) {
        this.jumlah_kepala = jumlah_kepala;
    }

    public int getJumlah_ekor() {
        return jumlah_ekor;
    }

    public void setJumlah_ekor(int jumlah_ekor) {
        this.jumlah_ekor = jumlah_ekor;
    }

    public int getJumlah_kaki() {
        return jumlah_kaki;
    }

    public void setJumlah_kaki(int jumlah_kaki) {
        this.jumlah_kaki = jumlah_kaki;
    }

    public int getJumlah_sayap() {
        return jumlah_sayap;
    }

    public void setJumlah_sayap(int jumlah_sayap) {
        this.jumlah_sayap = jumlah_sayap;
    }
}
