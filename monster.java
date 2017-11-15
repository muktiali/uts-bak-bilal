package tugas.uts;

public class monster extends musuh {
    private String tipe;
    private double physical_attack;
    private double attack_speed;
    private double movement_speed;
    private double armor;
    private int mana;

       public monster(String nama, int nyawa, String warna_tubuh, String tipe, double physical_attack, double attack_speed, double movement_speed, double armor, int mana) {
          super(nama, nyawa, warna_tubuh);
             this.tipe = tipe;
               this.physical_attack = physical_attack;
                 this.attack_speed = attack_speed;
                  this.movement_speed = movement_speed;
                this.armor = armor;
              this.mana = mana;

    }

             public void isi_mana(){
                 int slisih_mana=0;
                  slisih_mana = 100-mana;
                   if (this.mana<100){
                  this.mana=slisih_mana+mana;
                 System.out.println("mana full siap tarung");
               }else{
            System.out.println("mana masih full tidak bisa di isi");
        }
    }

            public void skill_pertama() { System.out.println("tidak ada skill 1"); }

             public void skill_kedua() { System.out.println("tidak ada skill 2");}

           public void ulltimate(){ System.out.println("tidak ada ulltimete");}

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getPhysical_attack() {
        return physical_attack;
    }

    public void setPhysical_attack(double physical_attack) {
        this.physical_attack = physical_attack;
    }

    public double getAttack_speed() {
        return attack_speed;
    }

    public void setAttack_speed(double attack_speed) {
        this.attack_speed = attack_speed;
    }

    public double getMovement_speed() {
        return movement_speed;
    }

    public void setMovement_speed(double movement_speed) {
        this.movement_speed = movement_speed;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
