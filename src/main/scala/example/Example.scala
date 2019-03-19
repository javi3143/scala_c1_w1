package example

object Example extends App{
  def pascal(c: Int, r: Int): Int =
    if (c == 0 && r == 0)
      return 1
    else if (c == 0 || c == r)
      return 1
    else
      return pascal(c - 1, r - 1) + pascal(c, r - 1)
}
