//3. Implement a Data Structure for Account  and create a method
// transfer which transfer the money from this account to a given account.

package bank{

  object Q3 {
    var accList:List[Account]= List()
    def createAccount(id:String, acc:String, b:Double): Unit ={
      val newAccount = new Account(id,acc, b)
      accList = accList ::: newAccount :: Nil
      print("Successfully added a new account => ")
      println(newAccount.NIC+" : "+newAccount.accNumber+" : "+newAccount.balance)

    }
    val find: (String, List[Account]) => List[Account] = (acc:String, l:List[Account]) => l.filter(x=>x.accNumber.equals(acc))



    def main(args: Array[String]): Unit = {
//      println("Hello")
      createAccount("986701613V", "6600004585", 1000)
      createAccount("986478613V", "6603254585", 1520)

      //Transfer money from "6603254585" to "6600004585"
      find("6603254585", accList).head.transfer(accList(1), 500)
      println(find("6600004585", accList).head)

    }

  }
}
