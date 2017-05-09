package _1_Hello._5_arrays_generics

/**
  * Created by Ruslan.Kazantsev on 6/23/2016.
  */
object Array_Demo {
  //Arrays
  // public final int[] arr = new int[]{1, 2, 3, 4}
  val arr: Array[Int] = Array(1, 2, 3, 4)
  //public int elem2 = arr[2]
  var elem2: Int = arr(2)

  //GENERICS/Lists
  // public final java.util.List<Int> list = java.util.Arrays.asList(0, 1, 2, 3)
  val list: List[Int] = List(0, 1, 2, 3)
  // public int elem3 = list.get(3)
  var elem3: Int = list(3)

}
