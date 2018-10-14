package gdk

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

BlockingQueue queue = [] as LinkedBlockingQueue

Thread.start('push') {
    10.times {
        try{
            println("${Thread.currentThread().name} \t ${it}")
            queue << it
            sleep(100)
        }catch(InterruptedException e){
            println(e)
        }
    }
}

Thread.start('pop') {
    for(i in 9..0){
        sleep 200
        println("${Thread.currentThread().name} \t ${queue.take()}")
    }
}
