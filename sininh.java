import java.io.*;
import java.lang.*:
class Animal 
{
public Animal()
{
    System.out.println("Animal con");
    } 
    public void Cats()
    {
        System.out.println("Animal eats");

    }
    class cat extends Animal
    {
        public Cats()
        {
            System.out.println("Cats eats");
        }
        class Sininh
        {
            public static void main(String args[])
            {
                cat c1 = new cat();
                c1.eat();
            }
        }
    }
}