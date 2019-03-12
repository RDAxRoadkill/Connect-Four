val x = "Avans"*3
println(x)

10 max 2

def succ(n: Int): Int = {
  n + 1
}
succ(7)

def max(x: Int, y: Int): Int ={
  if(x > y) x; else y
}
max(5, 6)
max(6, 7)

def doubleMe(x: Int): Int ={
  x + x
}
doubleMe(1)

def doubleUs(x: Int, y: Int): Int ={
  doubleMe(x) + doubleMe(y)
}
doubleUs(2, 2)

def doubleSmallNumber(x: Int): Int ={
  if(x > 100) x; else doubleMe(x)
}
doubleSmallNumber(101)
doubleSmallNumber(50)
