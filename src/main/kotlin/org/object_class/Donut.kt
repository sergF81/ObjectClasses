package org.object_class

import java.util.*

data class Donut (
    //информаци€ о записи VK Donut:
    var is_donut: Boolean = false, // Ч запись доступна только платным подписчикам VK Donut;
    var paid_duration: Int = 0, // Ч врем€, в течение которого запись будет доступна только платным подписчикам VK Donut;
    var placeholder: Object = Object(), //  Ч заглушка дл€ пользователей, которые не оформили подписку VK Donut. ќтображаетс€ вместо содержимого записи.
    var can_publish_free_copy: Boolean = false, // Ч можно ли открыть запись дл€ всех пользователей, а не только подписчиков VK Donut;
var edit_mode: String = "", // Ч информаци€ о том, какие значени€ VK Donut можно изменить в записи. ¬озможные значени€:
var all: String = "всю информацию о VK Donut.",
    var duration: String = "врем€, в течение которого запись будет доступна только платным подписчикам VK Donut."
        )
