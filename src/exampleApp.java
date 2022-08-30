import concretes.Bird;
import concretes.Cat;
import concretes.Dog;

public class exampleApp {

    public static void main(String[] args){

        Dog dogShiba = new Dog("Tori", 12, "Shiba Inu");
        Dog dogChiwawa = new Dog("Teddy", 5, "Chiwawa");
        Dog dogChiwawas = new Dog("Teddy", 5, "Chiwawa");

        System.out.println("----------------");
        System.out.println(dogShiba.toString());
        System.out.println(dogChiwawa.equals(dogShiba));
        System.out.println(dogChiwawa.equals(dogChiwawas));

        Cat catVan = new Cat("Renklim", 3, "Van Kedisi");
        Cat catMunchkin = new Cat("Mucky", 4, "Munchkin");

        System.out.println("----------------");
        System.out.println(catVan.toString());
        System.out.println(catMunchkin.equals(catVan));

        Bird birdFinch = new Bird("Fıstık", 7, false);
        Bird birdFinch2 = new Bird("Fıstık", 7, false);
        Bird birdParrot = new Bird("Maviş", 7, true);

        System.out.println("----------------");
        System.out.println(birdFinch.toString());
        System.out.println(birdFinch.equals(birdFinch2));
        System.out.println(birdFinch.equals(birdParrot));
    }
    }





