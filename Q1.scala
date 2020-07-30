
object Negation extends App 
{
val x= new Rational(2,5)
val y= new Rational(6,9)

val n1=x.neg
val n2=y.neg
println(n1)
println(n2)

}

class Rational(n:Int,d:Int)
{
require(d!=0,"denominator must be non-zero")
def numer=n
def denom=d

def neg=new Rational(-this.numer,this.denom)
override def toString= numer + "/"+ denom
}