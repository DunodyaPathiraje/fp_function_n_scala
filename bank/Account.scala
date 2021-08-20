package bank

class Account (id:String, acc:String, b:Double) {
  val NIC:String = id
  val accNumber:String = acc
  var balance: Double = b

  def withdraw(money:Double): Unit = {
    this.balance = this.balance - money
  }

  def deposit(money:Double): Unit = {
    this.balance = this.balance + money
  }

  def transfer(account:Account, money:Double): Unit ={
    if (balance < 0.0)
      println("Insufficient balance")
    else {
//      this.balance = this.balance - money
//      account.balance = account.balance + money
      this.withdraw(money)
      account.deposit(money)
    }

//    @Override
//    override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.accNumber + "\n Balance : " + this.balance
  }
}
