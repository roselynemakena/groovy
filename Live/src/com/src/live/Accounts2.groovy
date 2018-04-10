package com.src.live

import groovy.transform.ToString


@ToString(includePackage = false)
class Accounts{
    BigDecimal balance  = 0.0
    String type = "Total"
    String description

    Accounts minus(Accounts two){
        new Accounts(balance: this.balance - two.balance)
    }

    void deposit(int amt){
        this.balance = amt
    }
    void withdraw(int amt){
        this.balance -+ amt
    }
}


Accounts acc1 = new Accounts(type: "Savings", description: "Account to save money for the longterm")
acc1.deposit(900)
Accounts acc2 = new Accounts(type: "Current", description: "Easy withdrawal and deposits at any time")
acc2.deposit(200)

println(acc1)

println(acc1-acc2)
