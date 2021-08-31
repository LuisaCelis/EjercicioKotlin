package co.edu.eam.disenosoftware.ejercicio.model

class Customer {
    var accounts: MutableList<Account>
    var name: String
    var lastName: String
    var id: String
    val city: String

    constructor(name: String, lastName: String, id: String, city: String) {
        this.name = name
        this.lastName = lastName
        this.id = id
        accounts = mutableListOf()
        this.city = city
    }

    /**
     * sum balance of all accounts
     */
    fun calculateBalance(): Double {
        return accounts.sumOf { it.balance }
    }

    /**
     * sum balance from check accounts only
     */
    fun calculateBalanceCheckAccounts(): Double {
       val cheques = accounts.filter { it.typeEnum == TypeAccountEnum.CHECK }
        return cheques.sumOf { it.balance }
    }

    /**
     * sum balance from saving accounts only
     */
    fun calculateBalanceSavingAccounts(): Double {
        val ahorros = accounts.filter { it.typeEnum == TypeAccountEnum.SAVE }
        return ahorros.sumOf { it.balance }
    }

    override fun toString(): String {
        return "Customer(accounts=$accounts, name='$name', lastName='$lastName', id='$id', city='$city')"
    }


}