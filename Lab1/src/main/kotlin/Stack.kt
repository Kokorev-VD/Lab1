class Stack {
    private var a:Array<Int> = Array(10) {x->0}
    private var head = -1
    public fun push(n: Int){
        if (head+1 == a.size){
            var b:Array<Int> = Array(a.size*2){x->0}
            for(x in a.indices){
                b[x] = a[x]
            }
            a = b
        }
        a[++head] = n
    }
    public fun pop(){
        if(head==-1){
            println("Empty stack! Operation canceled")
        }
        else{
            a[head--] = 0
        }
    }
    public fun size() = head+1
    public fun clear(){
        a = Array(10) {x->0}
        head = -1
    }
    public fun find(index: Int):Int{
        if(index>head){
            println("Index out of bounds!")
            return -1
        }
        else{
            return a[index]
        }
    }
}