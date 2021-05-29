import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    /**
     * 1. Отсутствуют скрытые параметры;
     * 2. Отсутствуют попобчные эффекты;
     * 3. Не изменяется состояние объекта (Использование функционального интерфейса Function);
     * 4. Использование монады (Stream);
     * 5. Детерминированность функции (Использование функционального интерфейса Function);
     */
    public static Function<String, List<String>> createDictionary = note -> {
      return Arrays.stream(note.split(" "))
              .sorted()
              .collect(Collectors.toList());
    };

    public static void main(String[] args) {
        // Некая записка с непонятными словами
        String note = "asd k sd dsjfkuw ewrfs sdf asdkn iweor hdbfjs dfas aw wuuj wdfsclkj iwe we kz";
        System.out.println(createDictionary.apply(note));
    }
}
