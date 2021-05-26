package org.object_class

data class Thread (   // »нформаци€ о вложенной ветке комментариев, объект с пол€ми:
    val count: Int = 0,// (integer) Ч количество комментариев в ветке.
    val items: Array<Comments>? = null, //Ч массив объектов комментариев к записи (только дл€ метода wall.getComments).
    val canPost: Boolean = false, //(boolean) Ц может ли текущий пользователь оставл€ть комментарии в этой ветке.
    val show_reply_button: Boolean = false, // (boolean) Ц нужно ли отображать кнопку Ђответитьї в ветке.
    val groups_can_post: Boolean = false // (boolean) Ц могут ли сообщества оставл€ть комментарии в ветке.
)