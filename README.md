# Aplicacion Publicacion y Solicitud de servicios generales
**Objetivo General:** Desarrollar una aplicación móvil que permita a los usuarios publicar y solicitar servicios generales (limpieza, mantenimiento, reparaciones, etc.) según su perfil de usuario. La aplicación debe proporcionar una experiencia personalizada, dependiendo de si el usuario es un proveedor de servicios o un solicitante.

**Objetivos Específicos:**

**Publicar Servicios:**
Permitir a los usuarios registrados como proveedores de servicios publicar nuevos servicios generales, especificando detalles como tipo de servicio, descripción, precio, disponibilidad y ubicación.

**Solicitar Servicios:**
Facilitar que los usuarios registrados como solicitantes busquen y seleccionen servicios ofrecidos por los proveedores, solicitando directamente aquellos que satisfagan sus necesidades.

**Perfil de Usuario:**
Implementar un sistema de roles que diferencie entre proveedores y solicitantes. Dependiendo del rol asignado al usuario (proveedor o solicitante), la interfaz y funcionalidad de la aplicación cambiará.

**Sistema de Solicitudes:**
Proporcionar una funcionalidad para que los solicitantes puedan hacer una solicitud de un servicio, y que los proveedores puedan gestionar estas solicitudes (aceptarlas, rechazarlas, comunicarse con el solicitante, etc.).

**Notificaciones:**
Implementar un sistema de notificaciones que informe a los usuarios de actualizaciones importantes, como solicitudes de servicio recibidas, aceptación o rechazo de las mismas.

**Sistema de Evaluación:**
Permitir que los usuarios califiquen y dejen comentarios sobre los servicios solicitados y los proveedores, creando un sistema de reputación.

**Funcionalidades Clave:**

**Autenticación y Perfiles de Usuario:**

Los usuarios deben poder registrarse e iniciar sesión con su cuenta, definiendo si son proveedores de servicios o solicitantes al momento del registro. El perfil del usuario incluirá información personal, preferencias, historial de servicios, entre otros.

**Publicación de Servicios:**
Los proveedores podrán publicar sus servicios generales, especificando detalles importantes como el tipo de servicio, la duración estimada, el costo, y su disponibilidad horaria. También tendrán la opción de actualizar, eliminar o pausar sus servicios cuando sea necesario.

**Búsqueda y Solicitud de Servicios:**
Los solicitantes podrán buscar servicios utilizando filtros (ubicación, tipo de servicio, rango de precios) y solicitar aquellos que consideren apropiados. Podrán ver los detalles del proveedor, como calificaciones y reseñas previas.

**Gestión de Solicitudes:**
Los proveedores recibirán notificaciones cuando un solicitante realice una solicitud de servicio. Podrán aceptar o rechazar la solicitud y coordinar detalles adicionales a través de la aplicación (chat, llamada, etc.).

**Sistema de Pago:**
Integrar una pasarela de pagos para que los solicitantes puedan realizar pagos directamente a los proveedores a través de la aplicación. Esto puede incluir el pago completo o un depósito previo al servicio.

**Sistema de Calificaciones y Reseñas:**
Después de completar un servicio, los solicitantes podrán calificar y dejar comentarios sobre el proveedor, lo que contribuirá a la reputación dentro de la plataforma.

**Panel de Control por Rol:**
Los proveedores tendrán un panel de control donde puedan ver y gestionar los servicios que ofrecen, revisar solicitudes, ver el historial de servicios completados, y administrar pagos.
Los solicitantes tendrán acceso a un panel donde podrán gestionar las solicitudes que han realizado, revisar el estado de los servicios solicitados, y ver su historial.

**Flujo de la Aplicación:**

**Registro e Inicio de Sesión:**
El usuario elige entre registrarse como proveedor o solicitante.

**Navegación:**
Los solicitantes pueden navegar por los servicios disponibles y los proveedores pueden gestionar sus publicaciones.

**Solicitar o Publicar Servicios:**
Dependiendo del perfil, los usuarios pueden solicitar servicios o publicar y gestionar sus ofertas de servicios.

**Gestión de Solicitudes:**
Las solicitudes de servicios son gestionadas por los proveedores, quienes pueden aceptar o rechazar las mismas.

**Pago y Confirmación:**
Una vez aceptada la solicitud, el solicitante realiza el pago y el proveedor ejecuta el servicio.

**Calificación y Feedback:**
Tras finalizar el servicio, el solicitante deja una reseña y calificación del proveedor.
