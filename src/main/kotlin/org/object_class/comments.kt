package org.object_class

data class Comments(                  //object  ���������� � ������������ � ������, ������ � ������:
    val count: Int = 0,                //(integer) � ���������� ������������
    val canPost: Boolean = false,         //* (integer, [0,1]) � ���������� � ���, ����� �� ������� ������������ �������������� ������ (1 � �����, 0 � �� �����)
    val groupsCanPost: Boolean = false,  //(integer, [0,1]) � ���������� � ���, ����� �� ���������� �������������� ������
    val canClose: Boolean = false,      // � ����� �� ������� ������������ ������� ����������� � ������
    val canOpen: Boolean = false         // � ����� �� ������� ������������ ������� ����������� � ������.
)