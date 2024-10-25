// package Model
package Model

import Data.MemoryManager
import Entities.Request
import Entities.Service
import Interfaces.IManager
import android.content.Context
import cr.ac.utn.totalassist.R

class ServiceModel {
    private var manager: IManager = MemoryManager
    private lateinit var _context: Context

    constructor(context: Context) {
        _context = context
    }

    fun addService(service: Service) {
        manager.addService(service)
    }

    fun getServices() = manager.getAllServices()

    fun getService(id: Int): Service {
        val result = manager.getServiceById(id)
        if (result == null) {
            val message = _context.getString(R.string.msgServiceNotFound)
            throw Exception(message)
        }
        return result
    }

    fun removeService(id: Int) {
        val result = manager.getServiceById(id)
        if (result == null) {
            val message = _context.getString(R.string.msgServiceNotFound)
            throw Exception(message)
        }
        manager.removeService(id)
    }

    fun updateService(service: Service) {
        manager.updateService(service)
    }

    fun getServiceByName(name: String): Service {
        val result = manager.getServiceByName(name)
        if (result == null) {
            val message = _context.getString(R.string.msgServiceNotFound)
            throw Exception(message)
        }
        return result
    }
}

class RequestModel {
    private var manager: IManager = MemoryManager
    private lateinit var _context: Context

    constructor(context: Context) {
        _context = context
    }

    fun addRequest(request: Request) {
        manager.addRequest(request)
    }

    fun getRequests() = manager.getAllRequests()

    fun getRequest(id: Int): Request {
        val result = manager.getRequestById(id)
        if (result == null) {
            val message = _context.getString(R.string.msgRequestNotFound)
            throw Exception(message)
        }
        return result
    }

    fun removeRequest(id: Int) {
        val result = manager.getRequestById(id)
        if (result == null) {
            val message = _context.getString(R.string.msgRequestNotFound)
            throw Exception(message)
        }
        manager.removeRequest(id)
    }

    fun updateRequest(request: Request) {
        manager.updateRequest(request)
    }

    fun getRequestByClientName(clientName: String): Request {
        val result = manager.getRequestByClientName(clientName)
        if (result == null) {
            val message = _context.getString(R.string.msgRequestNotFound)
            throw Exception(message)
        }
        return result
    }
}
