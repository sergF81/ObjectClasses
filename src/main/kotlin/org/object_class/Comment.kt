package org.object_class

data class Comment (
        val id:Int = 0, // integer	идентификатор комментария.
        val fromId: Int = 0, // integer	идентификатор автора комментария.
        val date: Int = 0, //integer	дата создания комментария в формате Unixtime.
        val text: String = "", // string	текст комментария.

        val replyToUser: Int = 0, // integer	идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
        val replyToComment: Int = 0, // integer	идентификатор комментария, в ответ на который оставлен текущий (если применимо).
        val attachments: Int = 0, // object	медиавложения комментария (фотографии, ссылки и т.п.). Описание массива attachments находится на отдельной странице.
        val parentsStack: Array<Int>? = null, //массив идентификаторов родительских комментариев.
        val thread: Thread = Thread(),
    )