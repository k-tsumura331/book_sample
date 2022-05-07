package chapter01_failuredesigndigest.technicalname;

class MemoryStateManager {
  int intValue01;
  boolean state02;
  Memory[] eMemory;

  void changeIntValue01(int changeValue) {
    intValue01 -= changeValue;
    if (intValue01 < 0) {
      intValue01 = 0;
      updateState02Flag();
    }
  }

  void updateState02Flag() {
  }
}
