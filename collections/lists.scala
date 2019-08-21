package collections

object lists {
  def main(args: Array[String]): Unit = {
    //animal = animal1
    val animal: List[String] = List("cat","dog","yanty")
    val animal1 = "cat" :: ("dog" :: ("yanty" :: Nil))
    //nums = nums1
    val nums: List[Int] = List(1,2,3,4)
    val nums1 = 1 :: (2 :: (3 :: (4 :: Nil)))
    println(animal(2)+nums.head+nums.tail)
    //Two Dimensional Lists
    val twoDim: List[List[Int]] =
      List(
        List(1,2,3),
        List(4,5,6),
        List(7,8,9)
      )
    val twoDim1 = (1 :: (2 :: (3 :: Nil)))::
                  (4 :: (5 :: (6 :: Nil)))::
                  (7 :: (8 :: (9 :: Nil))):: Nil
    println(twoDim(2)(2) + twoDim1(2)(2))

    //concatenating lists
    var animals = animal ::: animal1
    animals = List.concat(animal,animal1)
    println(animals)
  }
}
