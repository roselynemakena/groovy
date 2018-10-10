package com.src.live

import groovy.transform.ToString

@ToString
class Account{

    BigDecimal balance
    Account plus(Account two){
        new Account(balance: this.balance + two.balance)
    }

    void deposit(def amt){
        this.balance = amt
    }

    void withdraw(){
    }
}

Account acc1 = new Account()
acc1.deposit(200)
Account acc2 = new Account()
acc2.deposit(100)

println(acc1 + acc2)

//println(acc1.plus(acc2))




