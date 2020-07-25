package lesson_three;

import java.util.*;

public class Collections {

//    static int a0 = 5;
//    //static Integer a1 = a0;
//    static Integer a1 = new Integer(5);
//    Float f;
//    Byte by;
//    Short s;
//    Boolean b;
//    Long l;
//    Double d;
//    Character c;

    /*
    1. Создать массив с набором слов
      (20-30 слов, должны встречаться повторяющиеся):
	  - Найти список слов, из которых состоит текст
	  (дубликаты не считать);
	  - Посчитать сколько раз встречается каждое слово
	  (использовать HashMap);

	 2. Написать простой класс PhoneBook(внутри использовать HashMap):
	  - В качестве ключа использовать фамилию
	  - В каждой записи всего два поля: phone, e-mail
	  - Отдельный метод для поиска номера телефона по фамилии
	  (ввели фамилию, получили ArrayList телефонов),
	  и отдельный метод для поиска e-mail по фамилии.
	  Следует учесть, что под одной фамилией может быть несколько
	  записей. Итого должно получиться 3 класса Main, PhoneBook, Person.

    * */

    public static void main(String[] args) {

        HashMap<String, Integer> months = new LinkedHashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);

        System.out.println(months);
        System.out.println(months.get("December"));
        System.out.println(months.containsValue(3));
        System.out.println(months.containsKey("March"));

//        Map.Entry<String, Integer> entry;   // one map element type
        Set<Map.Entry<String, Integer>> set = months.entrySet();
        //        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> e = iterator.next();
//            System.out.println("K " + e.getKey() + ", V " + e.getValue());
//        }
        for (Map.Entry<String, Integer> e : set) {
            System.out.println("K " + e.getKey() + ", V " + e.getValue());
        }

//        Box b3 = new Box(3, 3);
//        Box b4 = new Box(4, 4);
//        Box b5 = new Box(4, 4);
//        Box b6 = new Box(8, 2);
//        Box b1 = new Box(1, 1);
//        Box b2 = new Box(2, 2);
//
//        TreeSet<Box> set = new TreeSet<>();
//        set.add(b1);
//        set.add(b2);
//        set.add(b3);
//        set.add(b4);
//        set.add(b5);
//        set.add(b6);
//        System.out.println(set);

//        Box b1 = new Box(1, 1);
//        LinkedList<Box> list = new LinkedList<>();
//        list.add(b1);
//        list.add(new Box(2, 2));
//        list.add(new Box(3, 3));
//        System.out.println(list);
//
//        Box b4 = new Box(1, 1);
//        System.out.println(list.contains(b4));
//
//        System.out.println(b1);
//
//        System.out.println(b4.getClass().getName() + "@" + Integer.toHexString(b4.hashCode()));

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("The");
//        list.add("Big");
//        list.add("World");
//        list.add("Of");
//        list.add("Java");
//
//        list.remove(list.size() - 1);

//        list.remove(0);
//        System.out.println(list);
//        System.out.println(list.get(0));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//            if (i == 3)
//                list.remove("World");
//            System.out.print(list.get(i) + " ");
//        }

//        for (String s : list) {
//            System.out.println(s + " ");
//        }
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//
//        if (list.contains("Hello"))
//            System.out.println(list.remove(0));

//        int i0 = 5;
//        Integer i1 = i0;
//        int i2 = i1;
//
//        System.out.println(i0);
//        System.out.println(i1);
//        System.out.println(i2);
    }
}
