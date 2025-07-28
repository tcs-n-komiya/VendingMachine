package category;

import interfaces.CategoryType;

/**
 * 飲料カテゴリ
 */
public class DrinkCategory implements CategoryType {

    /**
     * 「飲料」というカテゴリラベルを返す
     *
     * @return カテゴリラベル「飲料」
     */
    @Override
    public String getCategoryLabel() {
        return "飲料";
    }
}
