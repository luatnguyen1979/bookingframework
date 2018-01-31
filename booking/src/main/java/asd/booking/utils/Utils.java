/**
 * 
 */
package asd.booking.utils;

/**
 * @author luatnguyen
 *
 */
public class Utils {
	public static final CardType getCardType(String cardType) {
		if (null == cardType) {
			return CardType.VISA;
		}
		CardType type = CardType.VISA;
		switch (cardType) {
		case "VISA":
			type = CardType.VISA;
			break;
		case "MASTERCARD":
			type = CardType.DISCOVERY;
			break;
		case "DISCOVER":
			type = CardType.DISCOVERY;
			break;
		case "JCB":
			type = CardType.JCB;
			break;
		 default:
			type = CardType.VISA;
		}
		return type;
	}

}
