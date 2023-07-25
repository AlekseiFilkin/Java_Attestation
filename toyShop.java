import java.util.ArrayList;
import java.util.List;

public class toyShop {
    private List<toys> toys;
    private int allToys = 100;

    public toyShop (List<toys> toys) {
        this.toys = toys;
    }
    public List<toys> getToys () {
        List<toys> copyToys = new ArrayList<>();
        copyToys.addAll(toys);
        return copyToys;
    }
    public int dropToys(List<toys> toys) {
        int result;
        double rand = Math.floor(Math.random() * 100) + 1;
        if (rand < 8) {
            result = toys.get(0).getId();
        } else if (rand < 24) {
            result = toys.get(1).getId();
        } else if (rand < 56) {
            result = toys.get(2).getId();
        } else {
            result = toys.get(4).getId();
        }
        System.out.println("Ваш приз: " + result);
        return result;
    }

    DataWriter dw = new DataWriter();
    public void getToys (ArrayList<Integer> givePrize, List<toys> toys) {
        int id = givePrize.get(0) - 1;
        givePrize.remove(0);
        allToys = allToys -1;
        toys.get(id).setToyQantity(toys.get(id).getToyQuantity() -1);
        dw.writeToFile(toys.get(id));
        System.out.println("Вам досталась: " + givePrize);
        System.out.println("Осталось " + allToys + " игрушек");
    }

    public void addToy (toys toy) {
        toys.add(toy);
        allToys++;
    }
}
