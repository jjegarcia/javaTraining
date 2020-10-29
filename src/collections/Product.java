package collections;

public class Product {
    String name;
    int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    Product (String name, int weight){
        this.name = name;
        this.weight = weight;
    }
}
