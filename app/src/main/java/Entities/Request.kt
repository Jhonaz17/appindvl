package Entities

class Request {
    private var _id: Int = 0
    private var _serviceId: Int = 0
    private var _clientName: String = ""
    private var _clientEmail: String = ""
    private var _status: String = ""

    constructor()

    constructor(id: Int, serviceId: Int, clientName: String, clientEmail: String, status: String) {
        this._id = id
        this._serviceId = serviceId
        this._clientName = clientName
        this._clientEmail = clientEmail
        this._status = status
    }

    var id: Int
        get() = this._id
        set(value) { this._id = value }

    var serviceId: Int
        get() = this._serviceId
        set(value) { this._serviceId = value }

    var clientName: String
        get() = this._clientName
        set(value) { this._clientName = value }

    var clientEmail: String
        get() = this._clientEmail
        set(value) { this._clientEmail = value }

    var status: String
        get() = this._status
        set(value) { this._status = value }
}
