package usa.edu.mum.asd.quizzes.quiz5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        AbstractFilterCoin filterPenny = new FilterPenny(null);
        AbstractFilterCoin filterNickle = new FilterNickle(filterPenny);
        AbstractFilterCoin filterDime = new FilterDime(filterNickle);
        AbstractFilterCoin filterQuarter = new FilterQuarter(filterDime);
        AbstractFilterCoin filterDollar = new FilterDollar(filterQuarter);
        Coin[] coins = new Coin[100];
        HashMap<Coin, List<Coin>> result = new HashMap();
        result.put(Coin.DOLLAR, new LinkedList<>());
        result.put(Coin.QUARTER, new LinkedList<>());
        result.put(Coin.NICKLE, new LinkedList<>());
        result.put(Coin.DIME, new LinkedList<>());
        result.put(Coin.PENNY, new LinkedList<>());
        Random random = new Random();
        int n;
        for (int i = 0; i < 100; i++) {
            n = random.nextInt(5);
            if (n == 0) {
                coins[i] = Coin.PENNY;
            } else if (n == 1) {
                coins[i] = Coin.NICKLE;
            } else if (n == 2) {
                coins[i] = Coin.DIME;
            } else if (n == 3) {
                coins[i] = Coin.QUARTER;
            } else if (n == 4) {
                coins[i] = Coin.DOLLAR;
            }
        }
        filterDollar.handleRequest(coins, result);
        int total = 0;
        for (Coin key : result.keySet()) {
            total += result.get(key).size();
            System.out.println(String.format("Coin=%s, Total=%s", key.getAmount(), result.get(key).size()));
        }
        System.out.println(String.format("Total=%s", total));
    }
}
