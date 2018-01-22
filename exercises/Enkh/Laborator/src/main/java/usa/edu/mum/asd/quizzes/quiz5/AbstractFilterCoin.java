package usa.edu.mum.asd.quizzes.quiz5;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractFilterCoin {

    AbstractFilterCoin nextFilterCoin;

    Coin coinType;

    AbstractFilterCoin(AbstractFilterCoin nextFilterCoin, Coin coinType) {
        this.nextFilterCoin = nextFilterCoin;
        this.coinType = coinType;
    }

    abstract public void handleRequest(Coin[] coins, HashMap<Coin, List<Coin>> result);

    protected final boolean canHandleRequest(Coin coin) {
        if (coin == null) return false;
        return coinType == coin;
    }
}
