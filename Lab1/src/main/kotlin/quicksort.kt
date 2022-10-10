public fun Hsort(mas: Array<Int>): Array<Int> {
    var op = mas[mas.size/2-1]
    var a1i = 0
    var a2i = 0
    for (i in mas.indices){
        if(i != mas.size/2-1){
            if(mas[i] < op) {
                a1i++
            }
            else{
                a2i++
            }
        }
    }
    var a1:Array<Int> = Array(a1i) {x -> 0}
    var a2:Array<Int> = Array(a2i) {x -> 0}
    a1i = 0
    a2i = 0
    for (i in mas.indices){
        if(i != mas.size/2-1){
            if(mas[i] < op) {
                a1[a1i] = mas[i]
                a1i++
            }
            else{
                a2[a2i] = mas[i]
                a2i++
            }
        }
    }
    if(a1i>=2) a1 = Hsort(a1)
    if(a2i>=2) a2 = Hsort(a2)
    return a1 + op + a2
}
