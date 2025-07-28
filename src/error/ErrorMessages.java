package error;

/**
 エラーメッセージ
 */
public final class ErrorMessages {

    /** 商品名未入力エラー */
    public static final String INVALID_PRODUCT_NAME = "商品名は必須です";

    /** 価格が無効な場合のエラー（1円未満） */
    public static final String INVALID_PRICE = "価格は1円以上である必要があります";

    /** 在庫がマイナスの場合のエラー */
    public static final String INVALID_STOCK = "在庫数は0以上である必要があります";

    /** 投入金額が1円未満の場合のエラー */
    public static final String INVALID_INSERT_AMOUNT = "投入金額は1円以上である必要があります";

    /** ユーザー残高が不足している場合のエラー */
    public static final String INSUFFICIENT_FUNDS = "残高が不足しています。";

    /** 支払い方法が未設定の場合のエラー */
    public static final String NO_PAYMENT_METHOD = "支払い方法が未設定です";

    /** 商品情報が null の場合のエラー */
    public static final String NULL_PRODUCT = "商品情報が設定されていません";

    /** 在庫切れの場合のエラーメッセージ */
    public static final String OUT_OF_STOCK = "申し訳ありません。在庫がありません。";

    /** 支払いに失敗した場合のエラーメッセージ */
    public static final String PAYMENT_FAILURE = "支払いに失敗しました。残高または決済状況をご確認ください。";

    /** 購入成功時のメッセージ（商品名などを続けて表示） */
    public static final String PURCHASE_SUCCESS = "購入成功: ";

    /** ユーザーへの提案メッセージ */
    public static final String SUGGESTION = "→ 残高をチャージするか、支払い方法を変更してください。";

    /**
     * インスタンス化を防ぐための private コンストラクタ
     */
    private ErrorMessages() {}
}
