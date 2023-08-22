package labsheet9

object Q4 extends App {
  var bank: List[Accts] = List()

  bank = bank :+ new Accts("200022503270", 100121, 50000)
  bank = bank :+ new Accts("1922235477v", 100122, -1000)
  bank = bank :+ new Accts("1936945211v", 100123, 100000)
  bank = bank :+ new Accts("200046529811", 100124, 120000)

  println(bank)


  val negativeBalance = bank.filter((x: Accts) => x.balance < 0)
  printf("\nList of Accounts with negative balances : " + negativeBalance)


  val totalBalance: Double = bank.filter((x: Accts) => x.balance != 0).map(bank => bank.balance).reduce((x, y) => x + y)
  printf("\n\nSum of all account balances : " + totalBalance)


  val totalWithInterest = bank.map((x: Accts) => if (x.balance > 0) x.balance = x.balance * 1.5 else x.balance = x.balance * 1.1)
  totalWithInterest
  printf("\n\nFinal balances with interest : " + bank)

  class Accts(id: String, ac: Int, b: Double) {
    val nic = id
    val accNo = ac
    var balance = b


    def withdraw(a: Double) = this.balance - a


    def deposit(a: Double) = this.balance + a

    def transfer(a: Accts, b: Double) = {
      this.balance = this.balance - b
      a.balance = a.balance + b
    }

    override def toString = "[ " + nic + " : " + accNo + " : " + balance + " ]"
  }

}
