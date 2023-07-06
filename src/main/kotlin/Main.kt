fun main(){
    var  mystack=Stack()
     println(mystack.pop())
    mystack.push(5)
    mystack.push(24)
    mystack.push(24)
    mystack.push(62)
    println( mystack.peek())
    mystack.pop()
   println(mystack.peek())
    mystack.push(12)
    mystack.push(14)
    mystack.push(45)
    mystack.push(23)
    var x=mystack.pop()
    var y=mystack.pop()
    var z=x!!+y!!
    println(z)
   println( mystack.peek())

    



}
class Stack{
    var data= mutableListOf<Int>()

    fun push(value:Int){
        data.add(value)
    }
    fun pop():Int?{
        if (data.isEmpty()){
            return null
        }
        var top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }



}
class Stack1{
    var data= mutableListOf<Int>()

    fun push(value:Int){
        data.add(value)
    }
    fun pop():Int?{
        if (data.isEmpty()){
            return null
        }
        var top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }



}