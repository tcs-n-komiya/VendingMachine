package category;

import interfaces.CategoryType;

/**
 * 軽食カテゴリ
 */
public class SnackCategory implements CategoryType {

    /**
     * 「軽食」というカテゴリラベルを返す
     *
     * @return カテゴリラベル「軽食」
     */
    @Override
    public String getCategoryLabel() {
        return "軽食";
    }
}
