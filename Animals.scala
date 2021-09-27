abstract class Animal {
  def makeSound(): String
  protected val legsCount: Int = 4
  def getLegsCount(): Int = {
    legsCount
  }
}

class Dog extends Animal {
  def makeSound(): String = {
    s"Bark!"
  }
}

class Cat extends Animal {
  def makeSound(): String = {
    s"Mew!"
  }
}

trait Wings {
  val canFly: Boolean = true
}

class Parrot extends Animal with Wings {
  def makeSound(): String = {
    s"Huy!"
  }
  override protected val legsCount: Int = 2
}

class Bat extends Animal with Wings {
  def makeSound(): String = {
    s"Pew!"
  }
}
