import pytest
# Test_Copilot_Adapter_R2.py

from Copilot_Adapter_R2 import Adaptee, Adapter, client_code  # ตรวจสอบให้แน่ใจว่าชื่อคลาสและฟังก์ชันถูกต้อง

def test_adapter():
    # Arrange
    adaptee = Adaptee()  # Adaptee คือคลาสที่มีการใช้งานโดย Adapter
    adapter = Adapter(adaptee)  # Adapter จะใช้ Adaptee ในการทำงาน
    
    # Act
    result = client_code(adapter)  # client_code จะใช้ Adapter ในการประมวลผล
    
    # Assert
    assert result == "Adapted request", "Adapter should return 'Adapted request' from adaptee's specific_request"


def test_adaptee():
    # Arrange
    adaptee = Adaptee()  # สร้างอินสแตนซ์ของ Adaptee
    
    # Act
    result = adaptee.specific_request()  # เรียกใช้ specific_request ของ Adaptee
    
    # Assert
    assert result == "Specific request", "Adaptee should return 'Specific request' when specific_request is called"
