package plus_minus_challenge;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author José Santiago Molano
 */
public class PlusMinus {
    private List<Integer> numbers;
    private static NumberFormat formatter = new DecimalFormat("#0.000000");
    private Counter counter = new CounterPlusMinusImpl();

    public PlusMinus(Integer... numbers) {
        this.numbers = Arrays.asList(numbers);
    }

    public void calculateFractions() {
        float count = this.numbers.size();
        List<Integer> countNumbers = counter.count(numbers);
        List<Float> results = countNumbers.stream().map(number -> number / count).collect(Collectors.toList());
        results.forEach(PlusMinus::displayNumbers);
    }

    private static void displayNumbers(Float number) {
        System.out.println(formatter.format(number));
    }


}
