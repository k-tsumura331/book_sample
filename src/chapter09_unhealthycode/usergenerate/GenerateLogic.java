package chapter09_unhealthycode.usergenerate;

import java.lang.reflect.Constructor;

public class GenerateLogic {
  /**
   * クラス名を指定してインスタンス生成する
   * @param packageName パッケージ名
   * @param className インスタンス生成したいクラス名
   * @return 指定したクラスのインスタンス
   */
  static Object generateInstance(String packageName, String className) throws Exception {
    String fillName = packageName + "." + className;
    Class klass = Class.forName(fillName);
    Constructor constructor = klass.getDeclaredConstructor();
    return constructor.newInstance();
  }

  void callGenerate() throws Exception {
    User user = (User)generateInstance("customer", "User");
  }
}
