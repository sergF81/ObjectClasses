package org.object_class

data class Comments(                  //object  информаци€ о комментари€х к записи, объект с пол€ми:
    val count: Int = 0,                //(integer) Ч количество комментариев
    val canPost: Boolean = false,         //* (integer, [0,1]) Ч информаци€ о том, может ли текущий пользователь комментировать запись (1 Ч может, 0 Ч не может)
    val groupsCanPost: Boolean = false,  //(integer, [0,1]) Ч информаци€ о том, могут ли сообщества комментировать запись
    val canClose: Boolean = false,      // Ч может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean = false         // Ч может ли текущий пользователь открыть комментарии к записи.
)