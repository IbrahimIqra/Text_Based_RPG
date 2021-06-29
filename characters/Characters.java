package characters;

import support.Time;

public abstract class Characters
{
    private int power;
    private int stamina;
    private int magic;
    private String name;
    private String type;
    
    public Characters(final int pow, final int sta, final int mag, final String t) {
        System.out.println("\t\t...Creating your character!");
        this.power = pow;
        this.stamina = sta;
        this.magic = mag;
        this.type = t;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getType() {
        return this.type;
    }
    
    public int getPow() {
        return this.power;
    }
    
    public int getSta() {
        return this.stamina;
    }
    
    public int getMag() {
        return this.magic;
    }
    
    public void showStat() {
        System.out.println("\t\tStat:");
        System.out.println("\t\t------");
        Time.sleep(1);
        System.out.println("\t\tPower ---> " + this.power);
        Time.sleep(1);
        System.out.println("\t\tStamina -> " + this.stamina);
        Time.sleep(1);
        System.out.println("\t\tMagic: --> " + this.magic);
    }
}