package Interfaces

import Entities.Request
import Entities.Service

interface IManager {
    // Métodos para manejar Requests
    fun addRequest(request: Request)
    fun updateRequest(request: Request)
    fun removeRequest(id: Int)
    fun getAllRequests(): List<Request>
    fun getRequestById(id: Int): Request?
    fun getRequestByClientName(clientName: String): Request?

    // Métodos para manejar Services
    fun addService(service: Service)
    fun updateService(service: Service)
    fun removeService(id: Int)
    fun getAllServices(): List<Service>
    fun getServiceById(id: Int): Service?
    fun getServiceByName(name: String): Service?
}
