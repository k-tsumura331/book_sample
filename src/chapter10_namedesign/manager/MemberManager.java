package chapter10_namedesign.manager;

// メンバーを管理するクラス
public class MemberManager {
  // メンバーのヒットポイントを取得する。
  int getHitPoint(int memberId) { return 0; }

  // メンバーの魔法力を取得する。
  int getMagicPoint(int memberId) { return 0; }

  // メンバーの歩行アニメーションを開始する。
  void startWalkAnimation(int memberId) {  }

  // メンバーの能力値をCSV出力する。
  void exportParamsToCsv() {  }

  // 敵が生存してるかどうかを返す。
  boolean enemyIsAlive(int enemyId) { return true; }

  // BGMを再生する。
  void playBgm(String bgmName) {  }
}
