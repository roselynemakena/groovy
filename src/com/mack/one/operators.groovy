package com.mack.one

class Operators {

    void doMath(){
        assert 1+1 == 2
        assert 12-2 == 10
        assert 12/6 == 2
        assert 10 % 2 == 0
        assert 10*10 == 100
        assert 10 ** 2 == 100
    }

    void binaryOps(){
        def x = 5
        assert (a+=1) == 6
        assert (a*=2) == 10
        assert (a-=1) == 4

    }

    void relationalOps(){
        assert 3 > 2
        assert 13 != 9
       assert 2>1

    }
    void logicalOps(){
    assert !false
        assert true && true
        assert true || false
    }
    void conditionalOps(){
        
    }
}

Operators ops = new Operators().doMath()
println(ops)
