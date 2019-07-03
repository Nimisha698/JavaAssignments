package accesscontrolandmore.task1;

public class MainTask1 {
    public static void main(String args[])
    {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Mouse();
        rodents[1]=new Hamster();
        rodents[2]=new Gerbil();
        rodents[0].rodentsBite();
        rodents[1].rodentsBite();
        rodents[2].rodentsBite();
    }
}
