import utils.Human;

import java.util.ArrayList;

public class GenericsExample {
    public static  void main(String[] args) {
 Printer<Integer> printer = new Printer<>(23);


     printer.print();

     Printer<Double>doublePrinter = new Printer<>(33.5);
     doublePrinter.print();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal() );

       Animal myanimal  =  animals.get(0);





    }
}
