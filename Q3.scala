package labsheet9

object Q3 extends App {
  var bank: List[Account] = List()

  bank = bank :+ new Account("200022503270", 100121, 50000)
  bank = bank :+ new Account("1922235477v", 100122, 80500)
  bank = bank :+ new Account("1936945211v", 100123, 100000)
  bank = bank :+ new Account("200046529811", 100124, 120000)

  println(bank)

  bank(2).transfer(bank(0), 10000)
  println("Money transfer between accounts ->")
  println(bank)

  class Account(id: String, ac: Int, b: Double) {
    val nic = id
    val accNo = ac
    var balance = b


    def withdraw(a: Double) = this.balance - a

    def deposit(a: Double) = this.balance + a


    def transfer(a: Account, b: Double) = {
      this.balance = this.balance - b
      a.balance = a.balance + b
    }


    override def toString = "[ " + nic + " : " + accNo + " : " + balance + " ]"
  }


}
