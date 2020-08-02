import jdk.nashorn.internal.ir.IdentNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test1 {
    private Array array;
    int checkFlag = 0;
    int checkFlag1_4 = 0;


    @BeforeEach
    public void init() {
        array = new Array();
    }
//Пытался другими способами но пока что не вышло
//Не придумал а как передавать массив данных в аргумент
//Сделал скорей всего по очень простому и глупому
    @Test
    public void testcreate() {

        final int check[] = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        array.create(check);
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 4) {
                checkFlag++;

            }

        }
        if (checkFlag == 0) {
            Assertions.assertThrows(RuntimeException.class, () -> {
                System.out.println("Not exist 4");

            });
        }
    }
    @Test
    public void testcreate1() {

        final int check[] = {1, 2, 3, 5, 4, 3, 5, 6, 7};
        array.create(check);
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 4) {
                checkFlag++;

            }

        }
        if (checkFlag == 0) {
            Assertions.assertThrows(RuntimeException.class, () -> {
                System.out.println("Not exist 4");

            });
        }
    }
    @Test
    public void testcreate2() {

        final int check[] = {1, 2, 4, 5, 6, 8, 5, 6, 7};
        array.create(check);
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 4) {
                checkFlag++;

            }

        }
        if (checkFlag == 0) {
            Assertions.assertThrows(RuntimeException.class, () -> {
                System.out.println("Not exist 4");

            });
        }
    }
    @Test
    public void testcreate3() {

        final int check[] = {1, 2, 3, 2, 2, 2, 5, 6, 7};
        array.create(check);
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 4) {
                checkFlag++;

            }

        }
        if (checkFlag == 0) {
            Assertions.assertThrows(RuntimeException.class, () -> {
                System.out.println("Not exist 4");

            });
        }
    }
    @Test
    public void testcreate4() {
        int check[] = {1, 2, 3, 2, 2, 2, 5, 6, 7};
        int check1[] = {1, 1, 1, 1, 4, 4, 4, 4, 4};
        int check2[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int check3[] = {4, 4, 4, 4, 4, 4, 4, 4, 4};
        int check4[] = {1, 1, 1, 4, 4, 4, 4, 4, 6};
        System.out.print("-> "+array.check14(check));
        System.out.println(" ");
        System.out.print("-> "+array.check14(check1));
        System.out.println(" ");
        System.out.print("-> "+array.check14(check2));
        System.out.println(" ");
        System.out.print("-> "+array.check14(check3));
        System.out.println(" ");
        System.out.print("-> "+array.check14(check4));


    }
   /* @ParameterizedTest
    @MethodSource("dataForAddOperation")
    public void testcreate(Integer check[]) {
        array.create1(check);
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 4) {
                checkFlag++;

            }

        }
        if (checkFlag == 0) {
            Assertions.assertThrows(RuntimeException.class, () -> {
                System.out.println("Not exist 4");

            });
        }
    }
    public static Stream<Integer> dataForAddOperation() {
        List<Integer> out = new ArrayList<>();
        Integer check[] = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        out.addAll(Arrays.asList(check));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForAddOperation")
    public void testcreate1(Integer check[]) {
        // final int check[] = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        array.create(check);
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 4) {
                checkFlag++;

            }

        }
        if (checkFlag == 0) {
            Assertions.assertThrows(RuntimeException.class, () -> {
                System.out.println("Not exist 4");

            });
        }

    }

    public static Stream<Integer> dataForAddOperation() {
        List<Integer> out = new ArrayList<>();
        Integer check[] = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        out.addAll(Arrays.asList(check));
        Integer check1[] = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        out.addAll(Arrays.asList(check1));
        Integer check2[] = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        out.addAll(Arrays.asList(check2));
        return out.stream();
    }

   */
}
