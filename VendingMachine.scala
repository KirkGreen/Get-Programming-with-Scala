class VendingMachine {
  private val chocolateBarPrice: Double = 1.0
  private val granolaBarPrice: Double = 1.5

  private var chocolateBar: Int = 0
  private var granolaBar: Int = 0
  private var totalMoney: Double = 0.0

  def getTotalMoney(): Double = totalMoney

  def addBars(count: Int, barType: String): Unit = {
    if(count < 0) {
      throw new Exception("Count should be count > 0")
    }

    if(barType == "chocolate"){
      chocolateBar += count
    } else if (barType == "granola"){
      granolaBar += count
    } else {
      throw new Exception("Unknown bar type!")
    }
  }

  def popBar(barType: String): Unit = {
    if(barType == "chocolate"){
      chocolateBar -= 1
    } else if (barType == "granola"){
      granolaBar -= 1
    } else {
      throw new Exception("Unknown bar type!")
    }
  }

  def getPrice(barType: String): Double = {
    barType match {
      case "chocolate" => chocolateBarPrice
      case "granola" => granolaBarPrice
      case _ => 0.0
    }
  }

  def isBarAvailable(barType: String): Boolean = {
    barType match {
      case "chocolate" => chocolateBar > 0
      case "granola" => granolaBar > 0
      case _ => false
    }
  }

  def buy(barType: String, money: Double): String = {
    if(!isBarAvailable(barType)){
      throw new Exception("Bar(s) is not avalable")
    }

    val barPrice = getPrice(barType)

    if (barPrice > money) {
      throw new Exception("Put more money!")
    }

    val change = money - barPrice

    totalMoney += barPrice;
    popBar(barType)


    s"Take your $change$$"
  }
}

