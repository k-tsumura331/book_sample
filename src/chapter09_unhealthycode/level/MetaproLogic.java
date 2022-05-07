package chapter09_unhealthycode.level;

import java.lang.reflect.Field;

public class MetaproLogic {
  void method() throws NoSuchFieldException, IllegalAccessException {
    Level level = Level.initialize();
    System.out.println("Level : " + level.value);

    Field field = Level.class.getDeclaredField("value");
    field.setAccessible(true);
    field.setInt(level, 999);

    System.out.println("Level : " + level.value);
  }
}
