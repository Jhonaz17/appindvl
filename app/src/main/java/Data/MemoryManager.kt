package Data

import Entities.Service
import Entities.Request
import Interfaces.IManager

object MemoryManager : IManager {

    private var serviceList = mutableListOf<Service>()
    private var requestList = mutableListOf<Request>()

    // Service methods
    override fun addService(service: Service) {
        serviceList.add(service)
    }

    override fun updateService(service: Service) {

    }

    override fun removeService(id: Int) {
        serviceList.removeIf { it.id == id }
    }

    override fun getAllServices(): List<Service> = serviceList.toList()

    override fun getServiceById(id: Int): Service? {
        return serviceList.find { it.id == id }
    }

    override fun getServiceByName(name: String): Service? {
        return serviceList.find { it.name == name }
    }

    // Request methods
    override fun addRequest(request: Request) {
        requestList.add(request)
    }

    override fun updateRequest(request: Request) {

    }

    override fun removeRequest(id: Int) {
        requestList.removeIf { it.id == id }
    }

    override fun getAllRequests(): List<Request> = requestList.toList()

    override fun getRequestById(id: Int): Request? {
        return requestList.find { it.id == id }
    }

    override fun getRequestByClientName(clientName: String): Request? {
        return requestList.find { it.clientName == clientName }
    }
}
