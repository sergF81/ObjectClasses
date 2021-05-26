package org.object_class

data class Comment (
        val id:Int = 0, // integer	������������� �����������.
        val fromId: Int = 0, // integer	������������� ������ �����������.
        val date: Int = 0, //integer	���� �������� ����������� � ������� Unixtime.
        val text: String = "", // string	����� �����������.

        val replyToUser: Int = 0, // integer	������������� ������������ ��� ����������, � ����� �������� �������� ������� ����������� (���� ���������).
        val replyToComment: Int = 0, // integer	������������� �����������, � ����� �� ������� �������� ������� (���� ���������).
        val attachments: Int = 0, // object	������������� ����������� (����������, ������ � �.�.). �������� ������� attachments ��������� �� ��������� ��������.
        val parentsStack: Array<Int>? = null, //������ ��������������� ������������ ������������.
        val thread: Thread = Thread(),
    )