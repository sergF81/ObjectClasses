package org.object_class

import java.util.*

data class Donut (
    //���������� � ������ VK Donut:
    var is_donut: Boolean = false, // � ������ �������� ������ ������� ����������� VK Donut;
    var paid_duration: Int = 0, // � �����, � ������� �������� ������ ����� �������� ������ ������� ����������� VK Donut;
    var placeholder: Object = Object(), //  � �������� ��� �������������, ������� �� �������� �������� VK Donut. ������������ ������ ����������� ������.
    var can_publish_free_copy: Boolean = false, // � ����� �� ������� ������ ��� ���� �������������, � �� ������ ����������� VK Donut;
var edit_mode: String = "", // � ���������� � ���, ����� �������� VK Donut ����� �������� � ������. ��������� ��������:
var all: String = "��� ���������� � VK Donut.",
    var duration: String = "�����, � ������� �������� ������ ����� �������� ������ ������� ����������� VK Donut."
        )
