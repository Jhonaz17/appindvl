package Entities

class Service {
    private var _id: Int = 0
    private var _name: String = ""
    private var _description: String = ""
    private var _price: Double = 0.0
    private var _status: String = "active"

    constructor()

    constructor(id: Int, name: String, description: String, price: Double, status: String) {
        this._id = id
        this._name = name
        this._description = description
        this._price = price
        this._status = status
    }

    var id: Int
        get() = this._id
        set(value) { this._id = value }

    var name: String
        get() = this._name
        set(value) { this._name = value }

    var description: String
        get() = this._description
        set(value) { this._description = value }

    var price: Double
        get() = this._price
        set(value) { this._price = value }

    var status: String
        get() = this._status
        set(value) { this._status = value }
}
