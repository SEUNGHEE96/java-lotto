package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Judgement {
    public List<Integer> winningTable = new ArrayList<>();
    public int rankLotto(List<Integer> lottery, List<Integer> winningNumber) {
        int result = 0;
        for (int i=0; i<lottery.size(); i++){
            int correctNumber = winningNumber.get(i);
            if (lottery.contains(correctNumber)) {
                result ++;
            }
        }
        return result;
    }
    public boolean secondPrize(List<Integer> lottery, int bonus, int result) {
        boolean second = false;
        if (result == 5) {
            if (lottery.contains(bonus)){
                second = true;
            }
        }
        return second;
    }
    public List<Integer> makeWinningTable(List<List<Integer>> lotterys, List<Integer> winningNumber){
        for (List<Integer> lottery : lotterys){
            int result = rankLotto(lottery, winningNumber);
            winningTable.add(result);
        }
        return winningTable;
    }
}
