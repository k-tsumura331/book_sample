package chapter08_tightcoupling.util.v2;

import chapter08_tightcoupling.util.ViewSettings;

class ViewCustomizing {
  private final ViewSettings viewSettings;  // 画面表示設定
  ViewCustomizing() {
    viewSettings = new ViewSettings();
  }
  // 中略
  void darkMode() {
    // viewSettingsを使ったダークモード表示への変更処理
  }
}
