
  import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object MyClass{
  class Account(id:string,n:Int,b:Double)
{
val ID:String=id
val accountno:Int=n
var balance:Double=b

def withdraw(a:Double)=this.balance=this.balance-a
def deposit(a:Double)=this.balance=this.balance+a
def transfer(a:Account,b:Double)={this.withdraw(b)
a.deposit(b)
}

override def toString="["+ID+":"+accountno+":"+balance+"]"
}


def main(args:Array[String])
{
var a1=new Account("978563214",8096111,2500.00)
var a2=new Account("988563284",8096112,27700.00)
var a3=new Account("968763563",8096113,-5600.00)
var a4=new Account("975638217",8096114,-2500.00)
var a5=new Account("875695614",8096115,300000.00)

var bank:List[Account]=list(a1,a2,a3,a4,a5)
val negative=(b:List[Account])=>b.filter(_.balance<0)
val balance=(b:List[Account])=>b.map(_.balance).sum



println("\nList of negative balance: "+negative(bank))
println("\nsum of balance: "+balance(bank))
}
}

















