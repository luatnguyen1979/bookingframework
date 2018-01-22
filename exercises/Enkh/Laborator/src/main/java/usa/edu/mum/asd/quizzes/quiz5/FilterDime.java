package usa.edu.mum.asd.quizzes.quiz5;

import java.util.List;
import java.util.HashMap;
import java.util.Random;

public class FilterDime extends AbstractFilterCoin {

    FilterDime(AbstractFilterCoin nextFilterCoin) {
        super(nextFilterCoin, Coin.DIME);
    }

    @Override
    public void handleRequest(Coin[] coins, HashMap<Coin, List<Coin>> result) {
        Random random = new Random();
        int len = coins.length;
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(len);
            if (canHandleRequest(coins[index])) {
                coins[index] = null;
                result.get(coinType).add(coins[index]);
            }
        }
        if (nextFilterCoin != null) {
            nextFilterCoin.handleRequest(coins, result);
        }
    }
}
