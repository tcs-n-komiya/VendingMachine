package category;

import interfaces.CategoryType;

public class SnackCategory implements CategoryType {
    @Override
    public String getCategoryLabel() {
        return "軽食";
    }
}
