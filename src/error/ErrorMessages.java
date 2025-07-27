package error;

public final class ErrorMessages {
	public static final String INVALID_PRODUCT_NAME = "商品名は必須です";
	public static final String INVALID_PRICE = "価格は1円以上である必要があります";
	public static final String INVALID_STOCK = "在庫数は0以上である必要があります";
	public static final String INVALID_INSERT_AMOUNT = "投入金額は1円以上である必要があります";
	public static final String INSUFFICIENT_FUNDS = "残高が不足しています。";
	public static final String NO_PAYMENT_METHOD = "支払い方法が未設定です";
	public static final String NULL_PRODUCT = "商品情報が設定されていません";
	public static final String OUT_OF_STOCK = "申し訳ありません。在庫がありません。";
	public static final String PAYMENT_FAILURE = "支払いに失敗しました。残高または決済状況をご確認ください。";
	public static final String PURCHASE_SUCCESS = "購入成功: ";
	public static final String SUGGESTION = "→ 残高をチャージするか、支払い方法を変更してください。";
	private ErrorMessages() {}
}







