import scala.collection.immutable._
package bank{
  object Q4 {
    var accList:List[Account]= List()
    def createAccount(id:String, acc:String, b:Double): Unit ={
      val newAccount = new Account(id,acc, b)
      accList = accList ::: newAccount :: Nil
      print("Successfully added a new account => ")
      println(newAccount.NIC+" : "+newAccount.accNumber+" : "+newAccount.balance)

    }

    val find: (String, List[Account]) => List[Account] = (acc:String, l:List[Account]) => l.filter(x=>x.accNumber.equals(acc))

    val overdraft: List[Account] => List[Account] = (l:List[Account]) => l.filter(x=> x.balance <0.0)

    val totalBalance: List[Account] => Double = (l: List[Account] ) => l.foldLeft(0.0)((x, y) => x + y.balance)

    val interest: List[Account] => List[Account] = (l:List[Account]) => l.map(x => {
      x.balance match {
        case a if a>= 0 => x.deposit(x.balance*0.05)
        case _ => x.withdraw(Math.abs(x.balance)*0.1)
      }
      x
    })

    def main(args: Array[String]): Unit = {
      createAccount("986701613V", "6600004585", -1000)
      createAccount("986478613V", "6603254585", 1520)

      //negative balances
      println(overdraft(accList))


      //total balance of all accounts
      println(totalBalance(accList))

      //apply interest to the accounts
      println(interest(accList))

    }
  }
}
