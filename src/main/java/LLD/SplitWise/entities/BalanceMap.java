package LLD.SplitWise.entities;

import java.util.HashMap;

public class BalanceMap {

    HashMap<String, HashMap<String, Double>> balanceMap;

    public BalanceMap() {
        this.balanceMap = new HashMap<>();
    }

    public HashMap<String, HashMap<String, Double>> getBalanceMap() {
        return balanceMap;
    }
}
