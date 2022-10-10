fun main() {
    var a1:Array<Int> = arrayOf(0, 2, 5, 1 , 14, 2, 18, 2)
    var res = Hsort(a1)
    for(r in res){
        print("$r ")
    }
    var s = "\n---------------------------------------------------"
    println(s)
    var stack:Stack = Stack()
    for(i in 0..100) {
        stack.push(i)
    }
    stack.pop()
    println(stack.find(4))
    stack.clear()
    println(stack.size())
}