package Util

import android.content.Context
import android.content.Intent
import android.widget.Toast

class util {
    companion object {
        // Método para abrir una nueva actividad
        fun openActivity(context: Context, objClass: Class<*>) {
            val intent = Intent(context, objClass)
            context.startActivity(intent)
        }

        // Método para mostrar un mensaje Toast
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        // Método para iniciar una actividad con un mensaje de éxito
        fun openActivityWithMessage(context: Context, objClass: Class<*>, message: String) {
            openActivity(context, objClass)
            showToast(context, message)
        }
    }
}
