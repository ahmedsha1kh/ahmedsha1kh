package restaurantmenu;

public class restaurant {
private String item;
private String description;
private double price;
private String category;
private String allergens;
private static int numItems = 0;

public static int getNumItems() {
    return numItems;
}
public restaurant(String item, String description, double price, String category, String allergens) {
    this.item = item;
    this.description = description;
    this.price = price;
    this.category = category;
    this.allergens = this.allergens;
    numItems++;
}

public String getItem() {
    return item;
}

public String getDescription() {
    return description;
}

public double getPrice() {
    return price;
}

public String getCategory() {
    return category;
}

public String getAllgergens() {
    return allergens;
}

    @Override
    public String toString() {
        return item + "\t" + description + "\t $" + price + "\t" + category + "\t" + allergens;
    }
}
