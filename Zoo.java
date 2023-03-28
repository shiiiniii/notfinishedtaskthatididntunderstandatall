package finalwork;

import java.util.Map;
import java.util.TreeMap;

import finalwork.Animals.*;

public class Zoo {
    private TreeMap<Integer, Animals> mymap;

    public Zoo() {
        mymap = new TreeMap<>();
        mymap.put(1, new Cat("черный", "Пушок", "британец", "черный", "01.01.2018"));
        mymap.put(2, new Tiger("черный", "лес", "01.01.2018"));
        mymap.put(3, new Dog("черный", "Шарик", "хаски", "черный", "01.01.2018"));
        mymap.put(4, new Wolf( "черный", "лес", "01.01.2018"));
        mymap.put(5, new Chicken("черный", 1));
        mymap.put(6, new Stork("черный", 1));
    }

 

    public void actions() {
        for (Map.Entry<Integer, Animal> mymap {
            if (mymap.getValue() instanceof Pet)   ((Pet)(mymap.getValue())).affection();
            if (mymap.getValue() instanceof Dog)   ((Dog)(mymap.getValue())).training();
            if (mymap.getValue() instanceof Bird)  ((Bird)(mymap.getValue())).Fly();
        
    }

}
}
