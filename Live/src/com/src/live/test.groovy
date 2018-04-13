
def getRandomFloatFromLong(def base = 2846, def salt = 312419745254431l ) {
    def baseBigInt = BigDecimal.valueOf(base)
    def saltBigInt = BigDecimal.valueOf(salt)
    println(saltBigInt)
    println(baseBigInt * saltBigInt)

    def seed = ((baseBigInt * saltBigInt) % BigDecimal.valueOf(BigInteger.valueOf(Long.MAX_VALUE)))
    new Random(seed).nextFloat()
}

println("Result: " +getRandomFloatFromLong())

//println(Long.MAX_VALUE)
//println(BigDecimal.valueOf(34534533).class)