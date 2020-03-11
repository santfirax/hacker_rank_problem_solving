import java.util.Arrays;
import java.util.List;

/**
 * @author José Santiago Molano
 * email: santfirax@gmail.com
 * 3/11/2020
 */
public class CounterPlusMinusImpl implements Counter {
    int countOfPositiveNumbers = 0;
    int countOfNegativeNumbers = 0;
    int countOfZeros = 0;


    @Override
    public List<Integer> count(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number > 0) {
                countOfPositiveNumbers++;
            } else if (number < 0) {
                countOfNegativeNumbers++;
            } else {
                countOfZeros++;
            }
        }
        return Arrays.asList(countOfPositiveNumbers, countOfNegativeNumbers, countOfZeros);
    }
}
