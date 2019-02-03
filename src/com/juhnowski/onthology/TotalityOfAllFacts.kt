package com.juhnowski.onthology

class TotalityOfAllFacts {
    var facts = Facts()

    companion object {

        @Volatile
        private var instance: TotalityOfAllFacts? = null

        fun getInstance(): TotalityOfAllFacts {
            var localInstance = instance
            if (localInstance == null) {
                synchronized(TotalityOfAllFacts::class.java) {
                    localInstance = instance
                    if (localInstance == null) {
                        localInstance = TotalityOfAllFacts()
                        instance = localInstance
                    }
                }
            }
            return localInstance
        }
    }
}
