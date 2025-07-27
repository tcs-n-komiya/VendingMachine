package category;

import interfaces.CategoryType;

public class DrinkCategory implements CategoryType {
    @Override
    public String getCategoryLabel() {
        return "飲料";
    }
}
